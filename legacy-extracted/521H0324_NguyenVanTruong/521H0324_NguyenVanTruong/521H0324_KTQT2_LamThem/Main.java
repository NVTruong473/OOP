import java.util.ArrayList;
import java.util.List;


public class Main{
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new ITStudent("Truong", 9.2, 101));
        students.add(new ITStudent("Trieu", 7.5, 102));
        students.add(new ITStudent("Dat", 5.0, 103));
        students.add(new MathStudent("Hoa", 8.0, "M01"));
        students.add(new MathStudent("Truc", 4.9, "M02"));
        students.add(new MathStudent("Xuan", 6.5, "M03"));

        Processing processing = new Processing();

        // Test (1) Find students with rank "A" or "Passed"
        System.out.println("(1) Students with rank 'A' or 'Passed':");
        ArrayList<Student> rankAOrPassed = processing.findStudent(students);
        for (Student student : rankAOrPassed) {
            System.out.println(student.sName + " (" + student.getRank() + ")");
        }

        System.out.println("\n");

        // Test (2) Find the MathStudent object with max GPA
        MathStudent maxMathStudent = processing.findMaxMathStudent(students);
        if (maxMathStudent != null) {
            System.out.println("\n(2) MathStudent with max GPA: " + maxMathStudent.sName);
        }

        System.out.println("\n");

        // Test (3) Find ITStudents with GPA >= class average GPA
        System.out.println("\n(3) ITStudents with GPA >= class average:");
        ArrayList<ITStudent> itStudentsAboveAvg = processing.findITStudentsAboveClassAvg(students);
        for (ITStudent student : itStudentsAboveAvg) {
            System.out.println(student.sName);
        }

        System.out.println("\n");

        // Test (4) Find MathStudents with GPA >= MathStudent average GPA
        System.out.println("\n(4) MathStudents with GPA >= Math average:");
        ArrayList<MathStudent> mathStudentsAboveAvg = processing.findMathStudentsAboveMathAvg(students);
        for (MathStudent student : mathStudentsAboveAvg) {
            System.out.println(student.sName);
        }
    }
}