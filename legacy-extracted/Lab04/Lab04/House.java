public class House{

    // 4. Define a House class according to the following description.
    // • Attributes:
    // o houseCode: String – the code of the house for sale (default: “A01”)
    // o numOfBedRooms: int – number of bedrooms (default: 2)
    // o hasSwimmingPool: boolean (default: false)
    // o area: double (default: 0)
    // o costPerSquareMeter: double (default: 0)

    private String houseCode = "A01";
    private int numOfBedRooms = 2;
    private boolean hasSwingmingPool = false;
    private double area = 0;
    private double costPerSquareMeter = 0;
    
    // • Methods
    // o Constructor: default constructor, fully parameterized constructor.
    public House(){
        this.houseCode = "A01";
        this.numOfBedRooms = 2;
        this.hasSwingmingPool = false;
        this.area = 0;
        this.costPerSquareMeter = 0;
    }

    public House(String houseCode, int numOfBedRooms, boolean hasSwingmingPool, double area, double costPerSquareMeter){
        this.houseCode = houseCode;
        this.numOfBedRooms = numOfBedRooms;
        this.hasSwingmingPool = hasSwingmingPool;
        this.area = area;
        this.costPerSquareMeter = costPerSquareMeter;
    }

    public House(House house){
        this.houseCode = house.houseCode;
        this.numOfBedRooms = house.numOfBedRooms;
        this.hasSwingmingPool = house.hasSwingmingPool;
        this.area = house.area;
        this.costPerSquareMeter = house.costPerSquareMeter;
    }

    // o Getter, setter for all attributes.
    public String getHouseCode(){
        return this.houseCode;
    }

    public int getNumOfBedRooms(){
        return this.numOfBedRooms;
    }

    public boolean getHasSwingmingPool(){
        return this.hasSwingmingPool;
    }

    public double getArea(){
        return this.area;
    }

    public double getCostPerSquareMeter(){
        return this.costPerSquareMeter;
    }

    // o calculateSellingPrice(): double – calculate the selling price of the house
    // according to the following formula:
    public double calculateSellingPrice(){
        if (getHasSwingmingPool() == true)
            return this.area * this.costPerSquareMeter * (this.area * this.costPerSquareMeter* 10.0/100.0) * ((this.area * this.costPerSquareMeter* 10.0/100.0)* 15.0/100.0);
        return this.area * this.costPerSquareMeter * (15.0/100.0);
        
    }
    // ▪ SubTotal = area * costPerSquareMeter
    // ▪ If the house has a swimming pool, the subtotal will add 10% values of the
    // subtotal.
    // Selling price = SubTotal + 15% tax
    // ▪ Example: With the house having a swimming pool, area = 100,
    // costPerSquareMeter = 2500000, the subtotal is 275000000, and the selling
    // price is 316250000.


    public String toString(){
        return "House [" + houseCode + "," + numOfBedRooms + "," + hasSwingmingPool + "," + costPerSquareMeter + "]";
    }
    // o toString(): String – returns a string in the following format:
    // “House[houseCode, numOfBedRooms, hasSwimmingPool, sellingPrice]”
    // Define a class with the main method to test the above class.



}