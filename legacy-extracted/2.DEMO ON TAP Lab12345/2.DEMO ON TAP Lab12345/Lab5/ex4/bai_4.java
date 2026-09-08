public class bai_4 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println("Character at index " + i + ": " + ch);
            //
        }
        // n -> N'
        String newStr = str.replace('l', 'L');
        System.out.println(newStr);
    }
}
