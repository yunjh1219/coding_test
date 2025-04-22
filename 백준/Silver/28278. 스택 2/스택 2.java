import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> st = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer stz = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(stz.nextToken());

            if (num == 1) {
                int X = Integer.parseInt(stz.nextToken());
                st.push(X);
            }
            else if (num == 2) {
                if (!st.isEmpty()) {
                    System.out.println(st.pop()); // pop한 값 출력
                } else {
                    System.out.println(-1);
                }
            }
            else if (num == 3) {
                System.out.println(st.size());
            }
            else if (num == 4) {
                if (st.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
            else if (num == 5) {
                if (!st.isEmpty()) {
                    System.out.println(st.peek()); // peek한 값 출력
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}
