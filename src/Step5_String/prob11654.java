package Step5_String;

import java.util.*;

public class prob11654 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char ch = sc.nextLine().charAt(0);
        int a = (int)ch; // char를 int로 강제 형변환, 아스키코드값을 반환한다.

        System.out.print(a);
    }
}
