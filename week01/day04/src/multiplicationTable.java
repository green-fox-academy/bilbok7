import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number:");
        int num = sc.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i + " * " + num + " = " + i * num);

        }
    }
}
