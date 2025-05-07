import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            String str[] = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            
            if(a == b && a == 0){
                break;
            } else{
              if(b % a == 0){
                  System.out.println("factor");
              } else if( a % b == 0){
                  System.out.println("multiple");
              } else {
                  System.out.println("neither");
              }
            }
        }
        
    }
}