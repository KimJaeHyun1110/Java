/*
 * 작성일:2024-04-05
 * 작성자:202395010김재현
 * 설명: 월을 입력받아 계절을 출력
 * 문제분석: 
 * 
 * 알고리즘
 * 1. 
 * */
import java.util.*;
public class dowhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=0;
		do {
			System.out.print("월을 입력해 주세요:");
			m=sc.nextInt();
			switch(m) {
			case 0:break;
			case 3:case 4:case 5:
				System.out.println("봄 입니다.");break;
			case 6:case 7:case 8:
				System.out.println("봄 입니다.");break;
			case 9:case 10:case 11:
				System.out.println("봄 입니다.");break;
			case 12:case 1:case 2:
				System.out.println("봄 입니다.");break;
			default:
				System.out.println("해당 월은 없습니다");break;
			}
		}while(m!=0);
	}

}
