/*
 * 작성일:2024-03-22
 * 작성자:202395010김재현
 * 설명:다중제어문
 * 다중제어문
 * */

import java.util.*;
public class multitest2 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int score=0;
		System.out.println("점수 입력 : ");
		score=sc.nextInt();
		if(score>=90) 
			System.out.println("A학점 입니다.");
		else if(score>=80) 
			System.out.println("B학점 입니다.");
		else if(score>=70) 
			System.out.println("C학점 입니다.");
		else if(score>=60) 
			System.out.println("D학점 입니다.");
		else
			System.out.println("F학점 입니다.");
		
	}
}
