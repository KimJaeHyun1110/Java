/*
 * 작성일:2024-04-12
 * 작성자:202395010김재현
 * 설명: 점수를 입력받아 합계와 평균을 출력하시오
 * 		음수가 입력되면 점수 입력이 종료됩니다
 * 		100점 이상의 점수는 계산에 포함되지 않습니다
 * 문제분석: 계속해서 점수를 입력 받는다 = 무한반복
 * 알고리즘
 * 1. 정수형 변수 total,num을 선언후 0으로 초기화 한다
 * 2. 무한반복
 * 2-1.정수를 입력받아num에 저장한다
 * 2-2.만약 num이 0보다 작으면 반복문을 빠져나간다
 * 2-2-1.아니고 만약 num이 100보다 크면 다시 반복한다
 * 2-3.total에num을 더한 결과를 total에 저장한다
 * 3. total을 출력한다
 * */
import java.util.*;
public class conbrk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int total=0,num=0;
		while(true) {
			System.out.print("점수를 입력 해 주세요:");
			num=sc.nextInt();
			if(num<0) 
				break;
			else if(num>100) 
				continue;
			total+=num;
		}
		System.out.println(total);
		sc.close();
	}
}
