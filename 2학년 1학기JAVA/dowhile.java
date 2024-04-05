/*
 * 작성일:2024-04-05
 * 작성자:202395010김재현
 * 설명: 1부터 10까지 합을 출력하시오
 * 문제분석: 
 * 
 * 알고리즘
 * 1. 
 * */
public class dowhile {
	public static void main(String [] args) {
		int sum=0;
		int num=1;
		do {
			sum=sum+num;
			num++;
		}while(num<=10);
		System.out.println(sum);
	}
}
