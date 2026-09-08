public class TestOverride{
    public static void main(String [] args){
        Employee emp = new Employee("Bob");
        Developer dev = new Developer("Alice");
        Employee emp1 = new Developer("Trudy");
        System.out.println(emp);
        System.out.println(dev);
        System.out.println(emp1);
    }
}