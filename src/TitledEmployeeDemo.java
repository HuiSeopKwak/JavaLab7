
public class TitledEmployeeDemo {
	public static void main(String[] args) {
		
		TitledEmployee whjeon, yksuh;
		
		yksuh = new TitledEmployee();
		whjeon = new TitledEmployee();
		
		yksuh.setName("Young-Kyoon Suh");
		whjeon.setName("Woohyuck Jeon");
		yksuh.setTitle("CEO");
		whjeon.setTitle("Director");
		
		System.out.println("yksuh's title and name:" + yksuh.getName());
		System.out.println("whjeon's name: " + whjeon.getName());
		System.out.println();
		
		showEmployee(yksuh);
		
		System.out.println();
		
		System.out.println("whjeon invoked.");
		showEmployee(whjeon);
	}
	
	public static void showEmployee(SalariedEmployee emp) {
		System.out.println("Salary: " + emp.getSalary());
		System.out.println("Hire Date: " + emp.getHireDate());
	}
}

