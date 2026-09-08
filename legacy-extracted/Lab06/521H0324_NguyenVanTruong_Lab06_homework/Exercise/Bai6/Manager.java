public class Manager{
    // - The additional attributes include position, department, and salary coefficient by position.
    private String ID;
    private String fullName;
    private int yearJoined;
    private int numDaysOff;// (number of days off in the month)
    private String position;
    private String department;
    private double coefficientsSalary;
    private double salaryCoefficientPosition;

    public Manager(){
        this.ID = "0";
        this.fullName = "";
        this.yearJoined = 2020;
        this.position = "head";
        this.department = "administrative office";
        this.coefficientsSalary = 1.0;
        this.salaryCoefficientPosition = 5.0;
    }

    public Manager(String ID, String fullName, double coefficientsSalary, 
                    String position, double salaryCoefficientPosition,
                    int yearJoined, int numDaysOff){
        this.ID = ID;
        this.fullName = fullName;
        this.coefficientsSalary = coefficientsSalary;
        this.position = position;
        this.salaryCoefficientPosition = salaryCoefficientPosition;
        this.yearJoined = yearJoined;
        this.numDaysOff = numDaysOff;
    }

    public String considerEmulation(){
        return "A";
    }

    public double bonusByPosition(){
        return 1150 * this.salaryCoefficientPosition;
    }

    public double getSalary(){
        return 1150 + 1150 * (this.coefficientsSalary + 1.0) + (1150 + 1150 *(coefficientsSalary + 1.0)) + bonusByPosition();
    }

    public String toString(){
        return "Manager{" + "ID= " + this.ID +"," + "Name= " + this.fullName + "," + "Position= " + this.position +"," + "Salary= " + getSalary() + "}";
    }
}