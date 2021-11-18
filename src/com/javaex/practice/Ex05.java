package com.javaex.practice;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;
		boolean flag = true;
		
		while(flag) {
			if(i>=5) {
				flag=false;
			}
			System.out.println(i);
			i=i+1;
		} // 1 2 3 4 5 [이후 flag 값이 false로 바뀌며 while문에 진입이 불가해짐]
	}

}
