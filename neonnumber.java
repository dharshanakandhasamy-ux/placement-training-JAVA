import java.util.Scanner;
class Neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), square = n * n, sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }

        System.out.println(sum == n ? "Neon" : "Not Neon");
    }
}
