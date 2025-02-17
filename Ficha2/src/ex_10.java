import java.util.Scanner;

public class ex_10 {
    public static void main(String[] args) {
        float indice;
        final float lim1=0.3f, lim2=0.4f, lim3=0.5f;
        Scanner sc;

        sc = new Scanner(System.in);
        indice = sc.nextFloat();
        if (indice>0){
            if (indice<lim1){
                System.out.println("Valores aceitáveis");
            } else if (indice<lim2){
                System.out.println("Valores Inaceitáveis. \nIndústrias do 1º grupo devem cessar operações");
            } else if (indice<lim3){
                System.out.println("Valores Inaceitáveis. \nIndústrias do 1º e 2º grupos devem cessar operações");
            } else {
                System.out.println("Valores Inaceitáveis. \nIndústrias do 1º, 2º e 3º grupos devem cessar operações");
            }
        } else{
            System.out.println("Valor Inválido");
        }
    }
}