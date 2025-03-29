//문자와 문자열
//charAt() 메서드를 알아야 함.
//s의 i번째 글자를 출력한다.
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
	  Scanner sc = new Scanner(System.in);
	  
	  String s = sc.nextLine(); //ex. Sprout 의 3번째는 r
	  int i = sc.nextInt()-1;   /* index는 0부터 시작. 
	                               그렇기에 index-1 해줘야 함.*/
	  System.out.print(s.charAt(i));
	  
	}
}
