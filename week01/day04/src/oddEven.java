import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input:");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}
