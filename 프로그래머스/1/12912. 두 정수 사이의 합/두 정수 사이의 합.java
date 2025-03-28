class Solution {
    public long solution(int a, int b) {
        if (a == b) return a; // a와 b가 같으면 바로 리턴

        long sum = 0; // int 대신 long 사용 (오버플로우 방지)

        if (a > b) { // a가 b보다 크다면 b부터 a까지 더함
            for (int i = b; i <= a; i++) {
                sum += i;
            }
        } else { // a가 b보다 작다면 a부터 b까지 더함
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        }

        return sum;
    }
}
