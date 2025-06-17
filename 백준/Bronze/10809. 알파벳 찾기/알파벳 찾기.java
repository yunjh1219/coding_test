import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int tmp[] = new int[26];
        
        for(int i=0; i<26; i++){
            tmp[i] = -1;
        }
        
        for(int i=0; i<str.length(); i++){
            int index = str.charAt(i) - 'a';
            if(tmp[index] == -1){
                tmp[index] = i;
            }
        }
        
        for(int k : tmp){
            System.out.print(k+" ");
        }
        
    }
}