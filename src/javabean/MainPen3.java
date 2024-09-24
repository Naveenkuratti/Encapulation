package javabean;

public class MainPen3 {
	public static void main(String[] args) {
		Pen3  p = new Pen3();
	    p.setPrice(44);
	    int price = p.getPrice();
	    System.out.println(price);
	    p.setName("amit");
	    String name = p.getName();
	    System.out.println(name);
	}

}
