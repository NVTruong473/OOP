package dev.nvtruong.oop.avl;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;

/**
 * Completes the legacy StudentManagement exercise with command-style undo/redo.
 */
public final class StudentRegistry {
    private interface Change {
        void apply(StudentAvlTree tree);
        void revert(StudentAvlTree tree);
    }

    private record Add(StudentRecord student) implements Change {
        @Override public void apply(StudentAvlTree tree) { tree.insert(student); }
        @Override public void revert(StudentAvlTree tree) { tree.delete(student.id()); }
    }

    private record Remove(StudentRecord student) implements Change {
        @Override public void apply(StudentAvlTree tree) { tree.delete(student.id()); }
        @Override public void revert(StudentAvlTree tree) { tree.insert(student); }
    }

    private final StudentAvlTree tree = new StudentAvlTree();
    private final Deque<Change> undo = new ArrayDeque<>();
    private final Deque<Change> redo = new ArrayDeque<>();

    public boolean addStudent(StudentRecord student) {
        if (tree.contains(student.id())) return false;
        execute(new Add(student));
        return true;
    }

    public StudentRecord searchStudentById(int id) {
        return tree.search(id);
    }

    public boolean removeStudent(int id) {
        StudentRecord existing = tree.search(id);
        if (existing == null) return false;
        execute(new Remove(existing));
        return true;
    }

    public boolean undo() {
        if (undo.isEmpty()) return false;
        Change change = undo.pop();
        change.revert(tree);
        redo.push(change);
        return true;
    }

    public boolean redo() {
        if (redo.isEmpty()) return false;
        Change change = redo.pop();
        change.apply(tree);
        undo.push(change);
        return true;
    }

    public List<StudentRecord> preOrder() { return tree.preOrder(); }
    public List<StudentRecord> byId() { return tree.inOrder(); }
    public boolean isBalanced() { return tree.isBalanced(); }

    public List<StudentRecord> scoreOrder() {
        return tree.inOrder().stream()
                .sorted(Comparator.comparingInt(StudentRecord::score)
                        .thenComparingInt(StudentRecord::id))
                .toList();
    }

    private void execute(Change change) {
        change.apply(tree);
        undo.push(change);
        redo.clear();
    }
}
