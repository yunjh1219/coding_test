import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        int [] score = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            score[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(score);

        System.out.print(score[N-K]);
    }
}
