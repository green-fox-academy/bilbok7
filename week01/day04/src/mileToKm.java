import java.util.Scanner;

public class mileToKm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Distance in miles:");
        double miles = sc.nextDouble();
        double km = miles * 1.6;
        System.out.println("km: " + km);
    }
}
