import java.util.*;
public class m01 {
    public static void main(String[] args) throws Exception {
        //상수 선언 
    	final int MAX=100;
        final double PI=3.14;
        
        int r=5;
        double pi=3.14159265;
        String name="김재현";
        char blood='B';
        
        //원넓이계산 및 출력
        System.out.println("원주율은 "+PI+"입니다.");
        System.out.println("원주율은 "+pi+"입니다.");
        System.out.println("원의 넓이는 "+(r*r*pi)+"입니다.");
        //원 넓이 계산 및 area변수 선언및초기화
        double area=r*r*pi;
        
        //C형식으로 printf 써서 원넓이출력
        System.out.printf("반지름이 %d인 원의 넓이는 %f 입니다.\n",r,area);
        
    }
}
