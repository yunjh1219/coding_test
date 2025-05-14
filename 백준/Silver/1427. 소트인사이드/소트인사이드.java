import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String arr = br.readLine();

        char[] ch = arr.toCharArray();
        Arrays.sort(ch);

        for(int i=arr.length()-1; i>=0; i--){
            System.out.print(ch[i]);
        }
    }
}
