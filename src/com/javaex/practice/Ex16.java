package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int sum = 0;
		int x = num%5; int y = num/5;
		// x: num에서 나머지 값을 빼면 5의 배수를 구하기 쉽다[?:최적의 방법인지]
		// y: 5의 배수의 개수는 몫과 같음
		
		for(int i=5; i<=(num-x); i=i+5) {sum = sum+i;}
		
		System.out.println("5의배수의 개수: "+y);
		System.out.print("5의배수의 합: "+sum);
		
		sc.close();
	}

}
