package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =(int)(Math.random()*45)+1;
		int num1 =(int)(Math.random()*45)+1;
		int num2 =(int)(Math.random()*45)+1;
		int num3 =(int)(Math.random()*45)+1;
		int num4 =(int)(Math.random()*45)+1;
		int num5 =(int)(Math.random()*45)+1;
		/*
		System.out.println(num);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
	    */
		int[] ball = new int[6];
		
		for(int i=0; i<6; i++) {
			ball[i] = (int)(Math.random()*45)+1;
		}
		/*
		ball[0] = (int)(Math.random()*45)+1;
		ball[1] = (int)(Math.random()*45)+1;
		ball[2] = (int)(Math.random()*45)+1;
		ball[3] = (int)(Math.random()*45)+1;
		ball[4] = (int)(Math.random()*45)+1;
		ball[5] = (int)(Math.random()*45)+1;
		*/
		for(int i=0; i<6; i++) {
			System.out.println(ball[i]);
		}
		
		
		
	}

}
