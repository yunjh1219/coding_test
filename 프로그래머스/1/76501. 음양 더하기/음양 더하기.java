class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        
        int []arr = new int[absolutes.length];
        boolean[]abb = new boolean[signs.length];
        int sum = 0;
        
        for(int i=0; i<absolutes.length; i++){
            if(signs[i] == false){
               arr[i] = absolutes[i]*(-1);   
        }else {
                arr[i] = absolutes[i];
            }
        }
        
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}