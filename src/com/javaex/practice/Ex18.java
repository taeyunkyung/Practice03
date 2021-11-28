package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for(int y1=1; y1<=num; y1++) { // 줄어들기와 늘어나기 분리[?:최적의 방법인지]
			for(int x1=num; x1>=y1; x1--) {System.out.print("*");}
			System.out.println("");
		}
		for(int y2=2; y2<=num; y2++) { // 위에서 한 개까지 찍어서 두 개부터 시작
			for(int x2=1; x2<=y2; x2++) {System.out.print("*");}
			System.out.println("");
		}
		
		sc.close();	
		
		/*
		 * 변수 너무 많이 잡지 말고
		 * for(int y=1; y<=num; y++) {
		 * 		for(int x=1; x<=num+1-y; x++) {
		 * 		System.out.print("*");
		 * 		}
		 * 		System.out.println("");
		 * }
		 * 
		 * for(int y=1; y<=num-1; y++) {
		 * 		for(int x=1; x<=y+1; x++) {
		 * 		System.out.print("*");
		 * 		}
		 * 		System.out.println("");
		 * }
		 */
	}

}
