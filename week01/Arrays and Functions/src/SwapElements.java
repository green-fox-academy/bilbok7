import org.w3c.dom.ls.LSOutput;

public class SwapElements {
    public static void main(String[] args) {
        String[] orders = {"first", "second", "third"};
        String swap = orders[0];
        orders[0] = orders[2];
        orders[2] = swap;

        for ( String i : orders) {
            System.out.println(i);
        }
    }

}
