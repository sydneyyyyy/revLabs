package com.revature.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/*
 * JDBC = Java Database Connectivity -> a java library with classes to connect to a database
 *  - with JDBC we can set up a connection that will use our RDS credentials
 *  - once we have that connection - we can make queries and execute statements
 *  
 * Steps:
 * 1. Add the JDBC dependency to our project (pom.xml)
 * 2. Set up a connection file using our credentials
 * 3. Refacter our DAOs (or create them) that will make calls to our database when needed
 * 		- DAO = Data Access Object - Objects meant for accessing data
 * 
 * Notable Interfaces of JDBC:
 * 
 * Connection Interface - represents established connections to our RDS -> the main gateway to interact with DB
 * 
 * Statement Interface - we won't use this (because it's not protected against SQL injection
 * 
 * Prepared Statement Interface -> Used to create SQL statements and Queries sanitizes input and protects them against SQL injection
 * 
 * Callable Statement Interface -> Used to call Stored Procedures
 * 
 * ResultSet Interface -> objects that represent the data returned from our sql statements or queries
 * 
 * */

/*
 * We are going to maintain and observe a single connection object
 * within this class. If no connection exists, we will create and return one.
 * If a connection does exists, we will return that. 
 * 
 * */

public class JDBCConnection {

	private static Connection conn = null;
	
	// Define a method to get the connection
	public static Connection getConnection() {
		
		try {
			// If a connection doesn't exist - make one
			if (conn == null) {
				
				/*
				 *'Hot-fix' to ensure that the driver loads correctly 
				 * when our application starts
				 * 
				 * */
				Class.forName("org.postgresql.Driver");
				
				// In order to establish a connection to our DB
				// We need our credentials
				// url (endpoint), username, password
				
				Properties props = new Properties();
				
				InputStream input = JDBCConnection.class.getClassLoader().getResourceAsStream("connection.properties");
				props.load(input);
				
				String url = props.getProperty("url");
				String username = props.getProperty("username");
				String password = props.getProperty("password");
				
				conn = DriverManager.getConnection(url, username, password);
				return conn;
				
			} else {
				
				return conn;
				
			}
			
		} catch (SQLException | IOException | ClassNotFoundException e) {
			
			e.printStackTrace();
			
		}
		
		
		
		return null;
	}
	
	// don't need in your final code 
	public static void main(String[] args) {
		
		Connection conn = JDBCConnection.getConnection();
		
		if (conn != null) {
			System.out.println("Connection Successful");
		} else {
			System.out.println("Connection unsuccessful");
		}
		
	}
	
	
	
	
	
}
