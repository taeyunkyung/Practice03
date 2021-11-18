package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i=1;
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: "); int num1 = sc.nextInt();
		
		for(i=1; i<=4; i++ ) {
			System.out.print("숫자: "); int num = sc.nextInt();			
				if(num>num1) {num1=num;}		
			}
	
		System.out.println("최댓값은 "+num1+"입니다.");	
		
		sc.close();
	}

}

