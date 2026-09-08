package dev.nvtruong.oop.systems;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class Library {
    public record Book(String isbn, String title) {
        public Book {
            requireText(isbn, "isbn");
            requireText(title, "title");
        }
    }
    public record Member(String id, String name) {
        public Member {
            requireText(id, "id");
            requireText(name, "name");
        }
    }
    public record Loan(Book book, Member member, LocalDate borrowedOn, LocalDate dueOn) {}

    private final Map<String, Book> books = new HashMap<>();
    private final Map<String, Member> members = new HashMap<>();
    private final Map<String, Loan> activeLoansByIsbn = new HashMap<>();

    public void addBook(Book book) {
        if (books.putIfAbsent(book.isbn(), book) != null) throw new IllegalArgumentException("duplicate ISBN");
    }

    public void register(Member member) {
        if (members.putIfAbsent(member.id(), member) != null) throw new IllegalArgumentException("duplicate member");
    }

    public Loan borrow(String isbn, String memberId, LocalDate date, int loanDays) {
        if (loanDays <= 0) throw new IllegalArgumentException("loanDays must be positive");
        Book book = require(books.get(isbn), "book not found");
        Member member = require(members.get(memberId), "member not found");
        if (activeLoansByIsbn.containsKey(isbn)) throw new IllegalStateException("book already borrowed");
        Loan loan = new Loan(book, member, date, date.plusDays(loanDays));
        activeLoansByIsbn.put(isbn, loan);
        return loan;
    }

    public Loan returnBook(String isbn) {
        Loan loan = activeLoansByIsbn.remove(isbn);
        return require(loan, "book is not borrowed");
    }

    public boolean isAvailable(String isbn) {
        return books.containsKey(isbn) && !activeLoansByIsbn.containsKey(isbn);
    }

    private static <T> T require(T value, String message) {
        if (value == null) throw new IllegalArgumentException(message);
        return value;
    }

    private static void requireText(String value, String name) {
        Objects.requireNonNull(value);
        if (value.isBlank()) throw new IllegalArgumentException(name + " must not be blank");
    }
}
