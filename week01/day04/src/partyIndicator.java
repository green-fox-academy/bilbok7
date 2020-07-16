import java.util.Scanner;

public class partyIndicator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of girls:");
        int girls = sc.nextInt();
        System.out.println("Number of boys:");
        int boys = sc.nextInt();
        if (girls == boys && (girls + boys) >= 20) {
            System.out.println("The party is excellent!");
        } else if ((girls + boys) >= 20 && (boys + girls) % 2 == 1) {
            System.out.println("Quite cool party!");
        } else if ((girls + boys) < 20 && girls > 0) {
            System.out.println("Average party...");
        } else if (girls == 0 && boys > 0) {
            System.out.println("Sausage party");
        }
    }
}
