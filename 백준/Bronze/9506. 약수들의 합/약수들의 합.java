import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        while(true){
            StringBuilder sb = new StringBuilder();
            int N = Integer.parseInt(br.readLine());
            int sum = 0;

            if(N == -1){ // -1이면 반복을 종료한다.
                return;
            }
            for(int i=1; i<N; i++){
                if(N%i == 0){ //i가 N의 약수일 때만 실행
                    sum += i; //N을 제외한 i의 약수를 모두 + 한다.
                }
            }
            if(sum == N){ //N 자신을 제외한 모든 약수들의 합이 N과 같으면 완전수이다.
                sb.append(N + " = 1");
                for(int i=2;  i<N; i++){
                    if(N%i == 0){
                        sb.append(" + "+i);
                    }
                }
            } else { //완전수가 아닌 경우
                sb.append(N+" is NOT perfect.");
            }
            System.out.println(sb);
        }
    }
}