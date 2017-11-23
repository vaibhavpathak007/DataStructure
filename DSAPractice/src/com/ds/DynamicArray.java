package com.ds;

import java.util.Arrays;

public class DynamicArray<T> // this T is type whatever type we mention here is applicable to whole class. 
{  							 // <T> this makes class as Generic Type.
	
	private Object[] data;
	private int size;
	
	public DynamicArray() {
	this.size=0;
	this.data = new Object[1];
	}
	
	public int getLength(){
		return data.length;
	}
	
	public T get(int index){
		return (T) this.data[index];
	}
	
	public void put(Object element){
		checkAvilability(size+1);
		this.data[size] = element;
		size++;
	}
	
	private void checkAvilability(int atIndex)
	{
		int currentSize = getLength();
		if(atIndex > currentSize){
			data = Arrays.copyOf(data, currentSize*2);
		}
	}
	
}
