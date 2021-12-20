package com.socgen.emplmngt.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {
	
	
	
	public static Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
		
		Properties properties = loadPropertyFile();
		
		Connection connection = null;
		
		Class.forName(properties.getProperty("jdbc.classname"));
		connection = DriverManager.getConnection(properties.getProperty("jdbc.url"), 
				properties.getProperty("jdbc.username"), 
				properties.getProperty("jdbc.password"));
		
		return connection;
		
		
	}
	
	public static void closeConnection(Connection connection) throws SQLException {
		
		connection.close();
	}

	public static Properties loadPropertyFile() throws IOException {
		
		InputStream inputStream = DBUtils.class
				.getClassLoader()
				.getResourceAsStream("application.properties");
		
		Properties properties = new Properties();
		
		properties.load(inputStream);
		
		System.out.println(properties);
		return properties;
		
	}
}
