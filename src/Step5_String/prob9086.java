package Step5_String;

import java.util.*;

public class prob9086 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Scanner 객체 생성

        int n = scan.nextInt();
        scan.nextLine();

        for(int i=0; i<n; i++){
            String str = scan.next();
            System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
            /*
            첫번째 문자 charAt(0)
            마지막 문자 length() 문자열 길이에 -1 한 값이, 인덱스 마지막이다.
             */
        }
    }
}
