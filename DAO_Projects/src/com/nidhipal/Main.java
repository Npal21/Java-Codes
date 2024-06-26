package com.nidhipal;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StudentDao studentDao = new StudentDaoImpl();
		
		//GETTING SINGLE STUDENT'S DETAILS FROM DATABASE
		Student s1 = studentDao.getStudent(1);
		System.out.println("\nFetching student with ID = 1 from database.. "+s1);
		
		System.out.println("\n===================================================================\n");
		Student s2 = studentDao.getStudent(19);
		System.out.println("Fetching student with ID = 19 from database.. "+s2);
		
		//ADDING STUDENT TO THE DATABASE
		Student s3 = new Student();
		System.out.println("\n==================================================================\n");
		System.out.print("Please enter name of student to add: ");
		s3.setName(sc.next());
		System.out.print("Please enter id of the above student: ");
		s3.setId(sc.nextInt());		
		studentDao.addStudent(s3);
		
		//REMOVING STUDENT FROM THE DATABASE
		Student s4 = new Student();
		System.out.println("\n==================================================================\n");
		System.out.print("Please enter name of student you want to delete: ");
		s4.setName(sc.next());	
		studentDao.deleteStudent(s4);
		
		//FETCHING ALL THE STUDENTS FROM DATABASE
		List<Student> listOfStudents = studentDao.getAllStudents();
		System.out.println("\n==================================================================\n");
		System.out.println("Displaying all the students: ");
		System.out.println(listOfStudents);
		
		sc.close();
		
	}

}

/* OUTPUT
Fetching student with ID = 1 from database.. [Student : Name = Indresh ,ID = 1]


===================================================================

Fetching student with ID = 19 from database.. [Student : Name = Radha ,ID = 19]


==================================================================

Please enter name of student to add: Nilakshi
Please enter id of the above student: 25
1 Student added successfully in the database.

==================================================================

Please enter name of student you want to delete: Mrityunjay
1 Student deleted successfully from the database.

==================================================================

Displaying all the students: 
[[Student : Name = Indresh ,ID = 1]
, [Student : Name = Radha ,ID = 19]
, [Student : Name = Nilakshi ,ID = 25]
, [Student : Name = Krishna ,ID = 33]
]

*/