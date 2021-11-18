package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();	
		int sum = 0; int i;
		
		if(num%2==1) {
			for(i=1; i<=num; i=i+2)
		    sum=sum+i;			
		} else {
			for(i=2; i<=num; i=i+2)
		    sum=sum+i;}
		
		System.out.print("결과값: "+sum);
		sc.close();
	}

}
