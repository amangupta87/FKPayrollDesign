import java.io.*;
import java.util.*;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class deleteEmployee{

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException{

		// Taking ID as input of employee which is to be deleted.
		System.out.println("Enter the id of employee to be deleted");
		Scanner in = new Scanner(System.in); 
		int id = in.nextInt();          // id to be deleted 

		JSONParser parser = new JSONParser();
		JSONArray arr = (JSONArray)parser.parse(new FileReader("employeesData.json"));
		int index = 0;

		for (Object obj : arr){
			JSONObject employee = (JSONObject) obj;
			Long employeeID =  (Long)(employee.get("employeeID"));
			int temp = (int)(id);
			if(employeeID == id){
				break;
			}
			index++;
		}

		arr.remove(index);                  // index of the employee who is to be deleted.
		FileWriter fileWriter = new FileWriter("employeesData.json");  
		fileWriter.write(arr.toJSONString());  
        fileWriter.flush();  
        fileWriter.close();  
	}	
}
