package com.deloitte.Lab9;

import java.util.function.Supplier;

public class lab9ex4 {
	
	public static class Person{
		private String name;
	    private int age;
	    public Person() {
            this.name = "Unknown";
            this.age = 0;
        }
	    
	    
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public int getAge() {
	        return age;
	    }
	
	public void setAge(int age) {
        this.age = age;
    }
	public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
	
	public static void main(String[] args) {
		 Supplier<Person> personSupplier = Person::new; 
	        Person person = personSupplier.get();
	        
	        person.displayInfo();
	        person.setName("sonu");
	        person.setAge(10);
	        person.displayInfo();  
    }

	
}




