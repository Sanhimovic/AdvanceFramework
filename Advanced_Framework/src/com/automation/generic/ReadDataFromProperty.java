package com.automation.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty implements Framework_Constants
{
	public static String getProperty(String key) throws IOException
	{
		Properties prop=new Properties();

		FileInputStream fis=new FileInputStream(PropertyPath);
		
		prop.load(fis);
		
		String property_data = prop.getProperty(key);
		
		return property_data;
	}
}