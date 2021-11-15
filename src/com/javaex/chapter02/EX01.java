package com.javaex.chapter02;

public class EX01 {

	public static void main(String[] args) {
		
		System.out.print("안녕");
		System.out.println("하세요");
		System.out.println("안녕하세요");
		System.out.println("=========");
		//println()사용법
		
		int i = 2345;
		double d  = 3.14;
		String str = "굿모닝";
		char c = '현';
		String s = "한";
		
		String name = "최현진";
		
		System.out.println("안녕하세요");
		System.out.println(str);
		System.out.println(i);
		System.out.println(d);
		
		System.out.println(str+str); // 굿모닝굿모닝굿모닝
		System.out.println(str+i); // 굿모닝 2345
		System.out.println(str+d);
		System.out.println(str+c);
		//굿모닝 이랑 2345
		System.out.println(str+" 이랑 "+i); // 굿모닝 이랑 2345
		
		System.out.print(str); // 
		System.out.print(" 이랑 "); // 
		System.out.println(i); //
		//
		System.out.println(i+i); // 4690
		System.out.println(i+d); // 2318.14
		System.out.println(i-i); // 
		System.out.println(i*i);  //
		
		System.out.println(c); //한 그대로 출력
		System.out.println(c+c); // 코드값+코드값 되서 다른 값 출력
		System.out.println(c+s); //코드값+문자열 그대로 출력
		System.out.println(c+i); //코드값+정수값 되서 코드 값 출력
		
		//
		System.out.println("제이름은 "+name+" 입니다.");
		
		System.out.println("안녕\"하\"세요"); // "" 입력법 안녕"하"세요
		System.out.println("안녕\\하\\세요"); // \ 입력법 안녕\하\세요
		System.out.println("안녕\t하세요"); // /t  4칸 벌리기 안녕    하세요
		System.out.println("안녕\n하세요"); // \n 입력법 줄 바꿈 안녕
										 //			       하세요
		
	}
}
