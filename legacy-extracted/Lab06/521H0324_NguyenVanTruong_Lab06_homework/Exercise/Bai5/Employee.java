public class Employee{
    private String ID;
    private String fullName;
    private int yearJoined;
    private double coefficientsSalary;
    private int numDaysOff; // number of days off in the month

    public Employee(){
        this.ID = "0";
        this.fullName = "";
        this.yearJoined = 2020;
        this.coefficientsSalary = 1.0;
        this.numDaysOff = 0;
    }

    public Employee(String ID, String fullName, double coefficientsSalary, int yearJoined, int numDaysOff){
        this.ID = ID;
        this.fullName = fullName;
        this.coefficientsSalary = coefficientsSalary;
        this.yearJoined = yearJoined;
        this.numDaysOff = numDaysOff;    
    }

    public double getSeniortySalary(){
        if ((2024 - this.yearJoined) >= 5)
            return (2024 - this.yearJoined) * 1150/ 100;
        else
            return 0;
    }

    public String considerEmulation(){
        if (numDaysOff <=1)
            return "A";
        else if(numDaysOff <= 3)
            return "B";
        else 
            return "C";
    }

    public double getSalary(){
        if (considerEmulation() == "A"){
            return 1150 + 1150 *(coefficientsSalary + 1.0);
        }
        else if (considerEmulation() == "B"){
            return 1150 + 1150 *(coefficientsSalary + 0.75);
        }
        else {
            return 1150 + 1150 *(coefficientsSalary + 0.5);
        }
    }

    public String toString(){
        return "Employee{" + "ID= " + this.ID + "," + "Name= " + this.fullName + "," + "Grade=" + considerEmulation() + "," + "Salary= " + getSalary() + "}";
    }
}