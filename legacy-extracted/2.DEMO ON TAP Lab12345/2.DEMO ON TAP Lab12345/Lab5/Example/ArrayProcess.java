import java.util.Scanner;
class ArrayProcess
{
	static int[] nhap()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i<a.length; ++i)
			a[i] = sc.nextInt();
		return a;
	}
	static void xuat (int[] a)
	{
		for(int i = 0; i<a.length; ++i)
			System.out.print(a[i] + " ");
	}
	//array - a
	static int maxEven (int[] a)
	{
		int i;
		for (i = 0; i<a.length; ++i)
			if(a[i] % 2 == 0)
				break;
		if (i < a.length)//co phan tu chan
		{
			int m = a[i];
			for(i = i + 1; i<a.length; ++i)
				if (m < a[i] && a[i] % 2 == 0)
					m = a[i];
			return m;
		}
		else
			return -1;//ko co so chan
	}
	//array-b.
	static int minOdd(int[] a)
	{
		int i;
		for (i = 0; i<a.length; ++i)
			if(a[i] % 2 == 1)
				break;
		if (i < a.length)//co phan tu chan
		{
			int m = a[i];
			for(i = i + 1; i<a.length; ++i)
				if (m > a[i] && a[i] % 2 == 1)
					m = a[i];
			return m;
		}
		else
			return -1;//ko co so le.
	}	
	//array-c.
	static int sumMeMo (int[] a)
	{
		if (maxEven(a) == -1)
		{
			if (minOdd(a) == -1)
				return 0;
			else
				return minOdd(a);
		}
		else
		{
			if(minOdd(a) == -1)
				return maxEven(a);
			else
				return maxEven(a) + minOdd(a);
		}
	}
	//array-d.
	static int sumEven(int[] a)
	{
		int s = 0;
		for(int i = 0; i<a.length; ++i)
			if (a[i] % 2 == 0)
				s = s + a[i];
		return s;
	}
	//array-f:
	static int idxFirstEven (int[] a)
	{
		for(int i = 0;  i<a.length; ++i)
			if (a[i] % 2 == 0)
				return i;
		return -1;//ko co phan tu chan
	}
	
	public static void main(String[] arg)
	{
		int[] a= nhap();
		xuat(a);
		System.out.println();
		System.out.println("Max even: " + maxEven(a));
		System.out.println("Min odd: " + minOdd(a));
		System.out.println("SumMEMO: " + sumMeMo(a));
		System.out.println("Sum even: " + sumEven(a));
		System.out.println("First even: " + idxFirstEven(a));
	}
}