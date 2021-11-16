package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {
		public static void main(String[] args) {
			Scanner sc= new Scanner (System.in);
		
			System.out.print("점수를 입력하세요");
		
			int a = sc.nextInt();
			/*
			if(a>=90) {
				System.out.println("A등급");
			}
			
			else if (a>=80 && a<=89) {
				System.out.println("B등급");
			}
			else if (a>=70 && a<=79) {
				System.out.println("C등급");
				
			}
			else if (a>=60 && a<=69) {
				System.out.println("D등급");	
			}
			else {
				System.out.println("F등급");
			}
			*/
			// 이렇게 써도됨.
			if(a>=90) {
				System.out.println("A등급");
			}
			
			else if (a>=80) {
				System.out.println("B등급");
			}
			else if (a>=70) {
				System.out.println("C등급");
				
			}
			else if (a>=60) {
				System.out.println("D등급");	
			}
			else {
				System.out.println("F등급");
			}
			
			sc.close();
	}
}
