package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int x, y;
		for(y=1; y<=num; y++) { // y=세로줄 수
			for(x=1; x<=y; x++) {
				System.out.print(y); // 줄 값이 가로로 반복됨
			}
			System.out.println("");
		}
		
		sc.close();	
		}	

}
