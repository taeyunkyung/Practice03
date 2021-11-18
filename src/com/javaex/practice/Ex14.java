package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int sum = 0; int i;
		
		for(i=1; i<=num; i++) {
			sum = sum+i;}
		
		for(int x=1; x<num; x++) {
			System.out.print(x+"+");}
		System.out.print(num);
		
		System.out.println("");
		System.out.print("합계: "+sum);
		
		sc.close();		
	}
}
