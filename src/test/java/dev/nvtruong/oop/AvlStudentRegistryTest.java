package dev.nvtruong.oop;

import dev.nvtruong.oop.avl.StudentRecord;
import dev.nvtruong.oop.avl.StudentRegistry;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AvlStudentRegistryTest {
    @Test void completesLegacyFinalExerciseIncludingUndoRedo() {
        StudentRegistry registry = new StudentRegistry();
        assertTrue(registry.addStudent(new StudentRecord(30, "C", 80)));
        assertTrue(registry.addStudent(new StudentRecord(20, "B", 90)));
        assertTrue(registry.addStudent(new StudentRecord(10, "A", 70)));
        assertTrue(registry.isBalanced());
        assertEquals("B", registry.searchStudentById(20).name());

        assertTrue(registry.removeStudent(20));
        assertNull(registry.searchStudentById(20));
        assertTrue(registry.undo());
        assertEquals("B", registry.searchStudentById(20).name());
        assertTrue(registry.redo());
        assertNull(registry.searchStudentById(20));

        assertEquals(List.of(70, 80), registry.scoreOrder().stream().map(StudentRecord::score).toList());
    }
}
