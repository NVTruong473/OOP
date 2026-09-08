public class ITStudent extends Student {
    private int sID;

    public ITStudent(String sName, double gpa, int sID) {
        super(sName, gpa);
        this.sID = sID;
    }

    @Override
    public String getRank() {
        if (gpa <= 5) return "C";
        else if (gpa > 5 && gpa <= 8) return "B";
        else return "A";
    }

    public int getsID() {
        return sID;
    }
}