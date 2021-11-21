package com.javaex.practice;

import java.util.Scanner;

public class Ex42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ex12
		int f=1; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=num; i++) {
			f=f*i;				
		}
		System.out.print("결과값: "+f);
	}

}
