public class TestExample{
    public static void main(String [] args){
        Person person1 = new Person();
        Person person = new Person("truong", "TPHCM");

        Teacher teacher1 = new Teacher();
        Teacher teacher = new Teacher("Truong", "Binh Thuan", "OOP");

        Student student = new Student("Truong", "Binh Thuan", 9, 9, 8);

        System.out.println(person);
        System.out.println(teacher);
        System.out.println(student);


    }
}