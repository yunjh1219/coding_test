import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int length = s.length();

        for (int i = 0; i < length; i++) {
            System.out.print(s.charAt(i)); // 한 글자씩 출력
            if ((i + 1) % 10 == 0) { // 10번째 글자마다 줄바꿈
                System.out.println();
            }
        }
    }
}
