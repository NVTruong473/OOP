// java Program to Illustrate Returning 
// simple built-in arrays 

// Importing input output classes 
import java.io.*; 

public class Tmax {
    // Method 1 
    // Tìm các phan tu BigDecimal chia het cho k 
    public static int[] findMax(int arr[], int k) {
        // Create array B to save the number divisible by k in array 
        int cnt = 0;
        int sz=0;
        // Calculate  element divisible by k 
        for(int i=0; i<arr.length; i++){
            if(arr[i] % k ==0) {
                cnt++;
            }
        }
        int[] B = new int[cnt];
        //int sz = 0;
        // Traverse arr to find ...
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%k==0) {
                B[sz] = arr[i];
                sz++;
            }
        }
        return B;
    }
    // Method 2 
    // Main driver method 
    public static void main(String[] args) {
        // Create array 
        int[] aArr = {1, 2, 3, 4, 5, 6};
        int k=2;
        // An integer array storing the returned array from the method 
        int[] sArr = findMax(aArr, k);
        // Display sArr array
        for(int i=0; i<sArr.length; i++) {
           System.out.println(sArr[i]);     
        }
    }

}
// Testing 
// Input: int[] aArr = {1, 2, 3, 4, 5, 6}
/* OUutput: 
PS D:\demo\Lab1\bai9> javac Tmax.java
PS D:\demo\Lab1\bai9> java Tmax.java
2
4
6 */ 