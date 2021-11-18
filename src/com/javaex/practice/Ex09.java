package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int x=0; x<10; x++) {
			for(int y=x+1; y<=x+10; y++) { // x+1, x+10 -> 매줄 10개 출력하기 위해서는
				System.out.print(y);
				System.out.print("\t"); // 간격 \t 사용
			}
			System.out.println("");
		}
	}

}
