class P
{
	void m1(){
		System.out.println("Parent m1");
	}
}
class C extends P{
	void m1(int t) {
		System.out.println("Child m1");
	}
}
public class Inheritance {
	public static void main(String[] args) {
		P p = new C();
		p.m1();
	}
}
