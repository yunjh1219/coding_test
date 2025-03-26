package Step5_String;

/*
이 문제는 String 클래스 메서드에 대해 알고 있는지 묻고 있습니다.
자바의 정석 p.209 에서 내용을 확인할 수 있습니다.
*/

import java.util.*;

public class prob27866 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Scanner 객체 생성

        String S = scan.nextLine();
        int i = scan.nextInt()-1;  /* i는 1부터 시작, index는 0부터 시작
                                      즉 index[0] = i-1 부터 시작한다. */

        System.out.print(S.charAt(i)); // S.charAt(i)는 S의 i번째 문자를 반환한다
    }
}
