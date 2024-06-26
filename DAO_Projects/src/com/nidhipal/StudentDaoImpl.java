package com.nidhipal;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class StudentDaoImpl implements StudentDao{
	
	Student student = new Student();
	
	
	public static Connection databaseConnection() {
		Connection con = null;
		try{
			con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/mydatabase",
					"root","root");				
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
	

	@Override
	public Student getStudent(int id){
		String query = "select name from Student where id="+id;
		student.setId(id);
		
		try(Connection con = databaseConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);) {	
			
			rs.next();
			student.setName(rs.getString("name"));		
			
		} catch (Exception e) {
			System.out.println(e);
		}				
		return student;
	}

	

	@Override
	public void addStudent(Student student) {
		String query = "insert into Student values (?,?)";	//brackets must
		try(Connection con = databaseConnection()) {
			
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, student.getId());
			pst.setString(2, student.getName());
			int count = pst.executeUpdate();
			System.out.println(count + " Student added successfully in the database.");	
			pst.close();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}		
	}
	
	
	
	@Override
	public void deleteStudent(Student student) {	
		
		String query = "delete from Student where name = ?";	//Don't write as '?':Error-Parameter index out of range	
		try(Connection con = databaseConnection();
			PreparedStatement pst = con.prepareStatement(query);) {			
			
			pst.setString(1, student.getName());	//1 means first unknown
			int count = pst.executeUpdate();
			System.out.println(count + " Student deleted successfully from the database.");	
			
			
		} catch (Exception e) {
			System.out.println(e);
		}		
		
	}
	
	@Override
	public List<Student> getAllStudents() {
		List<Student> allStudents = new ArrayList<Student>();
		
		try(Connection con = databaseConnection();
			Statement st = con.createStatement())	{
			
			ResultSet rs = st.executeQuery("select * from Student");
			while(rs.next()) {
				allStudents.add(new Student(rs.getInt(1), rs.getString(2)));				
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		return allStudents;
	}


}
