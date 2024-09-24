 package javabean;
import java.util.Scanner;
public class EmployeeMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		
		Employee emp = new Employee();
		
		System.out.println("enter id");
		int id =sc.nextInt();
		emp.setid(id);
		System.out.println("enter name");
		String name =sc.next();
		emp.setName(name);
		
	
		System.out.println("Employee id:"+emp.getid());
		System.out.println("Name:"+emp.getName());
	}

}
