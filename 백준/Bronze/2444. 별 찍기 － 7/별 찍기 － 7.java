// *의 갯수가 N까지 2N-1의 형식으로 증가
// 이후부터는 *의 갯수가 N-1까지 2N-1 형식으로 감소
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        for(int i=1; i<=N; i++){
            for(int j=0; j<N-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=N-2; i>=0; i--){
            for(int j=1; j<N-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i*2+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}