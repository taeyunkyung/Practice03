package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================");
		System.out.println("   [숫자맞추기게임 시작]   ");
		System.out.println("======================");
		
		int i = 29; boolean action = true;
		
		while(action) {
			System.out.print(">>"); int num = sc.nextInt();
			
			if(num==i) {
				System.out.println("맞았습니다."); 
				System.out.print("게입을 종료하시겠습니까?(y/n) >>");
				String text = sc.next();
					if(text.equals("y")) {
						System.out.println("======================");
						System.out.println("   [숫자맞추기게임 종료]   ");
						System.out.println("======================");
						action = false;
					} else if(text.equals("n")) {action = true;}
				}
			else if(num>i) {System.out.println("더 낮게");}
			else {System.out.println("더 높게");}	
		}
		sc.close();
	}
}
