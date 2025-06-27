class Solution {
    public int solution(int n) {
        String s  = Integer.toBinaryString(n).replace("0","");
        int num = 0;
        
        for(int i=n+1; i>n; i++){
            String p = Integer.toBinaryString(i).replace("0", "");
            num = i;
            if(s.length() == p.length()){
                break;
            }
        }
        return num;
    }
}