package javabean;

public class Main {
	public static void main(String[] args) {
		Driver d = new Driver();
		d.setId(22);
		int id =d.getId();
		d.setName("Naveen");
		String name =d.getName();
		
		
		System.out.println("id:"+id+"name:"+name);
		
		
	}

}
