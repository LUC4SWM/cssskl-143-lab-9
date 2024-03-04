import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Comparable<Student>, Cloneable{
	private double gpa;
	private String name;
	
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}

	//Copy constructor
	public Student(Student student){
		this.name = student.name;
		this.gpa = student.gpa;
	}

	public double getGPA() {
		return gpa;
	}

	public void setGPA(double gpa) {
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student{" +
				"gpa=" + gpa +
				", name='" + name + '\'' +
				'}';
	}

	@Override
	public int compareTo(Student o) {
		return (int) (this.gpa - o.gpa);
	}

	@Override
	protected Object clone() {
		return new Student(this);
	}
}
