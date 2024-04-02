/*
 * 작성일:2024-04-02
 * 작성자:202395010김재현
 * 설명: 1+2+3+4+5+6+7+8+9+10
 *  1부터
 *  10까지
 *  1씩증가
 *  하면서 합계를 계산한다
 *  sum=sum+num
 *  sum=0 초기값 지정이 반드시 필요하다
 * 알고리즘
	1.수는 1부터
	2.수는 10까지 반복하몀서
		2-1.합계를 계산한다
		2-2.수를 1씩 증가한다
		2-3.합계를 출력한다
	3.합계를 출력한다
 * */
public class whiletest {

	public static void main(String[] args) {
		int num=1,sum=0;
		while(num<=10) {
			sum+=num;
			num++;
		}
		System.out.println("1~10까지 합은 "+sum+"입니다.");
	}

}
