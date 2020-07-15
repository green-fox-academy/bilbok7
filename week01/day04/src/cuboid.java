public class cuboid {
    public static void main(String[] args) {
        double a = 10;
        double b = 20;
        double c = 30;
        double surfaceArea = 2 * (a * b + b * c + a * c);
        double volume = a*b*c;

        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume " + volume);
    }
}
