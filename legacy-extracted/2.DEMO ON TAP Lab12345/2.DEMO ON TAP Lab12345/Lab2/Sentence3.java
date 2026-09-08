/*
1. Enter the full name.
2. Split the full name into first name and last name.
3. Capitalize the full name.
*/
import java.util.Scanner;
class Sentence3
{
	//1
	static String input()
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		return s;
	}
	//2.
	static String getFN(String s)
	{
		String[] a = s.split(" ");
		return a[0];
	}
	static String getLN(String s)
	{
		String[] a = s.split(" ");
		return a[a.length-1];
	}
	//3. 
	static String Capitalize(String s)
	{
		return s.toUpperCase();
	}
	public static void main(String [] arg)
	{
		String s = input();
		System.out.println("First Name: " + getFN(s));
		System.out.println("Last Name: " + getLN(s));
		System.out.println("Capitalize: " + Capitalize(s));
	}
}