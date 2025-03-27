package Step5_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prob2908_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 한 줄을 읽고 공백을 기준으로 나누기
        String input = br.readLine();
        String[] parts = input.split(" ");  // 공백을 기준으로 나눔

        // 각각 A, B로 받기
        String A = parts[0];
        String B = parts[1];

        // StringBuilder 사용하여 숫자 뒤집기
        StringBuilder sbA = new StringBuilder(A);
        StringBuilder sbB = new StringBuilder(B);

        // 뒤집은 후 정수 변환
        int reversedA = Integer.parseInt(sbA.reverse().toString());
        int reversedB = Integer.parseInt(sbB.reverse().toString());

        // 더 큰 숫자 출력
        System.out.println(Math.max(reversedA, reversedB));
    }
}