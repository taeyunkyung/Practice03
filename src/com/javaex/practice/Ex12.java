package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int f=1; int i;
		
		for(i=1; i<=num; i++) {
				f=f*i;				
			}
		System.out.print("결과값: "+f);
		
		sc.close();
	}

}
