package com.kuvar.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.kuvar.first.Student;


 // JDBC PROCEDURE:
//  1 Link jar file with your project
//  2 Load the driver
 // 3 Create Connection
//  4 Write SQL Statement to insert data
//  5 Execute Sql statement
//  6 Close connection
 
 

public class App {

	public static void main(String[] args) {
		
		Student sRef1 = new Student();
		sRef1.setAddress("288B");
		sRef1.setAge(10);
		sRef1.setName("Asis");
		sRef1.setPhone("8968510111");
		sRef1.setRoll(101);
		
		Student sRef2 = new Student(101,"Assis","8877799",12,"289B");
		
		System.out.println("sRef1 is:"+sRef1);
		System.out.println("sRef2 is:"+sRef2);
		
		try {
			
			// 2. LOAD the driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(">> Driver LOADED");
			
			
			//3. Create Connection
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost/kuvar","root","");
			System.out.println(">> Connection Created");
			
			// 4. Write Sql statement to insert data into database
			
			String sql = "insert into Student values(null, '"+sRef1.getName()+"', '"+sRef1.getPhone()+"','"+sRef1.getAge()+"','"+sRef1.getAddress()+"')";
					
			// 5. Execute SQL Statement
			
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate(sql);

			  if(i>0){
			System.out.println(">> "+sRef2.getName()+" Inserted in Table");
			  }else{
			System.out.println(">> "+sRef2.getName()+" Not Inserted in Table");
			
			  }
				
		    // 6. Close the Connection
				con.close();
				System.out.println(">> Connection Closed");
				
			}catch (Exception e) {
	     e.printStackTrace();	
	   }
	
}
}
