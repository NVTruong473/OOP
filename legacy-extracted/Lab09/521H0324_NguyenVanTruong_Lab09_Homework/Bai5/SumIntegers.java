import java.io.*;
import java.util.Scanner;

public class SumIntegers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("input.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {

            int sum = 0;
            while (sc.hasNextInt()) {
                sum += sc.nextInt();
            }

            bw.write(String.valueOf(sum));
            System.out.println("Sum written to output.txt: " + sum);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
