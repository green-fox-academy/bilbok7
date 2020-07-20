public class Factorial {
    public static void main(String[] args) {

        System.out.println(factorio(5));
    }
    public static int factorio (int x) {
        if (x == 0) return 1;
        return x * factorio(x - 1);
    }
}
