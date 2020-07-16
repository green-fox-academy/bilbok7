import java.util.Scanner;

public class animalsAndLegs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of chickens:");
        int chicken = sc.nextInt();
        System.out.println("Number of pigs:");
        int pig = sc.nextInt();
        int legs = (chicken * 2) + (pig * 4);
        System.out.println("legs: " + legs);
    }
}
