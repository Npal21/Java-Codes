//Create a priority queue of a custom class Student.
// Use a comparator to order by grade.

package in.kgcoding.challenge;


import java.util.Comparator;
import java.util.PriorityQueue;

class Student{
    String name;
    int grade;

    public Student(String name, int grade){
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "[" + name +" ,"+ grade + " ]";
    }
}

public class Challenge94 {
    public static void main(String[] args) {
        PriorityQueue<Student> studentQueue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getGrade() - o1.getGrade();
            }
        });

        studentQueue.offer(new Student("Kishori",20));
        studentQueue.add(new Student("Krishna",80));
        studentQueue.add(new Student("Radhe",100));
        studentQueue.add(new Student("Balram",65));
        System.out.println(studentQueue);

        System.out.println(studentQueue.poll());
        System.out.println(studentQueue.poll());
        System.out.println(studentQueue.poll());
        System.out.println(studentQueue.poll());


    }


}

