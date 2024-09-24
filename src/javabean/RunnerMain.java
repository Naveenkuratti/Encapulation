package javabean;

public class RunnerMain {
	public static void main(String[] args) {
		Runner r =  new Runner ();
		r.setId(66);
		int id = r.getId();
		r.setName("Divya");
		String name =r.getName();
		r.setSalary(55.3345);
		Double salary =r.getSalary();
		r.setCost(1033);
		float cost =r.getCost();
		System.out.println("id:"+id+"name:"+name+"salary:"+salary+"float"+cost);
	}

}

