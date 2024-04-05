/*
 * 작성일:2024-04-05
 * 작성자:202395010김재현
 * 설명: 전체 구구단 작성하디
 * 문제분석: 단은 2~9까지
 * 곱하는 수는 1~9까지
 * 2단 출력하고, 3단출력하고, ... 9단 출력한다. 
 * 알고리즘
 * 1. 정수변수 i를 선언후 2로 초기화하고 10보다 작을때 까지 반복하면서 1씩 증가시킨다
 * 1-1. 몇단인지 출력한다 
 * 1-2. 정수변수 j를 선언후 1로 초기화하고 10보다 작을때 까지 반복하면서 1씩 증가시킨다
 * 1-2-1. 구구단 연산을 하여 출력한다.
 * */
public class nestedlooptest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<10;i++) {
			System.out.println("\n====="+i+"단=====");
			for(int j=1;j<10;j++) {
				System.out.println(i+"x"+j+"="+(i*j));
			}
		}
	}

}
