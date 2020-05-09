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

		System.out.println("Is Employee part of union? : Answer YES or NO");
		Scanner in5 = new Scanner(System.in); 
		String partOfUnion = in5.nextLine();

		System.out.println("Enter the basic pay salary of employee");
		Scanner in6 = new Scanner(System.in); 
		int basicPay = in6.nextInt();

		JSONParser parser = new JSONParser();
		JSONArray arr = (JSONArray)parser.parse(new FileReader("employeesData.json"));


		JSONObject newEmployee = new JSONObject();
		newEmployee.put("employeeID" , employeeID);
		newEmployee.put("employeeName" , employeeName);
		newEmployee.put("basicPay" , basicPay);
		newEmployee.put("salaryType" , salaryType);
		newEmployee.put("methodOfPayment" , methodOfPayment);
		newEmployee.put("partOfUnion" , partOfUnion);


		arr.add(newEmployee);
		FileWriter fileWriter = new FileWriter("employeesData.json");   // Add employee details to employeesData file
		fileWriter.write(arr.toJSONString());  
        fileWriter.flush();  
        fileWriter.close();  

	}
}
