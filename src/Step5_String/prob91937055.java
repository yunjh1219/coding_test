package Step5_String;

import java.util.Scanner;

public class prob91937055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next(); //띄어쓰기가 필요 없어서 nextLine() 이 아닌 next() 사용

        int sum = 0;

        for(int i=0; i<n; i++ ) {
            sum += str.charAt(i) - '0'; //아스키코드를 정수 1부터 바꾸는 법
        }
        System.out.print(sum);
    }
}