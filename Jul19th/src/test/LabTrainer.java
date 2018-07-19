package test;



import p1.Trainer;

public class LabTrainer extends Trainer {
	String name;
	String Subject;
	public LabTrainer(String name, int age, double salary, String subject) {
		super(name, age, salary);
		this.name = name;
		Subject = subject;
	}
	@Override
	public String toString() {
		return "LabTrainer [name=" + name + ", Subject=" + Subject + ", salary=" + salary + "]";
	}
	public static void main(String[] args) {
		Trainer t = new Trainer("SAM", 56, 565656);
	}
	void m1()
	{
		double b = super.salary;
	}
}
