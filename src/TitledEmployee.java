
public class TitledEmployee extends SalariedEmployee{
	String title;
	
	public TitledEmployee(String theName, Date theDate, double theSalary
			, String theTitle) {
		super(theName, theDate, theSalary);
		
		this.title = theTitle;
	}
	
	public TitledEmployee() {
		super();
		title = "";
	}
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getName() {
		return title + ", " + super.getName();
	}
	
//	public static void main(String[] args) {
//
//	}

}
