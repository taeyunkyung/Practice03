package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for(int y1=1; y1<=num; y1++) {
			for(int x1=num; x1>=y1; x1--) {System.out.print("*");}
			System.out.println("");
		}
		for(int y2=2; y2<=num; y2++) {
			for(int x2=1; x2<=y2; x2++) {System.out.print("*");}
			System.out.println("");
		}
		
		sc.close();	
	}

}