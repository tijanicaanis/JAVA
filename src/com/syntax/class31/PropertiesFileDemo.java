package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileDemo {
public static void main(String[] args) throws IOException {
	//1.have file
	String filePath="/Users/oksanavoronina/eclipse-workspace/JavaBasics/configs/Examples.properties";

	//2. bring object of FileInputStream();
	
	FileInputStream fileInput=new FileInputStream(filePath);
	
	//3.to handle data from property file we need to have properties class
	
	Properties prop =new Properties();
	prop.load(fileInput);
	String name=prop.getProperty("name");
	System.out.println(name);
	String city=prop.getProperty("city");
	System.out.println(city);
	
	Set<Object> keys=prop.keySet();
	for(Object k:keys) {
		System.out.println(k);
	}
	
	
}
}
