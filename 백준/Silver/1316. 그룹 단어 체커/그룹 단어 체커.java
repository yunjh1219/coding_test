import java.io.*;

public class Main{
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
    public static void main(String[]args) throws IOException{
        int N = Integer.parseInt(br.readLine()); 
        int count = 0;
        
        for(int i=0; i<N; i++){
            if(check()){
                count++;
            }
        }
        System.out.print(count);
        
    }
    
    public static boolean check() throws IOException{
        String str = br.readLine();
        boolean answer[] = new boolean[26];
        int pre =  -1;   
        
        for(int i=0; i<str.length(); i++){
            int now = str.charAt(i) - 'a';   
            if(pre != now){
                if(!answer[now]){ //처음 등장한 문자라면(false일 때)
                    answer[now] =true;
                    pre = now;
                } else{            //처음 등장한 문자가 아니라면
                    return false;  //false 반환
                }
            }
        }
        return true; 
    }
}