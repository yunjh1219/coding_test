import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {

        int count = 0;
        
        // divisor로 나누어 떨어지는 값의 개수를 셈
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                count++;
            }
        }
        
        // 나누어 떨어지는 값이 없으면 {-1} 반환
        if (count == 0) {
            return new int[]{-1};
        }
        
        // 나누어 떨어지는 값을 담을 배열 생성
        int[] num = new int[count];
        int index = 0;
        
        // divisor로 나누어 떨어지는 값들을 num 배열에 저장
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                num[index++] = arr[i];
            }
        }
        
        // 배열 정렬
        Arrays.sort(num);
        
        return num;
    }
}
