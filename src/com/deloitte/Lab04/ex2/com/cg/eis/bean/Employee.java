package com.deloitte.Lab04.ex2.com.cg.eis.bean;

public class Employee {
	public int id;
	public String name;
	private String designation;
    private String insuranceScheme;
	public double salary;
	public Employee(int id, String name,double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
        return id;
	}
        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDesignation() {
            return designation;
        }

        public void setDesignation(String designation) {
            this.designation = designation;
        }

        public String getInsuranceScheme() {
            return insuranceScheme;
        }

        public void setInsuranceScheme(String insuranceScheme) {
            this.insuranceScheme = insuranceScheme;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        
    
    }

}
