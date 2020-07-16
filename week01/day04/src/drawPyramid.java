import java.util.Scanner;

public class drawPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input:");
        int input = sc.nextInt();
        int rows = input, k = 0;

        for(int i = 1; i <= input; ++i, k = 0) {
            for(int space = 1; space <= input - i; ++space) {
                System.out.print("  ");
            }

            while(k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }
}
