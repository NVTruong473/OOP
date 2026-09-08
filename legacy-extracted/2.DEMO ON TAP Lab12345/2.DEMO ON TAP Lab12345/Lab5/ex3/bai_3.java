import java.util.Scanner;

class bai_3{
    // 
    public static double getArea(int edgeAmount) {
        double edgeLength=3;
        double a=0;
        
        if (edgeAmount == 3)
            a = 0.433;
        else if(edgeAmount == 4) 
            a = 1;
        else if(edgeAmount == 5)
            a = 1.72; 
        else 
            a = 2.595;
        return (edgeLength*edgeLength) * a;
    }
    public static void main(String[] agrs) {
        // Nhap so luong dinh 
        Scanner sc = new Scanner(System.in);
        // 
        int edgeAmount = sc.nextInt();
        double area = getArea(edgeAmount);

        System.out.println("Area: " + area);
    }
}
// Testing 
/*PS D:\demo\Lab5\ex3> javac bai_3.java
PS D:\demo\Lab5\ex3> java bai_3.java
3
Area: 3.897
PS D:\demo\Lab5\ex3> javac bai_3.java
PS D:\demo\Lab5\ex3> java bai_3.java
4
Area: 9.0
PS D:\demo\Lab5\ex3> 
 */