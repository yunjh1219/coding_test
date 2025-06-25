class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int[] num = new int[str.length];
        
        for(int i=0; i<num.length; i++){
            num[i] = Integer.parseInt(str[i]);
        }
        
        int max = num[0];
        int min = num[0];
        
        for(int i=0; i<num.length; i++){
            max = Math.max(max, num[i]);
            min = Math.min(min, num[i]);
        }
        
        String result = min + " " + max;
        return result;
        
    }
}