class Solution {
    public int solution(int[] num_list) {
        
        int sum = 0;
        int result = 1;
        
        // 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합
        if(num_list.length >= 11){
            for(int i=0; i<num_list.length; i++){
                sum += num_list[i];
            }
            return sum;
        }
        
        // 10 이하이면 모든 원소의 곱을
        else {
          for(int i=0; i<num_list.length; i++){
              result *= num_list[i];
          }   
            return result;
        }
    }
}