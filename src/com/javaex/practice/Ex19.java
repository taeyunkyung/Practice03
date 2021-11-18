package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		while(true) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택>");
			int num = sc.nextInt();
			
			if(num==4) {
				System.out.print("프로그램 종료");
				break;}
			
			else if(num==1) {
				System.out.print("예금액>");		
				int c1 = sc.nextInt(); 
				sum = sum+c1;
			}	
			else if(num==2) {
				System.out.print("출금액>");
				int c2 = sc.nextInt();
				sum = sum-c2;
			}	
			else if(num==3) {								
				System.out.print("잔고>"+sum);
				System.out.println("");
			}
			
			else {System.out.println("다시입력해주세요");
			}
		}
		sc.close();
	}			
}
