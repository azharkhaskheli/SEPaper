
import java.io.FileNotFoundException; 
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
import java.util.LinkedHashMap; 
import java.util.Map; 
import java.io.PrintWriter; 
import java.util.Scanner;

public class JSONCreator {
public static void main(String args[])throws FileNotFoundException{
	Scanner sc=new Scanner(System.in);
	
	 JSONObject jo = new JSONObject();
	 System.out.println("*********************************");
	 System.out.println("Enter The Data to Add into JSON");
	 System.out.println("*********************************");
	 

	 System.out.print ("NAME ");
	 jo.put("name",sc.nextLine().toString());
	 
	 System.out.print ("CLASS ");
	 jo.put("class",sc.nextLine().toString());
	 
	 Map m = new LinkedHashMap(4);
	 
	 System.out.print ("ADDRESS ");
	 m.put("Address",sc.nextLine().toString());
	 System.out.print ("CITY ");
	 m.put("City",sc.nextLine().toString());
	 System.out.print ("PROVINCE ");
	 m.put("Province",sc.nextLine().toString());
	 System.out.print ("COUNTRY ");
	 m.put("Country",sc.nextLine().toString());
	 
	 jo.put("address", m);
	 
	  PrintWriter pw = new PrintWriter("JSONExample.json"); 
     pw.write(jo.toJSONString()); 
       
     pw.flush(); 
     pw.close();

	 System.out.print ("File Generated Succesfully !");
}
}
