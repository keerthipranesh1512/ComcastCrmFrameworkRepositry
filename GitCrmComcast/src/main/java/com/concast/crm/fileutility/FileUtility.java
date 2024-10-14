package com.concast.crm.fileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * @author pranesh
 * contains fileutility methods
 */
public class FileUtility {
	/**
	 * reading from property file using key
	 * @param key
	 * @return
	 * @throws Exception
	 */
public String readDataFromProperties(String key) throws Exception
{
	FileInputStream fis=new FileInputStream("./configAppData/Data.properties");
Properties pro=new Properties();
pro.load(fis);
String data=pro.getProperty(key);

return data;

}
}
