package dev.nvtruong.oop;

import dev.nvtruong.oop.io.*;
import dev.nvtruong.oop.model.Student;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileIoTest {
    @TempDir Path dir;

    @Test void solvesLegacyFileExercises() throws Exception {
        Path input = dir.resolve("input.txt");
        Path output = dir.resolve("output.txt");
        Files.writeString(input, "Hello oop", StandardCharsets.UTF_8);
        TextFileService.uppercase(input, output, StandardCharsets.UTF_8);
        assertEquals("HELLO OOP", Files.readString(output));

        Path studentsPath = dir.resolve("students.txt");
        StudentFileRepository repo = new StudentFileRepository(studentsPath, StandardCharsets.UTF_8);
        repo.save(List.of(new Student(1, "Ada", "Lovelace")));
        assertEquals("Ada Lovelace", repo.load().getFirst().fullName());

        Path ints = dir.resolve("ints.txt");
        Files.writeString(ints, "1 2\n3 4", StandardCharsets.UTF_8);
        assertEquals(10, IntegerFileSum.sum(ints, StandardCharsets.UTF_8));

        assertTrue(FileOperations.createFile(dir.resolve("new/file.txt")));
        assertFalse(FileOperations.createFile(dir.resolve("new/file.txt")));
    }

    @Test void calculatorValidatesDivisionByZero() {
        assertEquals(5, SafeCalculator.calculate(2, '+', 3));
        assertThrows(ArithmeticException.class, () -> SafeCalculator.calculate(2, '/', 0));
    }
}
