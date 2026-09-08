package dev.nvtruong.oop.inheritance;

import java.util.Comparator;
import java.util.List;

public final class StudentProcessing {
    private StudentProcessing() {}

    public static List<Learner> passedOrA(List<Learner> students) {
        return students.stream()
                .filter(s -> s.rank().equals("A") || s.rank().equals("Passed"))
                .toList();
    }

    public static MathStudent maxMathStudent(List<Learner> students) {
        return students.stream().filter(MathStudent.class::isInstance).map(MathStudent.class::cast)
                .max(Comparator.comparingDouble(Learner::gpa)).orElse(null);
    }

    public static List<ITStudent> itStudentsAtOrAboveOwnAverage(List<Learner> students) {
        List<ITStudent> typed = students.stream().filter(ITStudent.class::isInstance)
                .map(ITStudent.class::cast).toList();
        double avg = typed.stream().mapToDouble(Learner::gpa).average().orElse(0);
        return typed.stream().filter(s -> s.gpa() >= avg).toList();
    }

    public static List<MathStudent> mathStudentsAtOrAboveOwnAverage(List<Learner> students) {
        List<MathStudent> typed = students.stream().filter(MathStudent.class::isInstance)
                .map(MathStudent.class::cast).toList();
        double avg = typed.stream().mapToDouble(Learner::gpa).average().orElse(0);
        return typed.stream().filter(s -> s.gpa() >= avg).toList();
    }
}
