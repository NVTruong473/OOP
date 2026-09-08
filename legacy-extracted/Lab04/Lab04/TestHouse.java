public class TestHouse{
    public static void main(String [] args){
        House house = new House("A02", 10, true, 100, 100000);
        House house1 = new House();

        System.out.println("Area: " + house.getArea());
        System.out.println("CostPerSquareMeter: " + house.getCostPerSquareMeter());
        System.out.println("HouseCode: " + house.getHouseCode());
        System.out.println("NumOfBedRooms: " + house.getNumOfBedRooms());
        System.out.println("Has swingming POOl: " + house.getHasSwingmingPool());
        System.out.println("Price: " + house.calculateSellingPrice());

    }
}