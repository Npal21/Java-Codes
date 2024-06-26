package com.nidhipal;

import java.util.List;

public interface StudentDao {

	public Student getStudent(int id);
	public List<Student> getAllStudents();
	public void addStudent(Student student);
	public void deleteStudent(Student student);
	
	
}
