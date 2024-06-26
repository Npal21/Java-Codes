package com.nidhipal;

public class Student {
	
	private int id;
	private String name;
	
	public Student(){
		
	}
    
	public Student(int id, String name){
		this.setName(name);
		this.setId(id);
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "[Student : Name = " + name + " ,ID = "+ id +"]\n";
		
	}	
	
}


