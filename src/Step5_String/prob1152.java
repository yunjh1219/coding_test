package Step5_String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class prob1152 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        System.out.print(st.countTokens());

    }
}