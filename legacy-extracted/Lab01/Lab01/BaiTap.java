import java.util.*;
public class BaiTap{
    // 1. Write a program to print your name, date of birth, and student ID from the keyboard.
    public static void thongtin(String name, String bd, String ID){
        System.out.println("Ho ten:" + name);
        System.out.println("\nNgay sinh:" + bd);
        System.out.println("\nID:" + ID);
    }

    // 2. Write a program to compute the area of a triangle with a height and base provided by the user.
    // area = 1/2 *base * height
    public static void Triangle(double base, double height){
        double area = 0;
        area = 1.0 / 2.0 * base * height;
        System.out.println("Area = " + area);
    }

    // 3. Write a function to return the remainder of a division.
    public static void remainder(int a, int b){
        int remainder;
        remainder = a % b;
        System.out.println(remainder);
    }

    // 4. Write a function to convert the temperature from Fahrenheit to Celsius and a function to
    // convert the temperature from Celsius to Fahrenheit.
    public static void converttemperature(double C){
        double F;
        F = 9.0/5.0 * C + 32;
        System.out.println(C + " do C =" +F + " do F");
    }

    // 5. Write a function to check whether a year is a leap year or not.
    public static void checkyear(int y){
        if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))
            System.out.println(y + " la nam nhuan");
        else
            System.out.println(y + " la nam khong nhuan");
    }

    // 6. Write a function to find the minimum between three numbers.
    public static void findMin(int n, int m, int p){
        if (n < m){
            if(n < p)
                System.out.println(n + " la so nho nhat trong 3 so "+ n + ","+ m + ","+ p);
            else
                System.out.println(p + " la so nho nhat trong 3 so " + n +"," + m + "," + p);
        } else{
            if(m < p)
            System.out.println(m + " la so nho nhat trong 3 so "+ n + ","+ m + ","+ p);
            else
            System.out.println(p + " la so nho nhat trong 3 so " + n +"," + m + "," + p);
        }

    // 7. Write a function that receives a character and check whether it is alphanumeric or not (Hint:
    // you should use ASCII code).
    // Digits ('0' to '9'): ASCII values from 48 to 57.
    // Uppercase letters ('A' to 'Z'): ASCII values from 65 to 90.
    // Lowercase letters ('a' to 'z'): ASCII values from 97 to 122.
    // public static void checkCharacter(char d){
    //     if ((d >= 'A' && d <= 'Z') || (d >= 'a' && d <= 'z')) {
    //         System.out.println(d + " la chu");
    //     } else if (d >= '0' && d <= '9') {
    //         System.out.println(d + " la so");
    //     } else {
    //         System.out.println(d + " khong phai chu hay so");
    //     }
    // }

    // 8. Write functions to calculate the below formulas with n provided by the user (each formula is
    // one function):

    // a. 𝑆 = 1 + 2 + 3 + ⋯ + 𝑛
    // b. 𝑃 = 1 × 2 × 3 × … × 𝑛
    public static void caculate(int n){
        // a. 𝑆 = 1 + 2 + 3 + ⋯ + 𝑛
        double Sa = 0, Pb = 1, Sc = 0, Sd = 0, Se = 1;
        for (int i = 0; i <= n; i++){
            Sa = Sa + i;
        }
        System.out.println("a. S="+Sa);
        // b. 𝑃 = 1 × 2 × 3 × … × 𝑛
        for(int i=1; i<=n; i++){
            Pb= Pb * i;
        }
        System.out.println("b. P="+Pb);

        // c. 𝑆 = 1 + 2^1 + 2^2 + ... 2^n
        for(int i = 0;i<=n;i++){
            Sc = Sc + Math.pow(2,i);
        }
        System.out.println("c. S="+Sc);

        // d. 𝑆 = 1 + 2^1 + 2^2 + ... 2^n
        for(int i = 0;i<=n;i++){
            Sd = Sd + 1.0/2.0*n;
        }
        System.out.println("d. S="+Sd);

        // e.0^2 + ... + n^2
        for(int i = 0;i<=n;i++){
            Se = Se + Math.pow(i,2);
        }
        System.out.println("d. S="+Se);
    }

    // 9. Write a function that displays the Hailstone sequence:
    // • With some positive number (n > 0):
    // 1. If n is an even number, divide by 2.
    // 2. If n is an odd number, multiply it by 3 and add 1.
    // 3. Repeat the two steps above until n equals 1.

    public static void Hailstone(int n){
        while (n > 1){
            if (n % 2 == 0){
                n = n / 2;
                System.out.println(n*2 + " la so chan vi vay n / 2 = " + n);
            }else {
                System.out.println(n + " la so le vi vay n * 3 + 1 = " + n);
                n = n * 3 + 1;
            }
        }

    }

    // 10. Write a function to sum the first digit and the last digit of a number.
    public static void sumFirstLast(int n){
        int sum = 0;
        int n1 = n;
        int n2 = n;
        while (n1>=10){
            n1 = n1 % 10;
        }

        while(n2>=10){
            n2 = n2 /10;
        }

        sum = sum + n1 + n2;
        System.out.println("Tong so dau va so cai cua " + n + "la:" + sum);
    }

    // 11. Write a function to count the number of digits in a number.
    public static void countNumber(int n){
        int n1 = n;
        int dem = 0;
        while(n1>0){
            n1 = n1 / 10;
            dem+=1;
        }
        System.out.println(n + " co do dai la:" + dem);
    }

    // 12. Write a function to reverse the input integer number.
    public static void reverseNumber(int n){
        int kq = 0;
        int n1 = n;
        while(n1>0){
            int tam = n1 % 10;
            kq = kq * 10 + tam;
            n1 = n1 /10;
        }
        System.out.println(n + " dao nguoc la: " + kq);

    }

    // 13. Write a function to check whether a number is a palindrome or not.
    public static void palindrome(int n){
        int kq = 0;
        int n1 = n;
        while(n1>0){
            int tam = n1 % 10;
            kq = kq * 10 + tam;
            n1 = n1 /10;
        }

        if (n == kq)
            System.out.println(n + " la so palindrome");
        else
            System.out.println(n + " khong phai la so palindrome");
    }


    // 14. Write a program to simulate a vending machine. This is the output of the demo program, you
    // can use this output to build y

    public static void maybanhang() {
        Scanner sc = new Scanner(System.in);
        while (true) { // Keep the vending machine running until the user decides to exit
            System.out.println("1. Coca - $2");
            System.out.println("2. Pepsi - $2");
            System.out.println("3. Sprite - $2");
            System.out.println("4. Snack - $1");
            System.out.println("5. Shutdown machine");
            System.out.println("Nhap vao lua chon cua ban:");

            int e = sc.nextInt();

            if (e == 5) { // Exit option
                System.out.println("Shutdown the machine.");
                break; // Exit the loop
            }

            System.out.println("Moi nhap vao so tien cua ban:");
            int money = sc.nextInt();

            switch (e) {
                case 1: // Coca
                case 2: // Pepsi
                case 3: // Sprite
                    if (money >= 2) {
                        String drink = (e == 1) ? "Coca" : (e == 2) ? "Pepsi" : "Sprite";
                        System.out.println("Ban chon " + drink + " voi gia la 2$");
                        money -= 2;
                        System.out.println("Giao dich thanh cong\n");
                        System.out.println("So tien con lai cua ban la: " + money);
                    } else {
                        System.out.println("Ban khong du tien. Vui long nhap lai so tien.");
                    }
                    break;
                case 4: // Snack
                    if (money >= 1) {
                        System.out.println("Ban chon Snack voi gia la 1$");
                        money -= 1;
                        System.out.println("So tien con lai cua ban la: " + money);
                    } else {
                        System.out.println("Ban khong du tien. Vui long nhap lai so tien.");
                    }
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
                    break;
            }
        }

    }

    public static int factorial(int n){
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
    
        // 1.
        // String name = sc.nextLine();
        // String bd = sc.nextLine();
        // String ID = sc.nextLine();

        // thongtin(name, bd, ID);

        // 2.
        // double base = sc.nextDouble();
        // double height = sc.nextDouble();

        // Triangle(base, height);
 
        // 3.
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // remainder(a, b);

        // 4.
        // System.out.println("Nhap vao do C:");
        // double C = sc.nextDouble();
        // converttemperature(C);

        // // 5.
        // System.out.println("Nhap vao nam can kiem tra:");
        // int y = sc.nextInt();
        // checkyear(y);
    
        // // 6.
        // System.out.println("Nhap vao 3 so can kiem tra:");
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // int p = sc.nextInt();
        // findMin(n, m, p);
    
        // 7.
        // Sysytem.out.println("Nhap vao gia tri can kiem tra: ");
        // char d = sc.nextChar();
        // checkCharacter(d);
    
        // 8.
        System.out.println("Nhap vao n:");
        int n = sc.nextInt();
        // caculate(n);
        // 9.
        // Hailstone(n);
        // 10.
        // sumFirstLast(n);
    
        // 11.
        // countNumber(n);
    
        // 12.
        // reverseNumber(n);
    
        // 13.
        // palindrome(n);

        // 14.
        // maybanhang();
    
        System.out.println(factorial(n));
    }
}