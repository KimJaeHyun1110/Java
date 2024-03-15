/*
 * 작성일:2024-03-15
 * 작성자:202395010김재현
 * 설명:연산과자료형
 * 두개의 정수를 입력 받아 평균을 계산하는 프로그램
 * 1.두 정수를 입력 받는다
 * 2.평균을 계산한다
 * 3.평균을 출력한다
 * 
 * */
import java.util.Scanner;
public class datatypeoper {

	public static void main(String[] args) {
		//두개의 정수를 입력받기 위해 scanner객체를 생성한다
		Scanner sc=new Scanner(System.in);
		//정수 넘1넘2를 선언및 0으로 초기화
		int num1=0,num2=0;
		//정수를 입력 받는다
		System.out.println("첫번쨰 정수를 입력 해 주세요");
		num1=sc.nextInt();
		System.out.println("두번쨰 정수를 입력 해 주세요");
		num2=sc.nextInt();
		//avg라는 변수를선언함과 동시에 num1,num2의 평균값을 형변환한뒤 초기화해준다.
		double avg=(double)(num1+num2)/2;
		
		//두 정수를 출력해준다
		System.out.println("첫번째 정수:"+num1+"\n두번째 정수:"+num2);
		System.out.println("정수 연산:"+num1+"+"+num2+"="+avg);
		
		//사용한 입력 스트림을 종료시켜준다.
		sc.close();
	}

}
