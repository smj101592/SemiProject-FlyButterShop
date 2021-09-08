package com.flybutter.mainpage.model.dao;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class mainPageDao {

	private Properties prop = new Properties();
	public mainPageDao() {
		
		
		String fileName = mainPageDao.class.getResource("/sql/mainpage/main-query.properties").getPath();
		System.out.println("fileName   " + fileName);
		try {
			prop.load(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
}