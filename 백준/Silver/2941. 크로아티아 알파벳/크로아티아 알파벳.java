import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = 0; 
        
        for(int i=0; i<str.length(); i++){
            
            if(str.charAt(i) == 'c' && i<str.length()-1){
                if(str.charAt(i+1) == '=' || str.charAt(i+1) == '-'){
                    i += 1;
                }
            }
            
            if(str.charAt(i)=='d'&& i<str.length()-1){
                if(i<str.length()-2 && str.charAt(i+1)== 'z'){
                    if(str.charAt(i+2)== '='){
                        i += 2;
                    }
                }
                else if(str.charAt(i+1)== '-'){
                    i += 1;
                }
            }
            
            if(str.charAt(i)=='l' && i < str.length()-1){
                if(str.charAt(i+1) == 'j'){
                    i += 1;
                }
            }
            
            if(str.charAt(i)=='n' && i < str.length()-1){
                if(str.charAt(i+1) == 'j'){
                    i += 1;
                }
            }
            
            if(str.charAt(i)=='s' && i < str.length()-1){
                if(str.charAt(i+1) == '='){
                    i += 1;
                }
            }
            
            if(str.charAt(i)=='z' && i < str.length()-1){
                if(str.charAt(i+1) == '='){
                    i += 1;
                }
            }  
            count++;
        }
            System.out.print(count);        
    }
}