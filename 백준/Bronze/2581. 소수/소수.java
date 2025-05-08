import java.io.*;

public class Main {

    public static boolean isPrime(int a){
        if(a < 2) return false;
        for(int i=2; i*i<=a; i++){
            if(a%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = 10000;

        for(int i=M; i<=N; i++){
            if(isPrime(i)){
                sum += i;
                if(i < min){
                    min = i ;
                }
            }
        }

        if (sum == 0){
            System.out.print(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}