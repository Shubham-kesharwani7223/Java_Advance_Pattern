import java.util.Scanner;

public class Pascals_triangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        // Pascal's Triangle
        for (int i = 0; i < n; i++) {
            // Spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            int num = 1;
            // Print numbers
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
