package com.javaex.ex01;

public class Ex09 {
	public static void main(String[] args) {
		
		// 논리 연산자 &엔드 연산자 둘다 맞아야  true  or|| 둘중 하나만 맞아도(트루면) true ! not 반대 값  !T T가 아니니 F
		
		int a = 5;
		int b = 7;
		
		//논리연산자&& --> 둘다 둘다 맞아야T (tt=f ff=f)
		System.out.println(true&&true); // true
		System.out.println(true&&false); // false
		//System.out.println(false&&true); //false
		//System.out.println(false&&false); //false
		
		//논리 연산자 응용
		System.out.println("&&(and)연산자");
		System.out.println( (a>b) && (a<b) ); // F&&T = F
		System.out.println( (a>b) && (a>b) ); // F&&F = F
		
		//논리 연산자 || 둘중 하나라도 맞으면(트루면) T
		System.out.println("||(OR)연산자");
		//System.out.println(true||true); // true
		//System.out.println(true||false); // true
		System.out.println(false||true); //true
		System.out.println(false||false); //false
		//
		System.out.println("||(OR)연산자 응용");
		System.out.println( (a>b) || (a<b) ); // F&&T = T
		
		//논리연산자 ! --> 반대(not) !T 면 F !F면 T
		System.out.println("!(NOT)연산자");
		System.out.println(!true); //F
		System.out.println(!false); //T
		
		System.out.println("!(not)연산자 응용");
		System.out.println( !(a>b) ); //  !F --> T
		System.out.println( !(a<b) ); // !T --> F

	}

}
 