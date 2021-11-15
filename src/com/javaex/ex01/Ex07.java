package com.javaex.ex01;

public class Ex07 {
	public static void main(String[] args) {
		//대입 연산자
		int a = 7;
		int b = 2;
		//산술 연산자
		System.out.println("산술연산자");
		//sysout 컨트롤+스페이스 자동 완성 System.out.println();
		System.out.println(a+b);
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println(a/b); // 몫3.5 나머지 0 --> 몫을 표시
		System.out.println(a%b); // 몱3 나머지 1 --> 나머지를 표시 나머지1
		//산술연산자 / % 자세히
		System.out.println("산술연산자 자세히");
		System.out.println(7.0/2.0); //3.5
		System.out.println(7.0%2.0); //1.0
		//부호연산자
		System.out.println("부호 연산자");
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		System.out.println(pVar); // +(-3) =-3
		System.out.println(mVar);// -(-3) = +3
		
		//w 증가 감소 연산자
		System.out.println("증가연산자");
		System.out.println(a); //7
		System.out.println(++a); // (1)a를 1올린다-->7-->8, (2)a를 출력한다 8
		System.out.println(a); // ++a면 현재 값에 바로적용 a++다음 값에 적용
		
		System.out.println("감소연산자");
		System.out.println(b); // 2
		System.out.println(--b);// 1
		System.out.println(b);// 1
		
		System.out.println(a); // 8
		System.out.println(a++); // 8 1.a를 출력한다 2.a를 1올린다.
		System.out.println(a); // 9
		
		System.out.println(b); // 1
		System.out.println(b--);// 1 1.b를출력한다 2.b를 1내린다. 
		System.out.println(b); // 0
		
		
		
		
		
		
	}
}
