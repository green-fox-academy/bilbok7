public class drawChessTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            String a = "";
            for (int j = 1; j <= 8; j++) {
                if ((i + j) % 2 == 0) {
                    a += "%";
                } else {
                    a += " ";
                }
            }
            System.out.println(a);
        }
    }
}
