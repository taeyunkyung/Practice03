package com.javaex.practice;

import java.util.Scanner;

public class Ex41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ex11
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		sc.close();
		
		if(num%2==1) {
			for(int i=1; i<=num; i=i+2) 
		    sum=sum+i;			
		} else {
			for(int i=2; i<=num; i=i+2) 
		    sum=sum+i;}
		
		System.out.print("결과값: "+sum);
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("숫자를 입력하세요");
		 * int num = sc.nextInt(); 
		 * int startNum; --> 신기..
		 * int sum = 0;
		 * 
		 * if (num % 2 ==1) {
		 * 		startNum = 1;
		 * } else {
		 * 		startNum = 2;
		 * }
		 * 
		 * for (int i = startNum; i <= num; i = i+2) {
		 * 		sum = sum + i;
		 * }
		 * System.out.print("결과값: "+sum);
		 * sc.close();
		 */
	}

}
