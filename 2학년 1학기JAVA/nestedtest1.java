/*
 * 작성일:2024-03-22
 * 작성자:202395010김재현
 * 설명:내포된 if문 실습.
 * 점수를 입력받아 학점을 출력하시오.
 * 점수는 0~100점 사이 입니다.
 * 점수 범위를 벗어나면 잘못된 점수입니다 출력하시오.
 * 
 * 문제분석 : 입력받은 점수가 0~100점 사이인가?
 * 점수가 0~100점 사이가 아니면?
 * 90점 이상이면 A학점
 * 80점 이상히면 B학점
 * 70점 이상이면 C학점
 * 60점 이상이면 D학점
 * 60점 미만이면 F학점
 * 점수는 정수로 입력 받는다.
 * 
 * 알고리즘: 1.정수를 입력받는다
 * 2. 입력받은 정수가 0~100 사이인가?
 * 2-1. 만약 90점 이상이면 A학점 출력
 * 2-2. 아니고 만약 80점 이상이면 B학점 출력
 * 2-3. 아니고 만약 70점 이상이면 C학점 출력
 * 2-4. 아니고 만약 60점 이상이면 D학점 출력
 * 2-5. 아니고 만약 60점 이상이면 F학점 출력
 * 3. 아니라면 범위가 틀렸다고 출력
 * */
import java.util.Scanner;

public class nestedtest1 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int score=0;
		System.out.print("점수 입력 : ");
		score=sc.nextInt();
		if(score>=0&&score<=100) {
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
		}else {
			System.out.println("점수의 범위가 잘못 되었습니다 0~100사이의 정수를 입력해 주세요");
		}
		
		int age=0;
		if(age>=18&&age<=25) {}
		char sex='M';
		if(sex=='M'&&age>=18&&age<=25) {}
		int k=0,e=0,m=0;
		if(k>=70&&e>=70&&m>=70) {}
		if(k>=70&&e>=70&&m>=70||k+e+m>=240) {}
		int h1=20,h2=23;
		if(h1+h2>=40&&h1+h2<=49) {}
		//두수가 짝수인가
		int num1=10,num2=12;
		if(num1%2==0&&num2%2==0) {}
		
	}
}
