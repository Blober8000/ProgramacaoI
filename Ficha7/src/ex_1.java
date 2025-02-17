import java.io.File;
import java.io.IOException;
import java.util.Formatter;

public class ex_1 {
    public static void main(String[] args) throws IOException {
        File dados = new File("C:\\Users\\vasco\\Documents\\Programação FMUP\\Ficha7\\dados.txt");
        dados.createNewFile();
        Formatter out = new Formatter(dados);
        out.format("A UC de Programação I tem com objetivos: \n- Conceção de algoritmos aplicando boas práticas de programação; \n- Codificação de algoritmos em linguagem Java (na perspetiva procedimental); \n- Aplicação de testes aos programas; \n- Aplicação dos conhecimentos adquiridos à resolução de problemas do mundo real; \n- Promoção de atitudes de aprendizagem ativa, colaborativa e responsável, de trabalho persistente e de aplicação de espírito crítico na análise e resolução de problemas.");
        out.close();
    }
}