class Solution {
    public int solution(int[] numbers) {
        
        int sum = 0;
        int sum1 = 0;
        
        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }
        for(int i=1; i<=9; i++){
            sum1 += i;
        }
        
        return sum1-sum;
    }
}