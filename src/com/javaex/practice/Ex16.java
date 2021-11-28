package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int sum = 0;
		int y = num/5;
		// x: 아웃 조건 때문에 상관 없는 거였어!
		// y: 5의 배수의 개수는 몫과 같음
		
		for(int i=5; i<=num; i=i+5) {sum = sum+i;}
		
		System.out.println("5의배수의 개수: "+y);
		System.out.print("5의배수의 합: "+sum);
		
		sc.close();
		
		/*
		 * if(i%5 ==0) {
		 * 		count++; // count = count+1, count+=1
		 * }
		 */
	}

}
