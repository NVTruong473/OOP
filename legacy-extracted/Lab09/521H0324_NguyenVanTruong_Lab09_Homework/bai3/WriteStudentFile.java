import java.io.*;
import java.util.ArrayList;

class Student {
    String sName;
    String sID;
    double gpa;

    public Student(String sName, String sID, double gpa) {
        this.sName = sName;
        this.sID = sID;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return sName + " - " + sID + " - " + gpa;
    }
}

public class WriteStudentFile {
    public static <E> boolean writeFile(String path, ArrayList<E> lst) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (E item : lst) {
                bw.write(item.toString());
                bw.newLine();
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", "S01", 3.5));
        students.add(new Student("Bob", "S02", 3.8));

        if (writeFile("students.txt", students)) {
            System.out.println("Students written to file.");
        }
    }
}
