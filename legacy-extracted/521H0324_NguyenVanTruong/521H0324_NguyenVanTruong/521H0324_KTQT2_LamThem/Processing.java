import java.util.ArrayList;
import java.util.List;

public class Processing {

    // (1) Find students with rank "A" or "Passed"
    public ArrayList<Student> findStudent(ArrayList<Student> lstStu) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : lstStu) {
            String rank = student.getRank();
            if (rank.equals("A") || rank.equals("Passed")) {
                result.add(student);
            }
        }
        return result;
    }

    // (2) Find the MathStudent object with max GPA
    public MathStudent findMaxMathStudent(ArrayList<Student> lstStu) {
        MathStudent maxMathStudent = null;
        for (Student student : lstStu) {
            if (student instanceof MathStudent) {
                MathStudent mathStudent = (MathStudent) student;
                if (maxMathStudent == null || mathStudent.getGpa() > maxMathStudent.getGpa()) {
                    maxMathStudent = mathStudent;
                }
            }
        }
        return maxMathStudent;
    }

    // (3) Find ITStudents with GPA >= class average GPA
    public ArrayList<ITStudent> findITStudentsAboveClassAvg(ArrayList<Student> lstStu) {
        double totalGpa = 0;
        int count = 0;
        for (Student student : lstStu) {
            if (student instanceof ITStudent) {
                totalGpa += student.getGpa();
                count++;
            }
        }
        double classAvgGpa = count > 0 ? totalGpa / count : 0;

        ArrayList<ITStudent> result = new ArrayList<>();
        for (Student student : lstStu) {
            if (student instanceof ITStudent && student.getGpa() >= classAvgGpa) {
                result.add((ITStudent) student);
            }
        }
        return result;
    }

    // (4) Find MathStudents with GPA >= MathStudent average GPA
    public ArrayList<MathStudent> findMathStudentsAboveMathAvg(ArrayList<Student> lstStu) {
        double totalGpa = 0;
        int count = 0;
        for (Student student : lstStu) {
            if (student instanceof MathStudent) {
                totalGpa += student.getGpa();
                count++;
            }
        }
        double mathAvgGpa = count > 0 ? totalGpa / count : 0;

        ArrayList<MathStudent> result = new ArrayList<>();
        for (Student student : lstStu) {
            if (student instanceof MathStudent && student.getGpa() >= mathAvgGpa) {
                result.add((MathStudent) student);
            }
        }
        return result;
    }
}