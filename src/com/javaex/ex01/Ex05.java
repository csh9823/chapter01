package com.javaex.ex01;

public class Ex05 {
	
	public static void main(String[] args) {
		
		System.out.println(2+3.1);
		
		double var01 = 2+3.1;
		
		System.out.println(var01);
		
		
		
//		자동 형 변환
//		int num1 = 1; 
//		float num2 = 1.0F;
//		(????) result = num1 + num2; ????=float로 자동변환 정수형과 실수형이면 실수형 표현으로 무조건 바뀜 정수형 바이트가 커도 실수형으로 바뀜.
//		정수 정수 실수 실수일 경우 큰 바이트가 이김
		long var02 = 12345L; //int 값 보다 클 경우 L을 붙여야됨
		float var03 = 1.1F;
		System.out.println(var02+var03);
		
		float result = var02+var03;
		System.out.println(result);
		
		/////////////////////////////////////////////////////////
		//강제 형변환
		
		int i= (int)11112.323232;
		System.out.println(i);
		
		float f01 = 12.5f;
		
		int i01= (int)f01;
		
		System.out.println(i01);
		System.out.println(f01);
		//강제 형변환 --> 확대 형변환
		byte t01 = 10;
		int t02 = (int)t01;
		System.out.println(t01);
		System.out.println(t02);
		//걍제 현변환 ---> 축소 형변환(이상 없을때)
		int t03 =10;
		byte t04 = (byte)t03;
		System.out.println(t03);
		System.out.println(t04);
		//걍제 현변환 ---> 축소 형변환(비정상)
		int t05 = 103029770;
		byte t06 = (byte)t05;
		System.out.println(t05);
		System.out.println(t06);
		
		//실수-->정수 : 소수부분이 없어짐
		double t07 = 53342.57234515142;
		int t08 = (int)t07;
		System.out.println(t07);
		System.out.println(t08);
		//정수--->실수 :
		int t09 = 7;
		double t10 = (double)t09;
		System.out.println(t09);
		System.out.println(t10);
	}

}
