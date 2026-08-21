import java.util.Scanner;
class CountOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 0;

        while (n > 0) {
            if ((n % 10) % 2 != 0) count++;
            n /= 10;
        }

        System.out.println(count);
    }
}
