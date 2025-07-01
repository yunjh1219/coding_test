import java.util.Stack;

public class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // stack에 값이 있고, 최상단 값이 ch랑 같다 = 짝이다 
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop(); // 짝이면 제거
            } else {
                stack.push(ch); // 짝이 아니면 추가
            }
        }

        return stack.isEmpty() ? 1 : 0; // 최종 결과 반환
    }
}
