package Step5_String;

import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 BufferedRader 로 문자열 입력받고,
 입력받은 문자열을 StringTokenizer 사용하여 " " 구분하여 저장
 countTokens() 로 갯수 반환
 */
/*
깃 리모트 연결 확인
 */

public class prob1152_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        System.out.print(st.countTokens());
    }
}