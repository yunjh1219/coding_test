class Solution {
    public int solution(int n) {
        int[] arr = new int[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = (arr[i - 2] + arr[i - 1]) % 1234567; // 매번 나머지 연산
        }

        return arr[n]; // 이미 나머지 계산했으므로 그대로 반환
    }
}
