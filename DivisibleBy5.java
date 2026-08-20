import java.util.Scanner;
class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(n % 5 == 0 ? "Divisible by 5" : "Not Divisible by 5");
    }
}
