/*
 * 작성일:2024-03-22
 * 작성자:202395010김재현
 * 설명: 두 정수를 입력 받아 두 수가 모두 짝수이면 더한 결과를 출력하고
 * 그렇지 않고 두 수중 하나하도 홀수이면 몇 번째 입력한 수를 짝수로
 * 입력해야 하는지 출력하시오.
 * 
 * 문제분석
 * 	짝수는 2로 나눈 나머지가 0이다
 * 	홀수는 2로 나눈 나머지가 1이다
 *  
 * 알고리즘
 * 1. 두 정수를 각각 n1 n2에 입력 받는다
 * 2. n1을 2로 나눈 나머지가 0이면서 n2를 2로 나눈 나머지가0인가
 * 2-1. 참이라면 n1과 n2를 더한 결과를 출력
 * 2-2. 거짓이라면 n1을 0으로 나눈 나머지가 0인가
 * 2-2-1. 참이라면 두번째 입력한 숫자를 짝수로 입력해야한다 출력
 * 2-2-2. 거짓이라면 첫번째 입력한 숫자를 짝수로 입력해야한다 출력
 * */
import java.util.*;
public class seltest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		n1=sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		n2=sc.nextInt();
		if(n1%2==0&&n2%2==0) {
			System.out.println(n1+"+"+n2+"="+(n1+n2));
		}else if(n1%2==0) {
			System.out.println("두번째 입력한 숫자를 짝수로 입력해야 합니다.");
		}else {
			System.out.println("첫번째 입력한 숫자를 짝수로 입력해야 합니다.");
		}
	}

}
