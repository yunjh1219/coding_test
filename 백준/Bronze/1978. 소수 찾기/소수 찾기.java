import java.util.Scanner;

public class Main {
    // 소수 판별 메서드
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 수의 개수 입력
        int count = 0;

        for (int i = 0; i < N; i++) {
            int number = sc.nextInt();
            if (isPrime(number)) {
                count++;
            }
        }

        System.out.println(count);  // 소수의 개수 출력
    }
}
