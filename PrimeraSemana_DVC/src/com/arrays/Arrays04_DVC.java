package com.arrays;

public class Arrays04_DVC {

	public static void main(String[] args) {
		int ar1  [] = {1,2,3,4,5};
		int ar2 []  = new int [5];
		int y = 0;

		for (int x = 4; x >= 0; x--) {
			ar2 [y] = ar1[x];
			y++;
		}
		
		for (int i:ar2){
			System.out.println(i);
		}
		
		
		
		
		
		
	}

}
