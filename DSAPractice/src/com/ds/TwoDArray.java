package com.ds;

public class TwoDArray {

	public static void main(String[] args) {
		
		int [][] element = new int[3][3];
		element[0][0]=0;
		element[0][1]=1;
		element[0][2]=2;
		element[1][0]=3;
		element[1][1]=4;
		element[1][2]=5;
		element[2][0]=6;
		element[2][1]=7;
		element[2][2]=8;
		
		System.out.println("Printing 2D Array:"+element.length);
		for(int i=0; i<element.length;i++){
			for(int j=0; j<element.length; j++){
				
				System.out.print(element[i][j]+" ");
				
			}
			System.out.println("\n");
		}
		
		
	}

}
