import java.util.Scanner;

public class number_pyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        // for (int i = 1; i <= n; i++) {
        // // Spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }

        // // numbers -> print row no, row no times
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // Palindromic Pyramid
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print 1st half numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Print 2nd half numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
