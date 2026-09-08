public class Employee {
    protected String name = "";
    public Employee(String name) {
    this.name = name;
    }
    public String title() {
    return "Employee";
    }
    @Override
    public String toString() {
        return this.name + ": " + title();
    }
}
