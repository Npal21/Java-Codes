package com.nidhipal;/*
PROBLEM STATEMENT:
                    A company is facing challenges in managing the information
        of its developers. The company needs a systematic approach to store, retrieve,
        update, and delete developer records efficiently. The current system lacks a
        structured architecture for handling data access operations, leading to
        scattered and error-prone code.
 */



public class Main {
    public static void main(String[] args) {

        DeveloperDao developerDao = new DeveloperDaoImpl();

        //Printing the list of all developers
        for (Developer developer : developerDao.getAllDevelopers()) {
            System.out.println(developer);
        }

        //Getting developer using id
        Developer developer1 = developerDao.getDeveloper(1);
        System.out.println(developer1);

        //Updating name of developer at index 1
        Developer developer2 = developerDao.getAllDevelopers().get(2);
        developer2.setDeveloperName("Radha");
        developerDao.updateDeveloper(developer2);

        //Deleting a developer

        //Developer newDev = new Developer("Chittachor",3);
        //list.add(newDev);===================
//        developerDao.deleteDeveloper(newDev);
//        System.out.println("The updated database: ");
//        for (Developer developer : developerDao.getAllDevelopers()) {
//            System.out.println(developer);
//        }




    }

}
/*
OUTPUT
Developer{name='Nidhi', id=0}
Developer{name='Raghav', id=1}
Developer{name='Madhav', id=2}
Developer{name='Raghav', id=1}
Developer 2 got updated in the database.
 */