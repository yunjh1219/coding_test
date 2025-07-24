import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int tmp = 0;

        while (N >= 0) {
            if (N % 5 == 0) {
                tmp += N / 5;
                System.out.println(tmp); // ✅ 결과 출력
                return; // 메인 함수 종료 (값 반환 아님)
            }
            N -= 3;
            tmp++;
        }

        System.out.println(-1); // 만들 수 없을 경우
    }
}
