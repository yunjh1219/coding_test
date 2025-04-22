import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> st = new Stack<>();
        int K = Integer.parseInt(br.readLine());
        int sum = 0;
        
        for(int i=0; i<K; i++){
            int J = Integer.parseInt(br.readLine());
            if(J == 0){
                st.pop();
            } else {
                st.push(J);
            }
        }
        while(!st.isEmpty()){
            sum += st.pop();
        }
        System.out.print(sum);
    }
}