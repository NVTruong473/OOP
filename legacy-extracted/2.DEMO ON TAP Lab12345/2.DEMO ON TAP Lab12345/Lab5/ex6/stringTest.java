public class stringTest {
    public static void main(String[] args) {
        String text = "Java is a versatile programming language.";
        String[] words = text.split(" ");
        // 
        for(String str : words) {
            System.out.println(str);
        }
    }

}