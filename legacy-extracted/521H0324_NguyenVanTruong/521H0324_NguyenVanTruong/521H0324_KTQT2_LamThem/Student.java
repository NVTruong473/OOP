public abstract class Student {
    protected String sName;
    protected double gpa;

    public Student(String sName, double gpa) {
        this.sName = sName;
        this.gpa = gpa;
    }

    public abstract String getRank();

    public String getsName() {
        return sName;
    }

    public double getGpa() {
        return gpa;
    }
}
