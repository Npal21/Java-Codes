package com.nidhipal;

import java.util.*;

public interface DeveloperDao {

    public List<Developer> getAllDevelopers();
    public Developer getDeveloper(int id);
    public void updateDeveloper(Developer developer);
    public void deleteDeveloper(Developer developer);

}
