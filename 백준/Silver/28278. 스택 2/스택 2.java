import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // ✅ 출력 저장용

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
                sb.append(st.isEmpty() ? -1 : st.pop()).append('\n');
            }
            else if (num == 3) {
                sb.append(st.size()).append('\n');
            }
            else if (num == 4) {
                sb.append(st.isEmpty() ? 1 : 0).append('\n');
            }
            else if (num == 5) {
                sb.append(st.isEmpty() ? -1 : st.peek()).append('\n');
            }
        }

        System.out.print(sb); // ✅ 한 번에 출력
    }
}

