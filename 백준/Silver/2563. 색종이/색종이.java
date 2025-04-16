import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        boolean[][] sa = new boolean[100][100];
        int count = 0;
        
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for(int j = a; j < a + 10; j++){
                for(int k = b; k < b + 10; k++){
                    if(!sa[j][k]){
                        sa[j][k] = true;
                        count++;
                    }
                }
            }
        }

        System.out.print(count); // 모든 색종이 처리 후 한 번 출력
    }
}
