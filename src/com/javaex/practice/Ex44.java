package com.javaex.practice;

import java.util.Scanner;

public class Ex44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ex14
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=num; i++) {
			sum = sum+i;}
		
		for(int x=1; x<num; x++) { 
			System.out.print(x+"+");}
		System.out.print(num);
		
		System.out.println("");
		System.out.print("합계: "+sum);
		
		/*
		 * for(int i=1; i<=num; i++) {
		 * 		sum = sum+1;
		 * 		if(i==num) {
		 * 			System.out.println(i);
		 * 		} else {
		 * 			System.out.println(i+"+");
		 * 		}
		 */
	}

}
