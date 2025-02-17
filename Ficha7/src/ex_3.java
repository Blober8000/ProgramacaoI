import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class ex_3 {

    public static void main(String[] args) throws FileNotFoundException {
        String pasta = "C:\\Users\\vasco\\Documents\\Programação FMUP\\Ficha7\\";
        String dictxt = "dicionario.txt";
        String arttxt = "artigo.txt";
        String errtxt = "erros.txt";
        File dicionario = new File(pasta + dictxt);
        File artigo = new File(pasta + arttxt);
        File erros = new File(pasta + errtxt);
        Scanner dic = new Scanner(dicionario);
        Scanner art = new Scanner(artigo);
        Formatter err = new Formatter(erros);
        String[] dici;
        String[] arti;
        dici = Armazenar(dic);
        arti = Armazenar(art);
        err.format(semRepetir(Verificar(dici, arti)));
        err.close();
        art.close();
        art = new Scanner(artigo);
        percentagemErradas(art, erros);
        dic.close();
    }

    public static String[] Armazenar(Scanner sc) {
        int flip = 0;
        String[] a = new String[0];
        String[] b = new String[0];
        while (sc.hasNext()) {
            if (flip == 0) {
                a = new String[(b.length + 1)];
                a[0] = sc.next();
                for (int v = 0; v < b.length; v++) {
                    a[v + 1] = b[v];
                }
                flip++;
            } else if (flip == 1) {
                b = new String[(a.length + 1)];
                b[0] = sc.next();
                for (int v = 0; v < a.length; v++) {
                    b[v + 1] = a[v];
                }
                flip--;
            }
        }
        if (a.length > b.length) {
            return a;
        } else {
            return b;
        }
    }

    public static String[] Verificar(String[] dic, String[] art) {
        String[] temp1 = new String[0];
        String[] temp2 = new String[0];
        int flip = 0;
        boolean isthere;
        for (int i = 0; i < art.length; i++) {
            isthere = false;
            for (int j = 0; j < dic.length && !isthere; j++) {
                if ((art[i].equalsIgnoreCase(dic[j]))) {
                    isthere = true;
                }
            }
            if (!isthere) {
                if (flip == 0) {
                    temp1 = new String[(temp2.length + 1)];
                    temp1[0] = art[i];
                    for (int v = 0; v < temp2.length; v++) {
                        temp1[v + 1] = temp2[v];
                    }
                    flip++;
                } else if (flip == 1) {
                    temp2 = new String[(temp1.length + 1)];
                    temp2[0] = art[i];
                    for (int v = 0; v < temp1.length; v++) {
                        temp2[v + 1] = temp1[v];
                    }
                    flip--;
                }
            }
        }
        if (temp1.length > temp2.length) {
            return temp1;
        } else {
            return temp2;
        }
    }

    public static String semRepetir(String[] temp) {
        String line = "";
        for (int i = 0; i < temp.length; i++) {
            for (int j = i + 1; j < temp.length; j++) {
                if (temp[i].equals(temp[j])) {
                    temp[j] = "";
                }
            }
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != "") {
                line = String.format("%s\n%s", line, temp[i]);
            }
        }
        return line;
    }

    public static void percentagemErradas(Scanner art, File erros) throws FileNotFoundException {
        int nPalavrasArt = 0;
        int nPalavrasErradas = 0;
        String a;
        String b;
        Scanner err;
        while (art.hasNext()) {
            nPalavrasArt++;
            a = art.next();
            err = new Scanner(erros);
            while (err.hasNext()) {
                try {
                    b = err.next();
                    if (a.equals(b)) {
                        nPalavrasErradas++;
                    }
                } catch (Exception e) {
                    int c;
                }
            }
        }
        System.out.printf("Das %d palavras no ficheiro.\n%d delas não estão no dicionário.\nO que equivale para %d%% das palavras",nPalavrasArt,nPalavrasErradas,((nPalavrasErradas*100)/nPalavrasArt));
    }
}