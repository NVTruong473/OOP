class TestStudent
{
	public static void main(String[] arg)
	{
		Student s = new Student(1, "Phuoc", "Tran");
		System.out.println(s.toString());
		System.out.println(s.getName());
		s.setFN("Teo");
		System.out.println(s.toString());
	}
}