public class TestBai2{
    public static void main(String [] args){
        Person person = new Person("Truong", "Binh Thuan");
        System.out.println(person);

        Staff staff = new Staff("Truong", "binh Thuan", "TDTU", 111);
        System.out.println(staff);

        Student student = new Student("Truong", "Binh THuan", "java", 2024, 1234);
        System.out.println(student);

    }
}