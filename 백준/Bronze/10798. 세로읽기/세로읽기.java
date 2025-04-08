import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] arr = new char[5][15];

        // 입력 받아 배열에 저장
        for (int i = 0; i < 5; i++) {
            String line = br.readLine();
            for (int j = 0; j < line.length(); j++) {
                arr[i][j] = line.charAt(j);  // 문자를 배열에 저장
            }
        }

        StringBuilder sb = new StringBuilder();

        // 세로 탐색
        for (int j = 0; j < 15; j++) {        // 열
            for (int i = 0; i < 5; i++) {     // 행
                if (arr[i][j] != '\0') {      // 값이 있으면
                    sb.append(arr[i][j]);
                }
            }
        }

        System.out.println(sb.toString());
    }
}
