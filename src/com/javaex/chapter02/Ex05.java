package com.javaex.chapter02;

import java.util.Scanner;

public class Ex05 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이:");
		int i = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름:");
		String name= sc.nextLine(); // 숫자보다 늦게 쓰일 경우 오류발생 해결법  next로 전환
		// next 안 쓸경우 숫자 값 밑에 sc.nextLine(); 엔터를 소비
		
		System.out.println("키를 입력해주세요");
		System.out.print("키:");
		double d = sc.nextDouble();
		
		System.out.println("당신의 이름은 "+name+" 나이는 "+i+ " 키는 "+d+" 입니다.");
		System.out.println("zzzz");
		sc.close();
		
	}

}
