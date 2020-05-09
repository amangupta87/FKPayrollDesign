// No need to run this file as this file is called in another files.

public class Employee{

	private int employeeID;
	private String employeeName;
	private String salaryType;
	private String methodOfPayment;
	private String partOfUnion;
	private int basicPay;

	// Constructor
	public Employee(int employeeID , int basicPay, String[] args){
		this.employeeID = employeeID;
		this.basicPay = basicPay;
		this.employeeName = args[0];
		this.salaryType = args[1];
		this.methodOfPayment = args[2];
		this.partOfUnion = args[3];
	}

	public int getEmployeeID(){
		return this.employeeID;
	}

	public String getEmployeeName(){
		return this.employeeName;
	}

	public String getSalaryType(){
		return this.salaryType;
	}

	public String getMethodOfPayment(){
		return this.methodOfPayment;
	}

	public String getPartOfUnion(){
		return this.partOfUnion;
	}

	public int getBasicPay(){
		return this.basicPay;
	}

}