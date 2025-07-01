public class Solution {
    public int solution(int n) {
        int ba = 0; // 배터리 사용량

        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2; // 순간이동: 거리 x2는 역으로 보면 /2
            } else {
                n--; // 점프
                ba++;   // 점프할 때만 배터리 소모
            }
        }

        return ba;
    }
}

