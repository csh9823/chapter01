package com.javaex.ex05;

public class Ex03 {
	public static void main(String[] args) {
		/*
		int[] intarray = new int[4];// 갯수 3개
		
		intarray[0] =3;
		intarray[2] = 13;
		intarray[1] = 7;
		intarray[3] = 55;
		
		//System.out.println(intarray[1]);
		
		for(int i=0; i<intarray.length; i++) {
			System.out.println(intarray[i]);
		}
		*/
		
		
		int[] intarray = {3,7,13,55}; //같은 방법
		
		intarray[0] =3;
		intarray[2] = 13;
		intarray[1] = 7;
		intarray[3] = 55;
		
		System.out.println("======================");
		
		char[] chararray = new char[3];
		
		chararray[0] = 'A';
		chararray[1] = '한';
		chararray[2] = 'z';
		
		for(int i =0; i<chararray.length; i++) {
			System.out.println(chararray[i]);
		}
	}
	
}
