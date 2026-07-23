package Assignment;

public class Student {
	int studentId;
	String studentName;
	String course;
	public void setDetails(int studentId,String studentName,String course) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.course=course;
	}
	public void displayDetails() {
		System.out.println("Student ID: "+studentId);
		System.out.println("Student Name: "+studentName);
		System.out.println("Course: "+course);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		obj.setDetails(101, "Rahul","Java Full Stack");
		obj.displayDetails();

	}

}
