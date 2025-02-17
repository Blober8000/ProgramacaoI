import java.util.Scanner;

public class ex_7 {
    public static void main(String[] args) {
        Scanner sc;
        int nPacientes, tensaoS, tensaoD;
        String class1, class2;
        boolean repete;

        sc = new Scanner(System.in);
        class1 = "";
        class2 = "";
        do {
            nPacientes = sc.nextInt();
        } while (nPacientes < 0);
        for (int v = 0; v < nPacientes; v++) {
            do {
                tensaoS = sc.nextInt();
                if (tensaoS < 120) {
                    class1 = "normal";
                } else if (tensaoS < 140) {
                    class1 = "pré-hipertensão";
                } else if (tensaoS < 160) {
                    class1 = "hipertensão estágio 1";
                } else {
                    class1 = "hipertensão estágio 2";
                }
                tensaoD = sc.nextInt();
                if (tensaoD < 80) {
                    class2 = "normal";
                } else if (tensaoD < 90) {
                    class2 = "pré-hipertensão";
                } else if (tensaoD < 100) {
                    class2 = "hipertensão estágio 1";
                } else {
                    class2 = "hipertensão estágio 2";
                }
                if (!class1.equals(class2)) {
                    System.out.println("Erro introduza outra vez");
                    repete = true;
                } else {
                    System.out.printf("A sua tensão está: %s\n", class1);
                    repete = false;
                }
            } while (repete);
        }
    }
}