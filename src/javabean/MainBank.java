package javabean;

public class MainBank {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.setWithdrwal(10000);
		int withdrwal = b.getWithdrwal();
		b.setName("love");
		String name= b.getName();
		b.getGrade();
		int grade = b.getGrade();
		
		System.out.println("name:"+name);
		System.out.println("amount withdrwal:"+withdrwal);
		System.out.println("grade:"+grade);
		
	}

}
