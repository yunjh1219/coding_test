import java.io.*;
import java.util.*;

public class Main{
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [][] arr = new int[9][9];

        int a = 0;
        int b = 0;

        for(int i=0; i<arr.length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                max = Math.max(max, arr[i][j]);
            }
        }


        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(max == arr[i][j]){
                    a = i+1;
                    b = j+1;
                    break ;
                }
            }
        }
        System.out.println(max );
        System.out.print(a+" "+b);
    }
}