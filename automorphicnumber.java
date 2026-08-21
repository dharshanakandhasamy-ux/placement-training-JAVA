import java.util.Scanner;
class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int square = n * n;

        System.out.println(square % 100 == n ? "Automorphic" : "Not Automorphic");
    }
}
