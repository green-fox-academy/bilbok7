public class Sum {
    public static void main(String[] args) {

        System.out.println(sum(10));
    }
    public static int sum (int x) {
        if (x == 0) return 0;
        return x + sum (x - 1);
    }
}
