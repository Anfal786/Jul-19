package p1;
public class Trainer {
	String name;
	private int age=7;
	protected double salary;
	
	public Trainer(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Trainer [Name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
}
