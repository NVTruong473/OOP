public class Developer extends Employee {
    public Developer(String name) {
        super(name);
    }
    @Override
    public String title() {
       return "Developer";
    }
}
