import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int number = 666;
        
        while(N != count){
            number++;
            if(String.valueOf(number).contains("666")){
                count++;
            }
        }
        System.out.print(number);
    }
}