import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int i = 0; i < T; i++) {
            Stack<Character> stack = new Stack<>();
            String input = br.readLine();
            boolean isValid = true;

            for (char c : input.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty()) {
                        isValid = false; // 틀림을 표시
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            // 출력은 한 번만
            if (isValid && stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

