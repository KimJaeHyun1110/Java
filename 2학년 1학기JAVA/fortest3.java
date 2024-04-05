/*
 * 작성일:2024-04-05
 * 작성자:202395010김재현
 * 설명: 정수를 입력 받아 정수의 약수를 구하시오
 * 문제분석: 0부터 정수까지의 수중 정수를 나눌 수를 찾아야한다
 * 
 * 알고리즘
 * 1. 정수변수 num을 선언하고 사용자로 부터 정수를 하나 입력 받아 num에 저장한다
 * 2. 정수변수 i를선언후 1로 초기화하고 num까지 반복하면서 i를 1씩 증가시킨다
 * 2-1. num을 i로 나눈 나머지가 0인가
 * 2-1-1. 0이라면 숫자를 출력한다
 * */

import java.util.Scanner;

public class fortest3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0;
		System.out.print("정수를 입력 해주세요 : ");
		num=sc.nextInt();
		System.out.println(num+"의 약수 리스트(for)");
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
		System.out.println(num+"의 약수 리스트(while)");
		int i=1;
		while(i<=num) {
			if(num%i==0) {
				System.out.println(i);
			}
			i++;
		}
		sc.close();
	}
}
