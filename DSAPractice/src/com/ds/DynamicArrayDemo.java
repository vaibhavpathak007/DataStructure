package com.ds;

public class DynamicArrayDemo {

	public static void main(String[] args) {
		
		DynamicArray<Integer> da = new DynamicArray<Integer>();
		da.put(11);
		System.out.println("size is: "+da.getLength());
		da.put(12);
		System.out.println("size is: "+da.getLength());
		da.put(13);
		System.out.println("size is: "+da.getLength());
		da.put(13);
		System.out.println("size is: "+da.getLength());
		da.put(14);
		System.out.println("size is: "+da.getLength());
		
		for(int i=0; i<da.getLength(); i++){
			System.out.println("datum: "+da.get(i));
		}
		
	}

}
