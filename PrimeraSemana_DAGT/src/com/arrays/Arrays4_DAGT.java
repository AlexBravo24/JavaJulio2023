package com.arrays;

public class Arrays4_DAGT {

	public static void main(String[] args) {
		int [] array = {1,2,3,4,5};
		int [] array2 = new int [5];
		
		for (int i = 0; i < array.length; i++) {
			array2[i] = array[array.length -1 - i];
		}
		
		
	}

}
