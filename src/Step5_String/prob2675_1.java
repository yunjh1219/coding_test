package Step5_String;

import java.io.*;
import java.util.*;

public class prob2675_1 {
    public static void main(String[] args) throws IOException {
        // BufferedReader로 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스 개수 T 입력 받기
        int T = Integer.parseInt(br.readLine());

        // T번 반복하여 처리
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            for (int k = 0; k < S.length(); k++) {
                for (int j = 0; j < R; j++) {
                    System.out.print(S.charAt(k));  // 문자 R번 반복 출력
                }
            }
            System.out.println();  // 테스트 케이스마다 한 줄 개행
        }
        br.close();
    }
}