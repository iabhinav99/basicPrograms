package com.abhinav;

public class Test {

	
	@SuppressWarnings("null")
	public static void main(String[] args) {
        
		int countArray[]= new int[256];
		

		for (int i=0;i<256;i++) {
			
			countArray[i]=0;
		}
	    char name[]= {'a','b','c','d','a','c'};
	    
		for(int i=0;i<name.length;i++) {
			int ASCII_v=name[i];
			System.out.println("ASCII value of "+name[i]+" is "+ASCII_v);
		}
	
		
		for(int i=0;i<name.length;i++) {
			if(countArray[name[i]]==1) {
				System.out.println("Duplicate found "+name[i]);
				//break;
			}
			else {
				countArray[name[i]]++;
				System.out.println(countArray[name[i]]);
			}
		}
		

	}

}
