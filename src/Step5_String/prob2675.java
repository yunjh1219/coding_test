package Step5_String;

import java.util.*;

public class prob2675 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();  //테스트 횟수

        for(int i=0; i<T; i++){
            int R = scan.nextInt();  // 문자 반복횟수
            String S = scan.next();  // 개행문자(공백)을 받지 않는 next() 사용, nextLine()은 개행문자를 받기 때문에 에러가 생김

            for(int k=0; k<S.length(); k++) {
                for (int j = 0; j < R; j++) {
                    System.out.print(S.charAt(k));
                }
            }
            System.out.println();
        }
        scan.close();
    }
}