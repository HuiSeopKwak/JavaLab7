
 public class IsADemo {
	
	public static void main(String[] args) {
		SalariedEmployee joe; 
		HourlyEmployee sam; 
		
		
		/****
		 * Fill your code.
		 * Create objects appropriate for joe and sam
		 */
	
		System.out.println("Is joe an object of SalariedEmployee or HourlyEmployee?");
		System.out.println("joe's longer name is " + joe.getName());
		System.out.println("showEmployee(joe) invoked.");
		showEmployee(joe);
		System.out.println();
		
		System.out.println("Is sam an object of SalariedEmployee or HourlyEmployee?");
		System.out.println("sam's longer name is " + sam.getName());
		System.out.println("showEmployee(sam) invoked.");
		showEmployee(sam);
	}
	
	public static void showEmployee(Employee empObj) {
		System.out.println(empObj);
	}
}
 
 