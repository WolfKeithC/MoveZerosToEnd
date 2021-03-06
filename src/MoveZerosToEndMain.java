import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import NET.webserviceX.www.*;
import java.io.*;

public class MoveZerosToEndMain {
	
	public static void main(String[] args) {
		System.out.println("Hello, this is Keith Wolf. Welcome to my first JAVA app at Disney.");
		
		int[] arr01 = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
		DisplayArray(arr01);
		System.out.println();
		int[] arr02 = MoveZerosToEnd.move(arr01);
		DisplayArray(arr02);
		System.out.println();
		ConnectAndDisplayDatabase();
		System.out.println("------");			
		String cities = "";
		GlobalWeatherLocator gwl = new GlobalWeatherLocator();
		GlobalWeatherSoap port = null;
		try
		{
			port = gwl.getGlobalWeatherSoap();
			cities = port.getCitiesByCountry("United States");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("------");
		
		try
		{
			XytechHelper.MakeAPICall();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("------");
		
		System.out.printf("GetMissing: %d", FindNumbers.GetMissing(new int[] { 9,2,3,4,1,2 } ));
		System.out.println();
		System.out.println("NumbersDivisibleBy: " + FindNumbers.NumbersDivisibleBy(new int[] { 108 }));
		
		System.out.println("------");
		
		try (PrintStream out = new PrintStream(new FileOutputStream("c:\\temp\\cities.xml"))) {
		    out.print(cities);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("------");
		
		try
		{
			if(port != null)
			{	
				String cityWeather = port.getWeather("Lihue, Lihue Airport", "United States");
				System.out.println(cityWeather);
			}
			else
			{
				System.out.println("empty weather");
			}				
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("------");
		
		String strTest = "tacocat";
		
		boolean isPalindrome = Palindrome.TestString(strTest);
		System.out.printf("Is %s a Palindrome? %s. It took %d cycles.", strTest, isPalindrome, Palindrome.Count()); 
		System.out.println("");
		
		strTest = "cat";
		Palindrome.Reset();
		isPalindrome = Palindrome.TestString(strTest);
		System.out.printf("Is %s a Palindrome? %s. It took %d cycles.", strTest, isPalindrome, Palindrome.Count());
		System.out.println("");
		System.out.println("------");
		
		//XML file
		//XMLHelper.XMLParser01();
		
		System.out.println("------");
	}
	
	public static void DisplayArray(int[] arr){
		for(int i=0;i<arr.length;i++)
		{
			if(i > 0)
				System.out.print(',');
			System.out.print(arr[i]);
		}
	}
	
	public static void ConnectAndDisplayDatabase()
	{
		try
		{		
			String url = "jdbc:sqlserver://datglv-qdbw28.swna.wdpr.disney.com\\virtual2:2045;databaseName=ntcdb04;integratedSecurity=true";
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection(url);
			System.out.println("connected");
			Statement statement = conn.createStatement();
	        String queryString = "select * from status where inactive_ind=0";
	        ResultSet rs = statement.executeQuery(queryString);
	        while (rs.next()) {
	           System.out.println(rs.getString(1) + "\t" + rs.getString(2));
	        }
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
