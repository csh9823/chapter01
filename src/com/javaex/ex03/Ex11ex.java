package com.javaex.ex03;

import java.util.Scanner;

public class Ex11ex {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner (System.in);
		
		System.out.print("월을 입력하세요 ");
		//다른 응용
		int a= sc.nextInt();
		
		switch(a) {
		case 4:
		case 6:
		case 9:
		case 1:
			System.out.println("30일");
			break;
		case 2:
			System.out.println("28일");
			break;
			default :
			System.out.println("31일");
			break;
		}
		sc.close();
	}
}
