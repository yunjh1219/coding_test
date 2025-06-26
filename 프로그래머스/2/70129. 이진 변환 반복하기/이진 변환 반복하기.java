class Solution {
    public int[] solution(String s) {
        int count = 0;
        int zeroCount = 0;
        
        while(!s.equals("1")){
            int beforLength = s.length();
            s = s.replace("0","");
            int afterLength = s.length();
            
            zeroCount += (beforLength - afterLength); // 제거된 0의 갯수
            s = Integer.toBinaryString(afterLength); // 0 제거 후 길이를 이진 변환 
            count ++;
        }
        
        return new int[] {count, zeroCount};
    }
}