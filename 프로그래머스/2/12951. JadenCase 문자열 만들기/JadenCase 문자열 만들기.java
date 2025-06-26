class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isStart = true; // 단어의 시작 여부 체크

        for (char c : s.toCharArray()) {
            // 단어의 시작일 때 
            if (isStart) {
                // 단어의 첫 문자가 알파벳이라면, 대문자로 변경
                if (Character.isLetter(c)) {
                    answer.append(Character.toUpperCase(c));
                } else { // 단어의 첫 문자가 숫자나, 공백이라면
                    answer.append(c); 
                }
                isStart = false; //false로 변경하여 시작 문자가 아님을 명시
            } else { // 첫 문자가 아닌 중간 단어라면, 소문자로 변경
                answer.append(Character.toLowerCase(c));
            }
            // 만약 c가 공백이라면
            if (c == ' ') {
                isStart = true; // 공백 뒤는 문자가 시작 문자임을 명시 
            }
        }

        return answer.toString();
    }
}
