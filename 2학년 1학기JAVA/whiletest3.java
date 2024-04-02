/*
 * 작성일:2024-04-02
 * 작성자:202395010김재현
 * 설명: 정수를 입력 받아 정수의 팩토리얼 값을 출력하시오
 * 문제분석: 5!=5*4*3*2*1=120
 * 
 * 알고리즘
 * 1. i와 pac 두개의 정수형 변수를 선언한다.
 * 2. 사용자로 부터 정수를 하나 입력 받아 i에 저장한다
 * 3. pac에 i의 값을 저장한다
 * 4. 어떤값을 곱하는지 출력한다
 * 5. pac이랑 i를 전위감소시킨다음 곱하여 pac에 저장한다
 * 6. 결과를 출력한다
 * */
import java.util.*;
public class whiletest3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int pac=0,i=1;
		System.out.print("팩토리얼 값을 입력 해주세요 : ");
		i=sc.nextInt();
		pac=i;//pac에 초기값을 저장하지 않을시 0이랑 곱하게되어 값이 나오지 않으며 이후 출력의 용이성을 위해.
		System.out.print(i+"!=");
		while(i>1) {
			System.out.print(i+"x");
			pac*=--i;
		}
		System.out.println("1="+pac);
		sc.close();
	}

}
