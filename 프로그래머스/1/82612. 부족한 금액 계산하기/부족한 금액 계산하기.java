class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0; // 금액이 부족하지 않으면 0 리턴
        long sum = 0;
        for(int i = 1; i <= count; i++) {
            sum += price * i;
        }
        if(money < sum) {
            answer = sum - money;
        }
        return answer;
    }
}