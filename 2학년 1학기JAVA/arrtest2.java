/*
 * 작성일:2024-04-16
 * 작성자:202395010김재현
 * 설명: 배열 1차원 배열을 생성하고 묵시적 표기값을 출력한다
 * 사용자로 부터 값을 입력받아 배열에 저장하고 합과 평균을 출력하시오
 * 문제분석: 
 * 알고리즘
 * */
public class arrtest2 {

	public static void main(String[] args) {
		int num[]= {12,43,9,45,77,84,23,81,34};
		int max=num[0];
		int min=num[0];
		int i;
		for(i=0;i<num.length;i++) {
			if(max<num[i]) {
				max=num[i];
			}
			if(min>num[i]) {
				min=num[i];
			}
		}
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		
		for(int j:num) {
			if(max<num[i]) {
				max=num[i];
			}
			if(min>num[i]) {
				min=num[i];
			}
		}
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		
	}

}
