package Prac;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Test4 {
public static void main(String[] args) throws Exception
{
	FileReader fir=new FileReader("C:\\Users\\pranesh\\Desktop\\Practice\\com.json");
	JSONParser par=new JSONParser();
	Object ob=par.parse(fir);
	JSONObject map=(JSONObject)ob;
	String Browser =map.get("browser").toString();
	String Url=map.get("url").toString();
	System.out.println(Url);
	System.out.println(Browser);
}
}
