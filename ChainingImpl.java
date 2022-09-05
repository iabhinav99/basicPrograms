package com.abhinav;

import java.util.ArrayList;
import java.util.LinkedList;

class myHash1{
	int BUCKET_SIZE=7;
	LinkedList<Integer> slot;
	ArrayList<LinkedList<Integer>>table;
	
	myHash1(){
		 System.out.println("inside constructor");
		table=new ArrayList<LinkedList<Integer>>();
		for(int i=0;i<BUCKET_SIZE;i++) {
			  slot=new LinkedList<Integer>();
			   //System.out.println("Before Adding.. \nHash table"+table);
			  // System.out.println("Table Slot"+slot);
			  
			   table.add(slot);
			   
			//System.out.println("After Adding.. \nHash table"+table);
			 //  System.out.println("Table Slot"+slot);	
		}
	}
	
	void insert(int key) {
		int index =key%BUCKET_SIZE;
		table.get(index).add(key);
	}
	
	void display() {
		for(int i=0; i<BUCKET_SIZE;i++) {
			System.out.println("Slot "+(i+1)+" "+table.get(i));
		}
	}
	
	boolean search(int key) {
		int index=key % BUCKET_SIZE;
		return table.get(index).contains(key);
	}
	
	void delete(int key) {
		int index=key % BUCKET_SIZE;
		table.get(index).remove((Integer)key);
	}
	
}

public class ChainingImpl {

	public static void main(String[] args) {
      myHash1 h1=new myHash1();
      h1.insert(42);
      h1.insert(49);
      h1.insert(13);
      h1.insert(56);
      h1.display();
      System.out.println(h1.search(13));
      h1.delete(56);
      System.out.println("After Deleting the 56 ....");
      h1.display();
 
   
		
	}

}
