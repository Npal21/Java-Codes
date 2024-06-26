package com.nidhipal;

public class Developer {
    private String name;
    private int id;

    public Developer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getDeveloperId() {
        return id;
    }

    public void setDeveloperId(int id) {
        this.id = id;
    }

    public String getDeveloperName() {
        return name;
    }

    public void setDeveloperName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
