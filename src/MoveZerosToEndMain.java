import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;

import NET.webserviceX.www.*;
import java.io.*;

public class MoveZerosToEndMain {

	//@WebServiceRef(wsdlLocation="http://www.webservicex.com/globalweather.asmx?WSDL")
	//static GlobalWeather gw;
	
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
		
		//System.out.print(cities);
		System.out.println("------");
		/*
		for(int i=0;i<cities.length;i++)
		{
			
		}
		*/
		
		//XML file
		try
		{		
			File inputFile = new File("c:\\temp\\cities.xml");
	        DocumentBuilderFactory dbFactory 
	           = DocumentBuilderFactory.newInstance();
	        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	        Document doc = dBuilder.parse(inputFile);
	        doc.getDocumentElement().normalize();
	         System.out.println("Root element :" 
	            + doc.getDocumentElement().getNodeName());
	         NodeList nList = doc.getElementsByTagName("Table");
	         System.out.println("----------------------------");
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	        	 System.out.println();
	            Node nNode = nList.item(temp);
	            //System.out.println("\nCurrent Element :" + nNode.getNodeName());
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               //System.out.println("Student roll no : " + eElement.getAttribute("rollno"));
	               System.out.println("Country : " 
	                  + eElement
	                  .getElementsByTagName("Country")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("City : " 
	               + eElement
	                  .getElementsByTagName("City")
	                  .item(0)
	                  .getTextContent());
	               /*
	               System.out.println("Nick Name : " 
	               + eElement
	                  .getElementsByTagName("nickname")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("Marks : " 
	               + eElement
	                  .getElementsByTagName("marks")
	                  .item(0)
	                  .getTextContent());
	               */   
	            }
	         }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
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
