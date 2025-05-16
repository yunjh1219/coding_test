import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] res = new int[commands.length];
      
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1] - 1;
            int point = commands[i][2] - 1;

            int num = end - start + 1;
            int[] arr = new int[num];
            int count = 0;

            for (int j = start; j <= end; j++) {
                arr[count] = array[j];
                count++;
            }

            Arrays.sort(arr);
            res[i] = arr[point];
        }
        
        return res;
    }
}
