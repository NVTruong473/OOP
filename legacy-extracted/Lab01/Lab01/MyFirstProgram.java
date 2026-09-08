import java.util.*;

public class MyFirstProgram{
    public static void main(String [] args){
        // System.out.println("Hello");
        // int a=6;
        // int b=5;
        // int sum1 = a+b;
        // System.out.println("a+b=" + sum1);

        // int i = 0, sum2 = 0;
        // while(i<=10){
        //     sum2 = sum2 +i;
        //     i+=1;
        // }
        // System.out.println(sum2);

        // int sum3=0;
        // for(i =0;i<=10;i++){
        //     sum3 = sum3+i;
        // }
        // System.out.println(sum3);

        // int sum4=0;
        // i=0;
        // do{
        //     sum4 = sum4+i;
        //     i=i+1;
        // }while(i<=10);
        // System.out.println(sum4);

        // int x =11;
        // int y = 12;
        // if(x % 2 == 0)
        //     System.out.println(x +" la so chan");
        // else
        //     System.out.println(x +" la so le");

        // if(y % 2 == 0)
        //     System.out.println(x +" la so chan");
        // else
        //     System.out.println(x +" la so le");
        
        // if(x % 2 == 0)
        //     System.out.println("True");
        // else
        //     System.out.println("False");

        // if(y % 2 == 0)
        //     System.out.println("True");
        // else
        //     System.out.println("False");

        // int z = 10, m =20;

        // System.out.println(findMax(z, m));

        // System.out.print("Hello!");
        // System.out.print("Hello!");
        // System.out.print("Hello!");

        // int x1 = 100;
        // System.out.printf("\nInteger= %d", x1);
        // float n = 5;
        // System.out.printf("\nFloat= %.2f", n);
        // float n1 = 12345;
        // System.out.printf("\nFloat = %.2f", n1);


        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();

        System.out.println("Name:"+ name + "Age:"+ age);
    }


    public static int findMax(int a, int b){
        if (a > b)
            return a;
        else
            return b;
    }
}

