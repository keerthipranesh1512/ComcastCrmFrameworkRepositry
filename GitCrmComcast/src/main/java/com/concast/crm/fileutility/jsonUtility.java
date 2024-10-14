package com.concast.crm.fileutility;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * @author pranesh
 * contains common data 
 */
public class jsonUtility {
	/**
	 * reading data from json using key
	 * @param key
	 * @return
	 * @throws Exception
	 */
public String getDataFromJson(String key) throws Exception
{
	FileReader fir=new FileReader("./configAppData/Common.json");
	JSONParser parser=new JSONParser();
	Object obj=parser.parse(fir);
	JSONObject map=(JSONObject)obj;
	String data=(String) map.get(key);
return data;
}
}
