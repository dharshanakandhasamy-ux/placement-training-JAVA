import java.util.Scanner;
class Divisible5And11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 5 == 0 && n % 11 == 0)
            System.out.println("Divisible");
        else
            System.out.println("Not Divisible");
    }
}