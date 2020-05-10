// No need to run this file as this file is called in another files.

public class Employee{

	private int employeeID;
	private String employeeName;
	private String salaryType;
	private String methodOfPayment;
	private String partOfUnion;
	private int basicPay;
	private int hourlyRate;
	private int extraHours;
	private int commissionRate;
	private int amountOfSales;
	private int unionDues;
	private int duesRate;


	// Constructor
	public Employee(int employeeID , int basicPay , String employeeName , String salaryType , String methodOfPayment , String partOfUnion ){
		this.employeeID = employeeID;
		this.basicPay = basicPay;
		this.employeeName = employeeName;
		this.salaryType = salaryType;
		this.methodOfPayment = methodOfPayment;
		this.partOfUnion = partOfUnion;
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

	public int getHourlyRate(){
		return this.hourlyRate;
	}

	public int getExtraHours(){
		return this.extraHours;
	}

	public int getCommissionRate(){
		return this.commissionRate;
	}

	public int getAmountOfSales(){
		return this.amountOfSales;
	}

	public int getUnionDues(){
		return this.unionDues;
	}

	public int getDuesRate(){
		return this.duesRate;
	}

}