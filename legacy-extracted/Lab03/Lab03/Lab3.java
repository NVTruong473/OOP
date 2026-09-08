import java.util.*;
public class Lab3{
    public static void main(String [] args){
        int [] org = {1, 2, 3, 4, 5, 6};
        int [] copy = Arrays.copyOf(org, 3);
        int[] copy1 = Arrays.copyOfRange(org, 1, 6); //copy = [2, 3, 4, 5, 0];

        int[] org1 = {1, 2, 3, 4, 5, 6};
        String copy2 = Arrays.toString(org1);

        // System.out.println("Arrays:" + Arrays.toString(copy1));
        System.out.println("Arrays:" + copy2);

        int [] a = {5, 10, 30, 15, 25, 20, 35};
        Arrays.sort(a);
        System.out.println("Arrays:" + Arrays.toString(a));
        int index = Arrays.binarySearch(a, 20);
        System.out.println(index);


        // The class String

        // 1. length()
        String greeting = "hello";
        String greeting1 = new String("Hello");
        System.out.println(""+ greeting.length());
        System.out.println(""+ greeting1.length());

        // 2. charAt(int index)
        System.out.println(greeting1.charAt(1));

        // 3. compareTo(String str)
        System.out.println("Star".compareTo("star"));
        System.out.println("d".compareTo("abc"));
        System.out.println("abc".compareTo("abc"));

        // 4. concat(String str)
        System.out.println("Hello".concat(" world"));
        String greeting2 = "Hello";
        greeting2 += " world";
        System.out.println(greeting2);

        String string = "PI = " + 3.14;
        System.out.println(string);

        // 5. substring(int begin, int end)
        System.out.println(greeting2.substring(5, 11));

        // 6. indexOf(String str, int fromIndex)
        int index1 = greeting.indexOf('l', 2); // Searching for 'l' starting from index 4
        System.out.println("Index of 'l' in greeting starting from index 4: " + index1);

        // 7. replace(char oldChar, char newChar)
        System.out.println(greeting.replace("e","o"));

        // 8. equals(String str)
        if (greeting.equals(greeting))
            System.out.println(1);
        else
            System.out.println(0);

        // 9. split(String regex)
        System.out.println(Arrays.toString(greeting.split("e")));

        // 10. trim()
        System.out.println(greeting2.trim());

    }


}