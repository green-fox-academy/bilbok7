import java.util.Scanner;

public class parametricAverage {
    public static void main(String[] args) {
        System.out.println("How many number want you work with?");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 0;
        if (n <= 0) {
            System.out.println("Invalid input");
        } else {

            for (int i = 1; i <= n; i++) {
                System.out.println("Type " + i + ". number:");
                a += s.nextInt();
            }
            System.out.println("Sum: " + a + ", Avarage: " + (float) a / n);
        }
    }
}
