package Step5_String;

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
