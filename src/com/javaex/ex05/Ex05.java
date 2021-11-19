package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arra = new int[3];
		
		arra[0] = 3;
		arra[1] = 6;
		arra[2] = 9;
		
		int[] arrb = new int[3];
		
		
		
		 
		for(int i=0; i<arra.length; i++) {
			arrb[i] = arra[i];	
		}
		//arrb[1]
		
		for(int i=0; i<arra.length;i++) {
			System.out.println(arra[i]);
		}
		
		 System.out.println("=========================");
		 
		for(int i =0; i<arrb.length; i++)
		{
			arra[1] =100;
			System.out.println(arra[i]);
		}
		
		/*
		for(int i=0; i<arra.length; i++) {
			System.out.println(arra[i]);
		}
		*/
	}

}
