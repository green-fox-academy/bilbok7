import java.util.Scanner;

public class countFromTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me two number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("The second number should be bigger");
        } else if (num2 > num1) {
            for (int i = num1; i < num2 ; i++) {
                System.out.println(i);
            }
        }
    }
}
