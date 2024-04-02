/*
 * 작성일:2024-04-02
 * 작성자:202395010김재현
 * 설명: 알고싶은 단을 입력 받아 구구단을 출력하시오.
 * 문제분석: 단은 고정이다 입력받는다
 * 		곱하는 수는 1부터 9까지 1씩 증가한다
 * 		곱셈의 결과는 단 * 수 이다
 * 		구구단 곱셈의 과정이 하나씩 출력되야 한다
 * 
 * 알고리즘 1. 단을 입력 받는다
 * 		2. 곱하는 수는 1부터
 *		3. 곱하는 수는 9까지 반복하면서
 *			3-1. 구구단 출력한다
 *			3-2. 곱하는 수를 1씩 증가시킨다
 * */
import java.util.*;
public class whiletest2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dan=0,i=1;
		System.out.print("알고 싶은 단을 입력해 주세요 : ");
		dan=sc.nextInt();
		while(i<10) {
			System.out.println(dan+" x "+i+" = "+(dan*i++));
		}
		
		sc.close();
	}

}
