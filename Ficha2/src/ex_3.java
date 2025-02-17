import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        float volume, area, aresta;
        final int LIM1=1, LIM2=2;
        String tamanho;
        Scanner sc;

        sc = new Scanner(System.in);
        area = sc.nextFloat();

        if (area > 0){
            aresta = (float)Math.sqrt(area/6);
            volume = (float)Math.pow(aresta,3);
            if (volume <=LIM1){
                tamanho = "Pequeno";
            }
            else if(volume > LIM2){
                tamanho = "Grande";
            }
            else{
                tamanho = "Médio";
            }
            System.out.println("O tamanho do cubo é: "+volume+"cm^3 e é "+tamanho);
        }
        else{
            System.out.println("Valor da área incorreto");
        }
    }
}