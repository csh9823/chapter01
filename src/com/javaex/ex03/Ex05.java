package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("근무시간: ");
		
		int a = sc.nextInt();
		
		int b = 10000;
		
		if(a<=8) {
			System.out.println("임금은 "+a*b+" 입니다.");
		}
		else if(a>8) {
			int over = a-8;
			int pay = (b*8)+(int)(over*b*1.5);
			System.out.println("임금은 "+pay+"원 입니다.");
			sc.close();
		}

	}

}
