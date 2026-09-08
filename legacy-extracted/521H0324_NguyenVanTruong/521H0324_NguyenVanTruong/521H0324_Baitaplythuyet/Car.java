public class Car {

    private int mileage;

    private String color;

    private String make;



    public Car(int mileage, String color, String make) {

        this.mileage = mileage;

        this.color = color;

        this.make = make;

    }



    public void accelerate() {

        System.out.println("Car is Accelerating");

    }



    public void printDescription() {

        System.out.println("Car Make: " + make);

        System.out.println("Car Color: " + color);

        System.out.println("Car Mileage: " + mileage);

    }

}

