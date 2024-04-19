/*
 * 작성일:2024-04-12
 * 작성자:202395010김재현
 * 설명: 1부터 입력 받은 수 까지 합계
 * 문제분석: 1부터 입력받은 숫자 까지의 합계를 반복문을 이용해서 구해야 한다
 * 알고리즘
 * 1. 정수변수 total을 선언하여 1로 초기화 i는 2로 선언후 초기화 한다
 * 2. 정수변수 num을 선언하여 초기화 할 값을 입력받는다
 * 3. 무한 반복
 * 3-1. i와 total의 합을 total에 저장한다음 i를 1증가시킨다
 * 3-2. i가 num보다 크면 break한다
 * 4. total의 값을 출력한다
 * */
import java.util.Scanner;
public class contest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("숫자를 입력 해 주세요");
		int total=0,i,num=sc.nextInt();
		for(i=1;i<=num;i++) {
			if(i%2==1)
				continue;
			total+=i;
		}
		System.out.println(total);
		sc.close();
	}

}
