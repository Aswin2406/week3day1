package org.student;

import org.department.Department;

public class Student extends Department{
	
	
	
	public void studentname(String namex) {
		System.out.println(" mr.x:"+ namex);
	}
  public void studendept(String name) {
	  System.out.println(" mechanical:"+ name);
  }
  public void studentid(int id) {
	  System.out.println("898");
  }
  
  
  public static void main(String[] args) {
	Student std = new Student();
	std.collegename();
	std.collegecode();
	std.collegerank();
	std.department();
	std.studentname("mr.x");
	std.studentid(852);
	std.studendept("mech");
	
	
	
	
	
	
	
	
}
  
  
  
  
  
  
  
  
  
}
