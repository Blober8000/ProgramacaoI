public class ex_16 {
    public static void main(String[] args) {
        boolean bissexto;

        for (int v = 1899; v < 2100; v++) {
            bissexto = false;
            if (v % 4 == 0) {
                bissexto = true;
                if (v % 100 == 0) {
                    bissexto = false;
                    if (v % 400 == 0) bissexto = true;
                }
            }
            if (bissexto) System.out.println(v);
        }
    }
}