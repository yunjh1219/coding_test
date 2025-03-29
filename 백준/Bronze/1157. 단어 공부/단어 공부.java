import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine(); 
        String str = st.toLowerCase(); // 대소문자 구분 없이 처리하기 위해 소문자로 반환 
        
        int arr[] = new int[26]; // a부터 z까지 알파벳의 등장 횟수를 셀 배열 
        
        
        for(int i=0; i<str.length(); i++){
             arr[str.charAt(i) - 'a']++;   //a = 0 , b = 1 , ... , z = 25
        }                                  //arr[0] = 5 라는 것은 a가 5번 나왔다는 것 
        
        int max = -1;  //최댓값 구할 정수
        char ch = '?'; //결과를 저장할 변수 
        
        for(int i=0; i<26; i++){
            if(arr[i] > max){
                max = arr[i];
                ch = (char)(i + 'A'); //[0]이 제일 많다? 0 + 'a' = a 
            } else if(arr[i] == max){
                ch = '?';
            }
        }
        System.out.print(ch);
    }
}