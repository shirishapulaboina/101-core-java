package Assignment;

public class Employee {
	int employeeId;
	String employeeName;
	int salary;
	public void setEmployeeDetails(int employeeId,String employeeName,int salary) {
	   this.employeeId=employeeId;
	   this.employeeName=employeeName;
	   this.salary=salary;
		
		
	}
	public void showDetails() {
		System.out.println("employee Id: "+employeeId);
		System.out.println("employee Name: "+employeeName);
		System.out.println(employeeName+"Salary: "+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee();
		obj.setEmployeeDetails(1001, "Ravi", 45000);
		obj.showDetails();

	}

}
