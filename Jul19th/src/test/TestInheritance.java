package test;

class P 
{
	int a=1;
	void m1()
	{
		System.out.println("Parent");
	}
}
class C extends P 
{
	int a=2;
	void m1()
	{
		System.out.println("Child");
		super.m1();
	}
}


public class TestInheritance {
	public static void main(String[] args) {
		C c = new C();
		//((P)p).m1();
		System.out.println(((P)c).a);
		((P)c).m1();
		String s="MAK";
		sw

		
	}
}
