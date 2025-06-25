import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else { // ch == ')'
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        
        return stack.isEmpty(); // 모두 짝지어졌으면 true
    }
}
