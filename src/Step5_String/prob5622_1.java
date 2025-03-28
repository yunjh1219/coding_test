package Step5_String;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prob5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int count = 0;


        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(c < 68)count += 3;
            else if(c<71)count += 4;
            else if(c<74)count += 5;
            else if(c<77)count += 6;
            else if(c<80)count += 7;
            else if(c<84)count += 8;
            else if(c<87)count += 9;
            else if(c<91)count +=10;
        }

        System.out.print(count);

    }
}
