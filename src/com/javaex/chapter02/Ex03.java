package com.javaex.chapter02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름:");
		
		String name = sc.nextLine(); // string=nextLine 또는 string=next 띄어쓰기or 공백이 있으면 뒤에 값 안 먹음 
		
		System.out.println("당신의 이름은 "+name+"입니다");
		
			
		sc.close();
	}
	
}
