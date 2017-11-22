package com.ds;

import com.transferto.Student;

public class OneDArray {

	public static void main(String[] args) {
		
		int[] elements = new int[5];
		elements[0] = 10;
		elements[1] = 12;
		elements[2] = 5;
		elements[3] = 7;
		elements[4] = 2;
		
		for(int i=0;i<elements.length;i++){
			
			System.out.println("element: "+elements[i]);
			
		}
	
		//Array of Objects
		
		Student[] students = new Student[5]; 
		
		students[0]=new Student(1,"mr. a");
		students[1]=new Student(2,"mr. b");
		students[2]=new Student(3,"mr. c");
		students[3]=new Student(4,"mr. d");
		students[4]=new Student(5,"mr. e");
		
		for (Student student : students) {
			System.out.println("Student ("+student.getId()+" , "+student.getName()+")");
		}
		
		
	}

}
