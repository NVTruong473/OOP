package dev.nvtruong.oop.patterns;

import java.util.Objects;
import java.util.function.Predicate;

@FunctionalInterface
public interface Specification<T> {
    boolean isSatisfiedBy(T candidate);

    default Specification<T> and(Specification<T> other) {
        Objects.requireNonNull(other);
        return candidate -> isSatisfiedBy(candidate) && other.isSatisfiedBy(candidate);
    }

    default Specification<T> or(Specification<T> other) {
        Objects.requireNonNull(other);
        return candidate -> isSatisfiedBy(candidate) || other.isSatisfiedBy(candidate);
    }

    default Specification<T> not() {
        return candidate -> !isSatisfiedBy(candidate);
    }

    default Predicate<T> asPredicate() {
        return this::isSatisfiedBy;
    }
}
