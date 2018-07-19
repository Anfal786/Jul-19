package p1;
public class MySchool {
	String name;
	int noOfStudents;
	String city;
	public MySchool(String name, int noOfStudents, String city) {
		super();
		this.name = name;
		this.noOfStudents = noOfStudents;
		this.city = city;
	}
	@Override
	public String toString() {
		return "MySchool [name=" + name + ", noOfStudents=" + noOfStudents + ", city=" + city + "]";
	}
}
