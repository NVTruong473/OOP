public class PolymorphismTest {

    public static void main(String[] args) {

        // Tạo đối tượng Car
        Car objCar = new Car(80, "Red", "BMW");

        // Tạo đối tượng LuxuryCar
        LuxuryCar objLuxuryCar = new LuxuryCar(120, "Yellow", "Ferrari", "Sports Car");

        // Gọi phương thức của đối tượng Car
        objCar.accelerate();
        objCar.printDescription();

        System.out.println("\n");
        
        // Gọi phương thức của đối tượng LuxuryCar

        objLuxuryCar.accelerate();
        objLuxuryCar.printDescription();
    }
}