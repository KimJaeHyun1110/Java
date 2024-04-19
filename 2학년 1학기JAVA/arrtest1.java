/*
 * 작성일:2024-04-16
 * 작성자:202395010김재현
 * 설명: 배열 1차원 배열을 생성하고 묵시적 표기값을 출력한다
 * 사용자로 부터 값을 입력받아 배열에 저장하고 합과 평균을 출력하시오
 * 문제분석: 
 * 알고리즘
 * */
import java.util.*;
public class arrtest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]=new int [5];
		System.out.println("배열의 길이:"+num.length);
		System.out.println("배열에 저장된 초기값");
		for(int i=0;i<5;i++) {
			System.out.println("num["+i+"]="+num[i]);
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("사용자로 부터 값 입력 받아 배열에 저장");
		for(int i=0;i<5;i++) {
			System.out.print("num["+i+"] 번지에 데이터 입력:");
			num[i]=sc.nextInt();
		}
		System.out.println("배열에 입력된값");
		for(int i=0;i<5;i++) {
			System.out.println("num["+i+"]="+num[i]);
		}
		int total=0;
		for(int i=0;i<5;i++) {
			total+=num[i];
		}
		System.out.println("배열의 합계는 "+total+"입니다.");
		
		
	}

}
