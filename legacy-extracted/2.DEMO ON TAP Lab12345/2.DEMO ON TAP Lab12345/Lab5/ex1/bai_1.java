class bai_1 {
    public static void main(String[] agrs) {
        String s = "Nguyen Le Trong Tin";
        // Traverse the String in java 
        // Using toCharArray(): Convert string to array of character
        char[] ch = s.toCharArray();
        // Traverse the character array 
        for(int i=0; i<s.length(); i++) {
            if(ch[i] == 'n') {
                ch[i] = 'N';
            }
        }
        // Print s after convert 'n' to 'N'
        for(int i=0; i<s.length(); i++) {
            System.out.print(ch[i]);
        }
        System.out.println();
        // Convert array-of-char to string
        String str = "";
        for(int i=0; i<s.length(); i++) {
            String sc = Character.toString(ch[i]);
           str = str + sc;
        }
        System.out.println(str);
    }
}
/*PS D:\demo\Lab5\ex1> javac bai_1.java
PS D:\demo\Lab5\ex1> java bai_1.java
NguyeN Le TroNg TiN
NguyeN Le TroNg TiN
PS D:\demo\Lab5\ex1> 
 */ 