/*
 * 작성일:2024-04-16
 * 작성자:202395010김재현
 * 설명: 1차원 배열에 정수 값을 저장하여 생성하시오
 * 사용자로부터 정수를 하나 입력받아 그정수가 어디에 몇개 있는지 출력하시오
 * 입력한 값이 배열이 없다면 "입력한 값이 없습니다" 를 출력하시오
 * 문제분석: 배열을 생선하고 합계를 저장할 변수와 입력을 받아야한다
 * 알고리즘
 * 1. 배열변수와 total, ser변수를 생성한다
 * 2. 찾을 숫자를 입력받는다
 * 3. i를 0부터 num의 길이 까지 반복한다
 * 3-1. num[i]의 값이 입력 받은 값이랑 같으면 출력해줌과 동시에 total을 1 증가시킨다
 * 4. total이 0보다 크면 총 갯수를 아니라면 없습니다를 출력한다
 * */
import java.util.*;
public class arrtest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {3,4,5,2,1,2,3,5,3,2,1,6,8};
		int total=0,ser=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("찾으실 숫자를 입력 해 주세요:");
		ser=sc.nextInt();
		System.out.print("입력한 값이");
		for(int i=0;i<num.length;i++) {
			if(num[i]==ser) {
				System.out.print(" "+i+"번지");
				total++;
			}
		}
		if(total>0) {
			System.out.println("에 있으며 "+total+"개 있습니다.");
		}else {
			System.out.println(" 없습니다.");
		}
		
	}

}
