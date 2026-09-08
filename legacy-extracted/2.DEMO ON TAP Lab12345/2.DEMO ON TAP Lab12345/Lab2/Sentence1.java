import java.util.Scanner;
class Sentence1
{
	static int[] input()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i<a.length; ++i)
			a[i] = sc.nextInt();
		return a;
	}
	static void output(int[] a)
	{
		for(int i = 0; i<a.length; ++i)
			System.out.print(a[i] + " ");
	}
	//1.1 Find the index of an array element.
	static int find(int[] a, int x)
	{
		for(int i = 0; i<a.length; ++i)
			if(a[i] == x)
				return i;
		return -1;
	}
	//1.2 Remove a specific element from an array
	static int[] remove (int[] a, int x)
	{
		for(int i = 0; i<a.length; ++i)
			if(a[i] == x)
			{
				for(int j = i; j<a.length-1; ++j)
					a[j] = a[j+1];
				break;
			}
		int[] b = new int[a.length-1];
		for(int i = 0; i<b.length; ++i)
			b[i] = a[i];
		return b;
		//8 10 1 6 5 , gia su x = 10 -> 8 1 6 5 5
	}
	//1.3 Insert an element (specific position) into an array.
	static int[] insert(int[] a, int x, int pos)
	{
		int[] b = new int[a.length];
		if(pos >= 0 && pos <= a.length)
		{
			b = new int[a.length+1];
			for(int i  = a.length; i>pos; --i)
				b[i] = a[i-1];
			b[pos] = x;
			for(int j = pos-1; j>=0; --j)
				b[j] = a[j];
		}
		return b;
	}
	//1.4 Max
	static int max(int[] a)
	{
		int m = a[0];
		for(int i = 1; i<a.length; ++i)
			if(m < a[i])
				m = a[i];
		return m;
	}
	//1.5 Min: tu lam
	//1.6 Find the duplicate values of an array of integer values.
	static void duplicate(int[] a)
	{
		for(int i = 0; i<a.length; ++i)
			for(int j = i; j<a.length; ++j)
				if (j > i && a[i] == a[j])
					System.out.print(a[i] + " ");
	}
	public static void main(String[] arg)
	{
		int[] a = input();
		output(a);
		int x = 20;
		System.out.println("Index of " + x + " is " + find(a,x));
		x = 10;
		a = remove(a,x);
		output(a);
		x = 10;
		int pos = 1;
		a = insert(a,x,pos);
		System.out.println();
		output(a);
		System.out.println();
		System.out.println("Max = " + max(a));
		duplicate(a);
	}
	
}