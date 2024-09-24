package javabean;

import java.util.Scanner;

public class MainPerson {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age:");
		int  age = sc.nextInt();
				Person p = new Person();
	
	
		 p.setAge(age);
		System.out.println("age:"+age);
		
	}

}
