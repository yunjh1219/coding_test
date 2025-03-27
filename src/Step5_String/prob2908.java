package Step5_String;

import java.util.Scanner;

public class prob2908 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String a = "";
        String b = "";

        for(int i=2; i>=0; i--){
            a += A.charAt(i);
            b += B.charAt(i);
        }

        int reversedA = Integer.parseInt(a);
        int reversedB = Integer.parseInt(b);

        System.out.print(Math.max(reversedA, reversedB));
        sc.close();
    }
}
