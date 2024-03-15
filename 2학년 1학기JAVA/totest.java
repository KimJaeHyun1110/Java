
/*
 * 작성일:2024-03-15
 * 작성자:202395010김재현
 * 설명:삼항연산자
 * 정수를 입력받아 짝수인지 확인하는 프로그램
 * */

import java.util.Scanner;

public class totest {
	public static void main(String[]srgs) {
		//scanner생성
		Scanner sc=new Scanner(System.in);
		
		System.out.println("정수 입력:");
		int num=sc.nextInt();
		
		boolean result;
		result=(num%2==0)?true:false;
		
		System.out.println(num+"<-이 정수는 짝수입니까?");
		System.out.println((result)?"네, 짝수 입니다.,":"아니요, 홀수 입니다.");
	}
}
