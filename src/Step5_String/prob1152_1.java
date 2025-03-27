package Step5_String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class prob1152_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(scan.nextLine(), " ");
        System.out.print(st.countTokens());
    }
}