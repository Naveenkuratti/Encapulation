package javabean;

import java.util.Scanner;

public class PenMain {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Pen p = new Pen();

	p.setname("Tom");
	
	p.setCost(999);

	System.out.println("pen id;"+p.getCost());
	System.out.println("pen name:"+p.getname());
	
	
			
}
}
