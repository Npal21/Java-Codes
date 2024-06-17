package arrays;

import java.util.Scanner;

class Student{
    int roll;
    String name;
    int marks;
}

public class ArrayOfObjects {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2  = new Student();
        Student s3 = new Student();
        Student s4 = new Student();

        Scanner sc = new Scanner(System.in);
        //Array of students
        Student[] studentArray = new Student[3];
//        s1.roll = 1;
//        s1.name= "Ram Sharma";
//        s1.marks = 90;
//
//        s2.roll = 2;
//        s2.name= "Radha Kishori";
//        s2.marks = 100;
//
//        s3.roll = 3;
//        s3.name= "Krishna Radheshyam";
//        s3.marks = 80;

        //========MOST IMP STEP===================
        //Assigning object to the array: It won't do this on its own!!!
        studentArray[0] = s1;
        studentArray[1] = s2;
        studentArray[2] = s3;



        for(int i=0;i<studentArray.length;i++){
            System.out.println("=====================================");
            System.out.println("Enter roll number of student s"+(i+1)+": ");
            studentArray[i].roll = sc.nextInt();
            System.out.println("Enter name of student s"+i+1+": ");
            studentArray[i].name = sc.next();
            System.out.println("Enter marks of student s"+i+1+": ");
            studentArray[i].marks = sc.nextInt();

        }

        for(int i=0;i<studentArray.length;i++){
            System.out.println("=====================================");
            System.out.println("Details of student s"+(i+1)+": ");
            System.out.println("Roll no: "+studentArray[i].roll);
            System.out.println("Name: "+studentArray[i].name);
            System.out.println("Marks: "+studentArray[i].marks);
        }

        //foreach loop: It returns VALUE (not index) of EACH ELEMENT of an array
        System.out.println("=====================================");
        for(Student student : studentArray){
            System.out.println(student.roll + ":" + student.name + ":" + student.marks);
        }

    }
}

