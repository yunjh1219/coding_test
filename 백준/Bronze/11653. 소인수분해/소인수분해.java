import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                System.out.println(i);
                N /= i;
            }
        }

        // 남은 수가 1보다 크면 그것도 소수이므로 출력
        if (N > 1) {
            System.out.println(N);
        }
    }
}
