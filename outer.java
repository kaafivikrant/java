package sj;

public class outer {
	static int a=10;
	static class s_inner 
	{
		public void show()
		{
			System.out.println(a);
			System.out.println("static member accessed by static inner class\n\n");
		}
		s_inner()
		{
			System.out.println("this is static inner class constructor\n");
		}
	}
	public class inner
	{
		public void show()
		{
			System.out.println(a);
			System.out.println("static member accessed by non-static inner class\n\n");
		}
		inner()
		{
			System.out.println("This is constructor of non-static inner class\n");
		}
	}
	
	
	public static void show()
	{
		System.out.println(a);
		System.out.println("This is static variable accessed by outer class\n\n");
		
	}
	


public static void main(String[] args) {
	
	outer.show();
	
	outer.s_inner i=new outer.s_inner();
	i.show();
	outer ob=new outer();
	outer.inner ob1=ob.new inner();
	ob1.show();
	

}

}


