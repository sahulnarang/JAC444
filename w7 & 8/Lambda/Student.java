package Lambda;

public class Student {
	String firstName;
	String lastName;
	double grade;
	String department;
	
	Student(String a, String b, double c, String d)
	{
		firstName =a;
		lastName =b;
		grade =c;
		department =d;
	}
	
	public void setfirstName(String s) {
		this.firstName = s;
	}
	public void setlastName(String s) {
		this.lastName = s;
	}
	public void setGrade(double s) {
		this.grade = s;
	}
	public void setDepartment(String s) {
		this.department = s;
	}
	
	public String getName() {
		return this.firstName + "\t" + this.lastName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	public double getGrade() {
		return this.grade;
	}
	
	public String toString() {
		return getName() + "\t" + getGrade() + "\t" + getDepartment();
	}
	
	public boolean equals(final Object obj) {
		if (obj == null) {
            return false;
         }
         final Student std = (Student) obj;
         if (this == std) {
            return true;
         } else {
            return (this.firstName.equals(std.firstName) );
         }

	}
	
}
