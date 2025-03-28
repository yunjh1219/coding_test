package Step5_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prob5622_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int dial[] = {3, 3, 3,         // A B C  [0][1][2] = 3번 이동
                      4, 4, 4,         // D E F  [3][4][5] = 4번 이동
                      5, 5, 5,
                      6, 6, 6,
                      7, 7, 7,
                      8, 8, 8, 8,       // P Q R S
                      9, 9, 9,
                      10, 10, 10, 10};
        int count = 0;

        for(int i=0; i<s.length(); i++){
            count += dial[s.charAt(i) - 'A'];  // s.charAt(i) - 'A' 를 하면 해당 문자를 0~25 사이의 값으로 찾을 수 있다.
        }                                      // dial[s.charAt(i) - 'A'] 문자에 해당하는 다이얼 시간을 바로 찾을 수 있다

        System.out.print(count);

    }
}
