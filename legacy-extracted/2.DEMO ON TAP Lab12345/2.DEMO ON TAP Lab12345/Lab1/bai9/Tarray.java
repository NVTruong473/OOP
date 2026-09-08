import java.util.Scanner;

public class Tarray { 
    // Tim gia tri lon nhat cua mang 
    // public int max(int[] array)
    public int Tmax(int[] myArray) {
        // int max = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<myArray.length; i++) {
            if(myArray[i] > max) {
                max = myArray[i];
            }
        }
        return max;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Emnter the elements of the array:");
        int sz = sc.nextInt();
        int[] arr = new int[sz];

        for(int i=0; i<sz; i++) {
            arr[i] = sc.nextInt();
        }
        // Creat object m of Tarray
        Tarray m = new Tarray(); 
        System.out.println("Max value in the array is" + m.Tmax(arr));
    }
}
