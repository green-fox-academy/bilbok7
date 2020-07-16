import java.util.Scanner;

public class printBigger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me 2 number:");
        int first = sc.nextInt();
        int second = sc.nextInt();
        if (first > second) {
            System.out.println(first);
        } else if (first < second) {
            System.out.println(second);
        } else {
            System.out.println("They are equal");
        }
    }
}
