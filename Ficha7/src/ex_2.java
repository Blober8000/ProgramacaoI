import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) throws FileNotFoundException {
        File dados = new File("C:\\Users\\vasco\\Documents\\Programação FMUP\\Ficha7\\dados.txt");
        Scanner in = new Scanner(dados);
        String line = "";
        while (in.hasNextLine()) {
            line = String.format("%s\n%s",line,in.nextLine());
        }
        System.out.println(line);
        in.close();
    }
}
