// 1) 문자가 처음인지 아닌지 구분 

class Solution {
    public int[] solution(String s) {
        int arr[] = new int[s.length()];
        arr[0] = -1;
        
        for(int i=1; i<s.length(); i++){
            for(int z=i-1; z>=0; z-- ){
                if(s.charAt(i) == s.charAt(z)){ // 기존에 있던 문자인지 확인
                    arr[i] = i-z;
                    break;
                } else{
                    arr[i] = -1;
                }
            }
        }
        return arr;
    }
}
