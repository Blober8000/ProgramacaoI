import java.util.Scanner;

public class ex_5_b {
    public static void main(String[] args) {
        float peso, altura, IMC;
        final float LIM1=18.5f, LIM2=25f, LIM3=30f;
        String classe;
        Scanner sc;

        sc = new Scanner(System.in);
        peso=sc.nextFloat();
        altura=sc.nextFloat();

        IMC = (peso/((float)(Math.pow(altura,2))));
        if(IMC <= LIM1){
            classe = "Abaixo do peso normal";
        } else if(IMC <=LIM2){
            classe = "Peso normal";
        } else if (IMC <=LIM3){
            classe = "Acima do peso normal";
        } else {
            classe = "Obesidade";
        }
        System.out.println("O seu IMC é: "+IMC+"e a sua classificação é "+classe);
    }
}