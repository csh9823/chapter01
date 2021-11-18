package com.javaex.ex04;

public class Ex11 {
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			// 2의 배수 이면서 3의 배수니? --> 6이니?
			if((i%2==0) && (i%3==0)) {
				//break; //6일때 멈춤 5까지 출력
				continue; // 6일때 멈추지만 다시 출력 6은 출력 안됨.
			}
			System.out.println(i);
		} //for문의 끝
		
		
	}
}
