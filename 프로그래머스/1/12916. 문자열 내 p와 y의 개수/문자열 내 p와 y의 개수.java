class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int pcunt = 0;
        int ycunt = 0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='p'|| s.charAt(i)=='P'){
                pcunt += 1;
            }
            if(s.charAt(i)=='y'|| s.charAt(i)=='Y'){
                ycunt += 1;
            } 
        }
        
        if(pcunt == ycunt){
            answer = true;
        } else{
            answer = false;
        }
        
        return answer;
    }
}