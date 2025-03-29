import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input[] = new int[30];//제출 학생
        int att[] = new int[30];  //총 학생
        boolean stu = false;

        for(int i=0; i<30; i++){   //총 학생에 값 넣기
            att[i] = i+1;          //i+1 → [0] 1번 부터 [29] 30번까지
        }

        for(int i=0; i<28; i++){
            int N = Integer.parseInt(br.readLine());
            input[N-1] = N;        //제출 학생 입력 
        }
        br.close();
        
        for(int i=0; i<30; i++) {
            if (input[i] != att[i]) {
                System.out.println(att[i]);
            }
        }
    }
}