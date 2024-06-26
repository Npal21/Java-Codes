package com.nidhipal;

import java.util.ArrayList;
import java.util.List;

public class DeveloperDaoImpl implements DeveloperDao {

    //This list acts as database here
    List<Developer> developerList;

    //constructor
    public DeveloperDaoImpl(){
        developerList = new ArrayList<>();
        Developer dev1 = new Developer("Nidhi",0);
        developerList.add(dev1);
        Developer dev2 = new Developer("Raghav",1);
        developerList.add(dev2);
        Developer dev3 = new Developer("Madhav",2);
        developerList.add(dev3);

    }

    @Override
    public List<Developer> getAllDevelopers() {
        return developerList;
    }

    @Override
    public Developer getDeveloper(int id) {
        return developerList.get(id);
    }

    //update name using id
    @Override
    public void updateDeveloper(Developer developer) {

        developerList.get(developer.getDeveloperId())
                .setDeveloperName(developer.getDeveloperName());

        System.out.println("Developer "+ developer.getDeveloperId()
                + " got updated in the database.");
    }

    @Override
    public void deleteDeveloper(Developer developer) {

        developerList.remove(developer.getDeveloperId());
        System.out.println("Developer "+ developer.getDeveloperId()
                + " deleted from the database.");

    }
}
