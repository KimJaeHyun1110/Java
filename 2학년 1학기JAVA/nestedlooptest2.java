/*
 * 작성일:2024-04-05
 * 작성자:202395010김재현
 * 설명: 별출력
 * 문제분석: 
 * 알고리즘
 * 1. 정수변수 n을 선언하고 정수를 입력받는다.
 * 2. 정수변수 i를 선언후 0으로 초기화하고 i가n보다 작을때까지 반복하며 1씩 증가시킨다
 * 2-1. 정수변수 j를 선언후 n-i로 초기화하고 j가 n보다 작거나같을때까지 반복하며 1씩 증가시킨다
 * 2-1-1. 별을 출력한다
 * 2-2. 개행시킨다.
 * */
import java.util.*;
public class nestedlooptest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=n-i;j<=n;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}

}
