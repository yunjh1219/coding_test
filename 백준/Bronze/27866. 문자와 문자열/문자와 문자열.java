import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char []cr = str.toCharArray();

        int N = Integer.parseInt(br.readLine());

        System.out.print(str.charAt(N-1));

    }
}