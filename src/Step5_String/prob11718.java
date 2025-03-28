package Step5_String;

import java.io.*;

public class prob11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while ((s = br.readLine()) != null) { // EOF까지 입력받음
            System.out.println(s);
        }
        br.close();
    }
}