import java.math.*;

public class MyProgram{

    public static void sum(int[] a, int[] b){
        for (int i = 0; i<a.length;i++){
            System.out.println("a[" + i+ "]="+a[i]);
        }
        int sum = 0;
        for (int i = 0; i<a.length;i++){
            sum = sum + a[i];
        }
        System.out.println("Tong gia tri cua mang a la: "+sum);


        int sum2 = 0;
        for (int i = 0; i<b.length;i++){
            System.out.println("b[" + i+ "]="+b[i]);
        }
        for (int i = 0; i<b.length;i++){
            sum2 = sum2 + b[i];
        }
        System.out.println("Tong gia tri cua mang b la: "+sum2);
    }
    public static void main(String [] args){
        int [] a = {1, 2, 3, 4, 5};
        int [] b = new int[3];
        b[0] = 1;
        b[1] = 2;
        b[2] = 3;

        // sum(a, b);

        BigDecimal x = new BigDecimal(4);
        BigDecimal y = new BigDecimal(4);
        System.out.println(x == y);
        System.out.println(x.equals(y));

        System.out.println(x);
        System.out.println(y);
    }
}