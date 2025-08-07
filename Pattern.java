import java.util.Scanner;

class Pattern {
    public static void main(String[] args) {
        int n, i, j;
        Scanner s = new Scanner(System.in);
        System.out.println("enter no:");
        n = s.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}