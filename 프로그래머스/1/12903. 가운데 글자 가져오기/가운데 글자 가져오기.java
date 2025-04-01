class Solution {
    public String solution(String s) {
        
        String a = " ";
        int ban = s.length()/2;
        
        //짝수
        if(s.length() % 2 == 0) {
            a = s.substring(ban-1, ban+1);
            
        }else{
            a = s.substring(ban,ban+1);
        }
        
            return a;
    }
} 