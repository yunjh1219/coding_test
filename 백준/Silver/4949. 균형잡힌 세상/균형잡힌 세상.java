import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            if (str.equals(".")) break; // 온점만 있으면 종료

            Stack<Character> st = new Stack<>();
            boolean isBalanced = true;

            for (char c : str.toCharArray()) {
                if (c == '(' || c == '[') {
                    st.push(c);
                } else if (c == ')') {
                    if (!st.isEmpty() && st.peek() == '(') {
                        st.pop();
                    } else {
                        isBalanced = false;
                        break;
                    }
                } else if (c == ']') {
                    if (!st.isEmpty() && st.peek() == '[') {
                        st.pop();
                    } else {
                        isBalanced = false;
                        break;
                    }
                }
            }

            if (!st.isEmpty()) isBalanced = false;

            System.out.println(isBalanced ? "yes" : "no");
        }
    }
}
