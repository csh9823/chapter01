package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arra = new int[] {10,20,30};
		int[] arrb= new int[] {15,25,30,};
		
		if(arra.length==arrb.length) { //배열의 크기가 같은가?
			//각 방의 값이 같은가 검사
			for(int i=0; i<arra.length; i++) {
				if (arra[i] != arrb[i]) {
					System.out.println(i+ "번째가 다릅니다.");
				}
			}
		}else {//배열의 크기가 다른경우
			System.out.println("배열의 크기가 다릅니다.");
		}
	}

}
