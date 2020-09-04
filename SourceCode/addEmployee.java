import java.io.*;
import java.util.*;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class addEmployee{

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException{
		
		// Taking details of employee to be added in the data from command prompt. Note that this can be taken in json format also.
		System.out.println("Enter the name of employee which you want to add in the data");
		Scanner in1 = new Scanner(System.in); 
		String employeeName = in1.nextLine();

		System.out.println("Enter id of employee");
		Scanner in2 = new Scanner(System.in); 
		int employeeID = in2.nextInt();

		System.out.println("Enter salary type in capitals: HOURLY or FLAT or SALES");
		Scanner in3 = new Scanner(System.in); 
		String salaryType = in3.nextLine();

		System.out.println("Enter the method of payment which employee wants in capitals: POST or PICKUP or BANK");
		Scanner in4 = new Scanner(System.in); 
		String methodOfPayment = in4.nextLine();

		System.out.println("Is Employee part of union? Answer in capitals: YES or NO");
		Scanner in5 = new Scanner(System.in); 
		String partOfUnion = in5.nextLine();

		int basicPay = 0;
		if(!salaryType.equals("HOURLY")){
			System.out.println("Enter the basic pay salary of employee");
			Scanner in6 = new Scanner(System.in); 
			basicPay = in6.nextInt();
		}

		int unionDues = 0;
		int duesRate = 0;
		if(partOfUnion.equals("YES")){
			System.out.println("Enter the amount of dues employee pays weekly to the union");
			Scanner in7 = new Scanner(System.in); 
			duesRate = in7.nextInt();
		}

		int commissionRate = 0;
		int amountOfSales = 0;
		if(salaryType.equals("SALES")){
			System.out.println("Enter the percentage of commission employee receives on sales made by him/her");
			Scanner in8 = new Scanner(System.in); 
			commissionRate = in8.nextInt();
		}

		int hourlyRate = 0;
		int extraHours = 0;
		if(salaryType.equals("HOURLY")){
			System.out.println("Enter the rate which you receive per hour");
			Scanner in9 = new Scanner(System.in); 
			hourlyRate = in9.nextInt();
		}

		JSONObject newEmployee = new JSONObject();
		newEmployee.put("employeeID" , employeeID);
		newEmployee.put("employeeName" , employeeName);
		newEmployee.put("basicPay" , basicPay);
		newEmployee.put("salaryType" , salaryType);
		newEmployee.put("methodOfPayment" , methodOfPayment);
		newEmployee.put("partOfUnion" , partOfUnion);
		newEmployee.put("hourlyRate" , hourlyRate);
		newEmployee.put("extraHours" , extraHours);
		newEmployee.put("commissionRate" , commissionRate);
		newEmployee.put("amountOfSales" , amountOfSales);
		newEmployee.put("unionDues" , unionDues);
		newEmployee.put("duesRate" , duesRate);
		JSONParser parser = new JSONParser();
		JSONArray arr = (JSONArray)parser.parse(new FileReader("employeesData.json"));

		arr.add(newEmployee);
		FileWriter fileWriter = new FileWriter("employeesData.json");  
		fileWriter.write(arr.toJSONString());  
        	fileWriter.flush();  
        	fileWriter.close();  

	}
}
