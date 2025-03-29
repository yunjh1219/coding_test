import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();  //문자열 입력 
        StringBuilder sb = new StringBuilder(str); //빌더 변환
        sb.reverse(); //역순
        String rts = sb.toString(); //다시 문자열 변환
        int ans = 1;
        
        
        if(str.equals(rts)){ //둘이 값 비교
            System.out.print(ans);
        } else {
            ans = 0;
            System.out.print(ans);
        }
    }
}