public class stringDemo {
    // Ham kiem tra 1 ki tu co phai la nguyen am 
    public static boolean isVowel(char ch){
        //
        ch = Character.toLowerCase(ch);
        // Check if the character is a vowel 
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch=='u';
    }

    // to uppercase all vowel letters 
    public static String upperCaseAllVowel(String str) {
        // 
        String newStr = "";
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(isVowel(ch)==true) {
                if(Character.isLowerCase(ch)==true) {
                    ch = Character.toUpperCase(ch);
                }
            }
            newStr = newStr + ch; 
        }
        return newStr;
    } 

    // Solution 2: To convert string to Array-of-character
    public static String upperCaseAllVowel_V2(String str) {
        //
        char[] arr = str.toCharArray();
        // 
        String newStr="";
        for(int i=0; i<arr.length; i++) {
            char ch = arr[i];
            if(isVowel(ch)==true) {
                if(Character.isLowerCase(ch)==true) {
                    ch = Character.toUpperCase(ch);
                }
            }
            newStr = newStr + ch; 
        }
        return newStr;
    }

    // Solution 3: To convert string to Array-of-character
    public static String upperCaseAllVowel_V3(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }
        return new String(arr);
}
    // testing 
    public static void main(String[] agrs) {
        // 
        String str = "Nguyen Le Trong Tin";
        //String newString = upperCaseAllVowel(str);
        //String newString = upperCaseAllVowel_V2(str);
        String newString = upperCaseAllVowel_V3(str);

        System.out.println("new string: " + newString);
    }
} 

// Testing 
/*PS D:\demo\Lab5\ex5> javac stringDemo.java
PS D:\demo\Lab5\ex5> java stringDemo.java
new string: NgUyEn LE TrOng TIn
 */

 