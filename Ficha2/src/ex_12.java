import java.util.Scanner;

public class ex_12 {
    public static void main(String[] args) {
        int pontos, j1pontos, j2pontos;
        boolean fail;
        Scanner sc = new Scanner(System.in);
        String cor, vitoria;
        j1pontos = 0;
        j2pontos = 0;
        for (int v = 0; v < 2; v++) {
            pontos = 0;
            for (int m = 0; m < 2; m++) {
                do {
                    fail = false;
                    System.out.printf("Jogador %d introduza a sua %dª jogada: ", v + 1, m + 1);
                    cor = sc.nextLine();
                    switch (cor) {
                        case "castanho":
                            pontos = pontos - 8;
                            break;
                        case "vemelho":
                            pontos = pontos - 4;
                            break;
                        case "branco":
                            pontos = pontos - 2;
                            break;
                        case "amarelo":
                            break;
                        case "verde":
                            pontos = pontos + 4;
                            break;
                        case "azul":
                            pontos = pontos + 8;
                            break;
                        default:
                            fail = true;
                            System.out.println("Cor inválida. Tente outra vez. \n");
                            break;
                    }
                } while (fail);
            }
            if (v==0){
                j1pontos = pontos;
            } else {
                j2pontos = pontos;
            }
        }
        System.out.printf("O jogador 1 teve %d pontos\n", j1pontos);
        System.out.printf("O jogador 2 teve %d pontos\n", j2pontos);
        if (j1pontos > j2pontos) {
            vitoria = "Jogador 1";
        } else {
            vitoria = "Jogador 2";
        }
        System.out.printf("O vencedor é o %s", vitoria);
    }
}
