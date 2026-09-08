import java.util.Scanner;
class StringProcess
{
	//2-a
	static String shortName(String s)
	{
		String[] t = s.split(" ");
		return t[t.length-1] + " " + t[0];
	}
	//2-b:
	static String hastTagName(String s)
	{
		String[] t = s.split(" ");
		return "#" + t[t.length-1] + t[0];
	}
	//2-c:
	static String upperCaseVowel(String s)
	{
		String res = "";
		for(int i = 0; i<s.length(); ++i)
		{
			if(s.substring(i,i+1).equals("u") || s.substring(i,i+1).equals("e") || s.substring(i,i+1).equals("o") || s.substring(i,i+1).equals("a") || s.substring(i,i+1).equals("i"))
				res = res + s.substring(i,i+1).toUpperCase();
			else
				res = res + s.substring(i,i+1);
		}
		return res;
	}
	//2-a:
	static int countWord(String s)
	{
		String[] t = s.split(" ");
		return t.length;
	}
	//2-b:
	static int countSentence (String s)
	{
		int c = 0;
		for (int i = 0; i<s.length(); ++i)
			if (s.substring(i,i+1).equals(".") || s.substring(i,i+1).equals("?") ||s.substring(i,i+1).equals("!"))
				++c;
		return c;
	}
	//2-c
	static int countAppear(String p, String w)
	{
		int c = 0;
		for (int i = 0; i<= p.length()-w.length(); ++i)
			if (p.substring(i,i+w.length()).contains(w))
				++c;
		return c;
	}
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(shortName(s));
		System.out.println(hastTagName(s));
		System.out.println(upperCaseVowel(s));
		System.out.println("Number of words: " + countWord(s));
		System.out.println("Number of sentences: " + countSentence(s));
		String p, w;
		p = sc.nextLine();
		w = sc.nextLine();
		System.out.println("Number of words in the paragraph: " + countAppear(p,w));
	}
}