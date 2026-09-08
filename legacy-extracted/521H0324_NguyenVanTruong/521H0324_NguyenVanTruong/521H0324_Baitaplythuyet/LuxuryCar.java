public class LuxuryCar extends Car {

    public String perks;



    public LuxuryCar(int mileage, String color, String make, String perks) {

        super(mileage, color, make);

        this.perks = perks;

    }



    @Override

    public void accelerate() {

        System.out.println("Luxury Car is Accelerating");

    }



    @Override

    public void printDescription() {

        super.printDescription(); // Gọi phương thức từ lớp cha

        System.out.println("The Luxury Car is a: " + this.perks);

    }

}