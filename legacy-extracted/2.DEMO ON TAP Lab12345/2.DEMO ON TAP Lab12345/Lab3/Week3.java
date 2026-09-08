import java.util.Scanner;
import java.util.StringTokenizer;
class Week3
{
	static String getFN(String s)
	{
		StringTokenizer st = new StringTokenizer(s, " ");
		return st.nextToken();
	}
	static String getLN(String s)
	{
		StringTokenizer st = new StringTokenizer(s," ");
		String result = "";
		while (st.hasMoreTokens())
			result = st.nextToken();
		return result;
	}
	static int countWord(String s)
	{
		int c = 0;
		StringTokenizer st = new StringTokenizer(s, " ");
		while (st.hasMoreTokens())
		{
			++c;
			st.nextToken();
		}
		return c;
	}
	static String concat(String s, String cat)
	{
		StringBuffer bf = new StringBuffer(s);
		String result = bf.append(cat).toString();
		return result;
	}
	static boolean isPalindrome (String s)
	{
		StringBuffer bf = new StringBuffer (s);
		System.out.println(bf.substring(bf.length()-2, bf.length()-1));
		for(int i = 0; i<bf.length()/2; ++i)
			if (bf.substring (i,i+1).equals(bf.substring(bf.length()-1-i, bf.length()-i)) == false)
				return false;
		return true;
	}
	static String removeSpace(String s)
	{
		StringTokenizer st =  new StringTokenizer(s, " ");
		String result = "";
		while(st.hasMoreTokens())
		{
			result = result + st.nextToken() + " ";
		}
		return result.substring(0,result.length()-1);
	}
	static String removeSpace1 (String s)
	{
		StringBuffer bf = new StringBuffer(s);
		int i = 0;
		while (bf.substring(i,i+1).equals(" "))
		{
			bf.delete(i,i+1);
		}
		int j = bf.length()-1;
		while (bf.substring(j, j+1).equals(" "))
		{
			bf.delete(j,j+1);
			j= bf.length()-1;
		}
		while (i<bf.length()-1)
		{
			if(bf.substring(i,i+2).equals("  "))
				bf.delete(i,i+1);
			else
				++i;
		}
		return bf.toString();
	}
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		System.out.println(getFN(s));
		System.out.println(getLN(s));
		System.out.println(countWord(s));
		String cat = " is handsome";
		System.out.println(concat(s,cat));
		System.out.println(isPalindrome(s));
		s = "   ly             duc    ";
		System.out.println(removeSpace1(s));
	}
}