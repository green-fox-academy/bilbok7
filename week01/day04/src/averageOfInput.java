import java.util.Scanner;

public class averageOfInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first number:");
        int first = sc.nextInt();
        System.out.println("second number:");
        int second = sc.nextInt();
        System.out.println("third number:");
        int third = sc.nextInt();
        System.out.println("fourth number:");
        int fourth = sc.nextInt();
        System.out.println("fifth number:");
        int fifth = sc.nextInt();

        System.out.println("Sum: " + (first + second + third + fourth + fifth) + ", Average: " + (first + second + third + fourth + fifth) / 5);

    }
}
