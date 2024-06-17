//114.	Create a list of employees with name and
// salary fields. Write a comparator that sorts
// the employees by salary. Then, use this comparator
// to sort your list using the sort stream operation.
package lambda.Challenge114;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Challenge114 {
    public static void main(String[] args) {

        List<Employee> employeesList = Arrays.asList(new Employee("Ram", 700)
                , new Employee("Shyam", 300)
                , new Employee("Radhe", 1000)
                , new Employee("Siya", 900)
                , new Employee("Balraam", 400));

        System.out.println("==========Sorting using Old method - Comparator========");
//        Comparator<Employee> comp = new Comparator<Employee>() {
//            @Override
//            public int compare(Employee e1, Employee e2) {
//                return e1.getSalary() - e2.getSalary();
//            }
//        };

        Comparator<Employee> comp = (e1, e2) -> e1.getSalary() - e2.getSalary();
        employeesList.sort(comp);       //Collectors.sort()
        System.out.println(employeesList );

        System.out.println("==========Sorting using Comparator with streams========");
        List<Employee> listSortedAsPerSalary = employeesList.stream()
                .sorted((emp1,emp2) -> emp1.getSalary() - emp2.getSalary())
                .toList();
        System.out.println(listSortedAsPerSalary);

    }
}
























