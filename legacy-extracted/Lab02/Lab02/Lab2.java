import java.math.*;
import java.util.Arrays; // Import Arrays class to use Arrays.toString()

public class Lab2{
    // 1. Write a function public static int findMax(int arr[]) to find the maximum value
    // of an array.
    public static void findMax(int arr[]){
        int max = arr[0];
        for (int i = 0; i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("gia tri lon nhat trong mang arr la: "+max);
    }


    // 2. Write a function to find the minimum value of an array.
    public static void findMin(int arr[]){
        int min = arr[0];
        for (int i = 0; i<arr.length;i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("gia tri nho nhat trong mang arr la: "+min);
    }

    // 3. Write a function to sum all even numbers of an array.

    public static void sumEven(int arr[]){
        int sum = 0;
        for (int i =0; i<arr.length;i++){
            if(arr[i] % 2 == 0){
                sum = sum + arr[i];
            }
        }
        System.out.println("tong cac so chan trong mang arr la: "+sum);
    }

    // 4. Write a function to count how many specific elements are in an array.
    public static void countArr(int [] arr){
        int dem = 0;
        for(int x:arr){
            dem+=1;
        }
        System.out.println(dem);
    }
    // 5. Write a function to count how many prime numbers are in an array.
    public static void countPrime(int [] arr){
        int dem = 0;
        int tam = 0;
        for (int i=0; i<arr.length;i++){
            if (arr[i] == 1){
            }
            else{
                for(int j=1;j<arr[i];j++){
                    if(arr[i] % j == 0){
                        tam +=1;
                    }
                }
            if (tam == 1)
                dem +=1;
            }
            tam=0;
        }
        System.out.println(dem);
    }

    // 6. Write a function public static int find(int arr[], int k) to find the index of an
    // element k in an array, if the element doesn’t exist in an array return -1. (the first element index
    // is 0)
    public static int find(int arr[], int k){
        for(int i = 0;i<arr.length;i++){
            if (arr[i] == k)
                return i;
        }
        return -1;
    }

    // 7. Write a function public static void square(int arr[]) to square all elements of an
    // array.
    public static void square(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i] = (int) Math.pow(arr[i], 2);
        }
    }

    // 8. Write a function public static BigDecimal findMax(BigDecimal []arr) to find
    // the maximum value of a BigDecimal object array.
    public static BigDecimal findMaxDecimal(BigDecimal []arr1){
        BigDecimal max = arr1[0];
        for(BigDecimal x:arr1){
            if(x.compareTo(max) > 0)
                max = x;
        }
        return max;
    }

    // 9. Write a function public static int[] divisibleNumbers(int arr[], int k) to
    // find the elements divisible by k in an array. (Hint: You can use two loops to solve it. The first
    // loop is used to count how many possible elements. Create a new array with a length equal to the
    // number counted in the first loop. The second loop is used to put all possible elements into the
    // array. Ex: a = [1,2,3,4,5,6,7] with k = 2 → [2,4,6]).

    public static int[] divisibleNumbers(int arr[], int k){
        int dem =0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] % k == 0){
                dem+=1;
            }
        }
        int [] b = new int[dem];
        int tam = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] % k == 0){
                b[tam] = arr[i];
                tam =tam +1;
            }
        }

        // System.out.println(dem);
        return b;
    }

    // 10. Write a function to find the third largest element in an array.
    public static void thirdlargestelement(int arr[]){
        int max = arr[0];
        int max1=arr[0];
        int max2 = arr[0];

        for (int x : arr){
            if (x > max)
                max = x;
        }
        for(int x : arr){
            if((x > max1) && (x != max))
                max1 = x;
        }
        for(int x : arr){
            if(x > max2 && x != max && x != max1)
                max2 = x;
        }
        System.out.println(max2);

    }

    public static void main(String [] args){
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int k = 2;
        BigDecimal[] arr1 = {
            new BigDecimal("2.1"),
            new BigDecimal("3.1"),
            new BigDecimal("4.1"),
            new BigDecimal("5.1"),
            new BigDecimal("6.1"),
            new BigDecimal("7.1"),
            new BigDecimal("8.1"),
            new BigDecimal("9.1")
        };
        // 1.
        // findMax(arr);
        // 2.
        // findMin(arr);
        // 3.
        // sumEven(arr);
        // 4.
        // countArr(arr);
        // 5.
        // countPrime(arr);
        // 6.
        // find(arr, k);
        // System.out.println(find(arr, k));
        // // 7.
        // square(arr);
        // for(int i =0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        // 8.
        // findMaxDecimal(arr1);
        // System.out.println(findMaxDecimal(arr1));
        // // 9.
        // divisibleNumbers(arr, k);
        // System.out.println("Divisible numbers are: " + Arrays.toString(divisibleNumbers(arr, k)));
        thirdlargestelement(arr);

    }


}
