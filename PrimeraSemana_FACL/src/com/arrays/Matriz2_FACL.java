package com.arrays;

import java.util.Scanner;


public class Matriz2_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		boolean INa, INb;
		
		String k,l;

	
		
		String MA [] [] = new String [3][5];
		String MB [] [] = new String [3][5];
		int MC [] [] = new int [3][5];
		
		for (int af=0;af<3;af++) {
			for(int ac=0;ac<5;ac++) {
				System.out.println("Inserte el componente de la Matriz"+"("+(af+1)+"),("+(ac+1)+")"+"A");
				MA[af][ac]=entrada.nextLine();
				}
		}
		
		for (int bf=0;bf<3;bf++) {
			for(int bc=0;bc<5;bc++) {
				System.out.println("Inserte el componente de la Matriz"+"("+(bf+1)+"),("+(bc+1)+")"+"B");
				MB[bf][bc]=entrada.nextLine();
				}
		}
		
		System.out.println("La matriz resultante es: ");

	int r,s;
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<5;j++) {
				
				k=(MA[i][j]);
				l=(MB[i][j]);
				
				

				
				INa= k.chars().allMatch( Character::isDigit );
				INb= l.chars().allMatch( Character::isDigit );
				
				if(INa==true && INb==true) {
					r=Integer.parseInt(k);
					s=Integer.parseInt(l);
					MC[i][j]=(r+s);
				}
				else {
					MC[i][j]=0;
				}
			}
		}
		
		for(int f=0;f<3;f++) {
			for(int c=0;c<5;c++) {
				System.out.print(MC[f][c]+" || ");
			}
			System.out.println();
		}
		
	
	}

}
