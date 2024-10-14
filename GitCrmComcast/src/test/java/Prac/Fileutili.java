package Prac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Fileutili {
	
	/*public String getData(String key) throws Exception
	{
		
	FileInputStream fis = new FileInputStream("C:\\Users\\pranesh\\Desktop\\Practice\\Data.properties");
	Properties pro = new Properties();
	pro.load(fis);
	String data = pro.getProperty(key);
	return data;
}*/
	public String getdatajson(String key) throws Exception
	{
		FileReader fir=new FileReader("C:\\Users\\pranesh\\Desktop\\Practice\\com.json");
		JSONParser parser=new JSONParser();
		Object ob=parser.parse(fir);
		JSONObject map=(JSONObject)ob;
		String data=map.get(key).toString();
		return data;
	}
}