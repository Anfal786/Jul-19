package test;

import p1.MySchool;
import p1.Trainer;

public class TestSchoolTrainer {
public static void main(String[] args) {
	MySchool s = new MySchool("BCK", 2000, "Kundapura");
	Trainer t = new Trainer("Guru", 40, 50000);
	System.out.println(s);
	System.out.println(t);
	
	LabTrainer lb = new LabTrainer("Aithal", 45, 60000, "CPP");
	System.out.println(lb);
	System.out.println(lb);
}
}
