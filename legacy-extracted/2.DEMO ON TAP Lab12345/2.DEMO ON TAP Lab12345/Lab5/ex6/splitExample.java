public class splitExample {
    // Main Method 
    public static void main(String args[]) 
    { 
      // Declare a String  
      String str = "Java is great. It is versatile! Do you like Java?"; 
        
      // Split the string with comma delimiter 
      String[] str1 = str.split(" "); 
        
      // Iterate through string 
      for(String str2 : str1)  
      { 
        // Printing the string 
        System.out.println(str2); 
      }
      
      System.out.println("Dem so tu: " + str1.length);
      // Dem so cau có trong text 
      String[] sentence = str.split("[.!?]+");
      System.out.println("So cau trong van ban: "+sentence.length);
    } 
}

// Testing 
/*PS D:\demo\Lab5\ex6>
PS D:\demo\Lab5\ex6> javac splitExample.java
PS D:\demo\Lab5\ex6> java splitExample.java
Java
is
great.
It
is
versatile!
Do
you
like
Java?
Dem so tu: 10
So cau trong van ban: 3 */