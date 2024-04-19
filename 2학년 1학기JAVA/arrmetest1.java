/*
 * 작성일:2024-04-19
 * 작성자:202395010김재현
 * 설명: Arrays클래스와 system클래스에서 제공하는 메소드 연습
 * 문제분석: 
 * 알고리즘
 * 1. 
 * */
import java.util.Arrays;
public class arrmetest1 {

	public static void main(String[] args) {
		int num1[]= {9,1,7,3,5,4,6,2,8,0};
		System.out.println("초기 배열 : "+Arrays.toString(num1));
		//3번지와 4번지가 33으로 채워진다 즉 3,5,33은 3부터 5전의 주소까지 33으로 채운다 라는 뜻
		Arrays.fill(num1, 3,5,33);
		System.out.println("fill()메소드 수행후 : "+Arrays.toString(num1));
		//오름차순 정렬
		Arrays.sort(num1);
		System.out.println("sort() 메소드 수행후 : "+Arrays.toString(num1));
		//binarySearch(num1, 33)은 num1 배열에 처음으로 만난 33이 어디에 있는지 알려줌
		//이 메소드를 사용하기 위해서는 반드시 요소들이 정렬되어 있어야 한다.
		System.out.println("33은 배열의 "+Arrays.binarySearch(num1, 33)+"번째 요소");
		
		int num2[]= {5,4,3,2,1};
		System.out.println("num2[]배열"+Arrays.toString(num2));
		System.out.println("두 배열은 같은가? "+Arrays.equals(num1, num2));
		
		int [] num3=new int[5];
		//배열의 값을 복사하는 메소드이며
		//num2배열의 0번지 부터 num3의 0번지에서 3개 복사된다
		//남은공간은 디폴트 값 0으로 저장된다
		System.arraycopy(num2, 0, num3, 0, 3);
		System.out.println("복사된 배열 num3 : "+Arrays.toString(num3));
	}

}
