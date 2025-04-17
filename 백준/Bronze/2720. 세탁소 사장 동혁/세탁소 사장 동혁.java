import java.io.*;

public class Main{
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for(int i=0; i<N; i++){
            int mo = Integer.parseInt(br.readLine());
            
            int qu = mo / 25;
            mo %= 25;
            
            int di = mo / 10;
            mo %= 10;
            
            int ni = mo / 5;
            mo %= 5;
            
            int pe = mo / 1;
            
            System.out.println(qu+" "+di+" "+ni+" "+pe+" ");
  
       
        }
    }
}