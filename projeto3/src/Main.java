import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    static final String FilePacientes = "pacientes.txt";
    static final String FileMedicoes = "medições.txt";
    static final int TipoSinalVital = 3;
    static final int Identificador = 2;

    public static void main(String[] args) throws IOException, NumberFormatException {
        String[][] matrizPacientes;
        float[][] matrizMedicoes;
        matrizPacientes = criarMatriz(FilePacientes);
        matrizMedicoes = criarMatriz2(FileMedicoes);
        menu(matrizMedicoes, matrizPacientes);
        ordenacao(matrizPacientes, matrizMedicoes);
    }

    // metodo para criar a 1ªmatriz a partir de ficheiros
    public static String[][] criarMatriz(String ficheiroP) throws FileNotFoundException {
        String[][] matrix;
        Scanner sc = new Scanner(new File(ficheiroP));
        int nLinhas = 0;
        while (sc.hasNextLine()) {
            sc.nextLine();
            nLinhas++;
        }
        sc.close();
        matrix = new String[nLinhas][Identificador];
        nLinhas = 0;
        sc = new Scanner(new File(ficheiroP));
        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            matrix[nLinhas] = linha.split(";");
            nLinhas++;
        }
        sc.close();
        return matrix;
    }

    //metodo para criar a 2ªmatriz a partir de ficheiros
    public static float[][] criarMatriz2(String ficheiro) throws NumberFormatException, FileNotFoundException {
        float[][] matrix2;
        int nLinhas;
        nLinhas = 0;
        Scanner input = new Scanner(new File(ficheiro));
        while (input.hasNextLine()) {
            input.nextLine();
            nLinhas++;
        }
        matrix2 = new float[nLinhas][TipoSinalVital];
        input.close();
        input = new Scanner(new File(ficheiro));
        String[] temp;
        nLinhas = 0;
        for (int i = 0; i < matrix2.length; i++) {
            String linha = input.nextLine();
            temp = linha.split(";");
            for (int k = 0; k < TipoSinalVital; k++) {
                matrix2[nLinhas][k] = Float.parseFloat(temp[k]);
            }
            nLinhas++;
        }
        input.close();
        return matrix2;
    }


    //metodo para ordenar as matrizes por ordem crescente do id de paciente
    public static void ordenacao(String[][] matrix, float[][] matrix2) {
        int n = matrix2.length;
        String temporaria;
        float temporaria2;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matrix[i][0].compareTo(matrix[j][0]) > 0) {
                    temporaria = matrix[i][0];
                    matrix[i][0] = matrix[j][0];
                    matrix[j][0] = temporaria;
                    temporaria2 = matrix2[i][0];
                    matrix2[i][0] = matrix2[j][0];
                    matrix2[j][0] = temporaria2;
                }
            }
        }
    }


    // metodo para ler e visualizar as matrizes
    public static void lerVisualizar(String[][] matrix, float[][] matrix2) {
        System.out.printf("%25s%20s%15s%25s", "Identificação do paciente", "Frequência cardíaca", "Temperatura", "Saturação de oxigénio");
        int nLinhas = matrix.length;
        int i;

        for (i = 0; i < nLinhas; i++) {
            System.out.printf("%n %20s %20.1f %20.1f %20.1f", matrix[i][0], matrix2[i][0], matrix2[i][1], matrix2[i][2]);
        }
    }


    //metodo para fazer a alteracao de sinais vitais
    public static void alterarSinaisVitais(String[][] matrix, float[][] matrix2) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nInsira a percentagem de alteração (positiva ou negativa), entre -100 e 100: ");
        float percentagem = in.nextFloat() / 100.0f;
        while (percentagem < -1 || percentagem > 1) {
            System.out.println("Valor inválido. Introduza um novo valor de percentagem: ");
            percentagem = in.nextFloat() / 100.0f;
        }
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] += (matrix2[i][j] * percentagem);
            }
        }
        lerVisualizar(matrix, matrix2);
        System.out.println("\nAlteração aplicada com sucesso!");
    }


    // metodo do menu de escolha da funcionalidade a executar
    public static void menu(float[][] matrix2, String[][] matrix) throws IOException {
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1. Visualizar dados");
            System.out.println("2. Alterar sinais vitais");
            System.out.println("3. Percentagem de pacientes críticos");
            System.out.println("4. Identificar paciente com maior risco");
            System.out.println("5. Acrescentar dados de um novo paciente");
            System.out.println("6. Carregar dados de ficheiro");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção: ");
            int opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    lerVisualizar(matrix, matrix2);
                    break;
                case 2:
                    alterarSinaisVitais(matrix, matrix2);
                    break;
                case 3:
                    calcularPercentagemCriticos(matrix2);
                    break;
                case 4:
                    identificarPacienteMaiorRisco(matrix, matrix2);
                    break;
                case 5:
                    matrix = acrescentarPacienteMatrix(matrix);
                    matrix2 = acrescentarPacienteMatrix2(matrix2);
                    lerVisualizar(matrix, matrix2);
                    break;
                case 6:
                    guardarFicheiro(matrix, matrix2);
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    continuar = false;
                    teclado.close();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }
    }


    // metodo para calcular a percentagem de pacientes em estado critico
    public static void calcularPercentagemCriticos(float[][] matrix2) {
        int criticos = 0;

        for (float[] sinais : matrix2) {
            if (sinais[0] < 60 || sinais[0] > 120 || sinais[1] < 36 || sinais[1] > 38.5 || sinais[2] < 90) {
                criticos++;
            }
        }
        double percentagem = ((double) criticos / matrix2.length) * 100;
        System.out.printf("\nPercentagem de pacientes em situação crítica: %.2f%%%n", percentagem);
    }


    //metodo para calcular o score de gravidade de cada paciente
    public static float[] calcularScoreRiscoPacientes(String[][] matrix, float[][] matrix2) {
        int i;
        float scoreGravidade;
        int NumRegistos = matrix.length;
        float[] matrixScores = new float[NumRegistos];
        for (i = 0; i < NumRegistos; i++) {
            float heartRateScore = scoreFreqCardi(matrix2[i][0]);
            float temperatureScore = scoreTemperatura(matrix2[i][1]);
            float o2SatScore = scoreSatOxi(matrix2[i][2]);

            scoreGravidade = (heartRateScore * 0.3f) + (temperatureScore * 0.4f) + (o2SatScore * 0.3f);
            System.out.printf("Score de risco do paciente %s : %.2f - ", matrix[i][0], scoreGravidade);
            interpretarScore(scoreGravidade);
            matrixScores[i] = scoreGravidade;
        }
        return matrixScores;
    }


    //metodo para calcular o score de frequência cardíaca
    public static float scoreFreqCardi(float heartRate) {
        if (heartRate >= 60 && heartRate <= 100) return 1;
        if ((heartRate > 100 && heartRate <= 120) || (heartRate >= 50 && heartRate < 60)) return 2;
        if ((heartRate > 120 && heartRate <= 140) || (heartRate >= 40 && heartRate < 50)) return 3;
        if ((heartRate > 140 && heartRate <= 160) || (heartRate >= 30 && heartRate < 40)) return 4;
        return 5;
    }

    //metodo para calcular o score de temperatura
    public static float scoreTemperatura(float temperature) {
        if (temperature >= 36.1 && temperature <= 37.5) return 1;
        if (temperature > 37.5 && temperature <= 38.0) return 2;
        if ((temperature > 38.0 && temperature <= 39.0) || (temperature >= 35.5 && temperature < 36.1)) return 3;
        if ((temperature > 39.0 && temperature <= 40.0) || (temperature >= 35.0 && temperature < 35.5)) return 4;
        return 5;
    }

    //metodo para calcular o score de saturação de oxigénio
    public static float scoreSatOxi(float o2Sat) {
        if (o2Sat > 95) return 1;
        if (o2Sat >= 91) return 2;
        if (o2Sat >= 86) return 3;
        if (o2Sat >= 81) return 4;
        return 5;
    }

    //metodo para interpretar o score de cada paciente
    public static void interpretarScore(float score) {
        if (score <= 2) System.out.println("Gravidade baixa.");
        else if (score <= 3.5) System.out.println("Gravidade moderada.");
        else System.out.println("Gravidade alta.");
    }

    //metodo para identificar o paciente com maior risco
    public static void identificarPacienteMaiorRisco(String[][] matrix, float[][] matrix2) {
        float maiorScore = -1;
        int indiceMaiorRisco = -1, NumRegistos = matrix.length;
        float[] score;
        score = calcularScoreRiscoPacientes(matrix, matrix2);
        for (int i = 0; i < NumRegistos; i++) {
            if (score[i] > maiorScore) {
                maiorScore = score[i];
                indiceMaiorRisco = i;
            }
        }
        if (indiceMaiorRisco != -1) {
            System.out.printf("Paciente com maior risco: %s na data %s com score %.2f%n", matrix[indiceMaiorRisco][0], matrix[indiceMaiorRisco][1], maiorScore);
        }
    }


    //metodo para acrescentar pacientes
    public static String[][] acrescentarPacienteMatrix(String[][] matrix) {
        int NumRegistos = matrix.length;
        Scanner teclado = new Scanner(System.in);
        String[][] novamatrix = new String[NumRegistos + 1][Identificador];
        for (int i = 0; i < NumRegistos; i++) {
            System.arraycopy(matrix[i], 0, novamatrix[i], 0, Identificador);
        }
        System.out.println("Introduza o número de identificação do novo paciente. ");
        novamatrix[NumRegistos][0] = teclado.next();
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        String formattedDateTime = currentDateTime.format(formatter);
        novamatrix[NumRegistos][1] = formattedDateTime;
        return novamatrix;
    }

    public static float[][] acrescentarPacienteMatrix2(float[][] matrix2) {
        int NumRegistos = matrix2.length;
        float[][] novamatrix2 = new float[NumRegistos + 1][TipoSinalVital];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < NumRegistos; i++) {
            System.arraycopy(matrix2[i], 0, novamatrix2[i], 0, TipoSinalVital);
        }
        System.out.println("Introduza o valor da frequência cardíaca.");
        novamatrix2[NumRegistos][0] = teclado.nextFloat();
        System.out.println("Introduza o valor da temperatura.");
        novamatrix2[NumRegistos][1] = teclado.nextFloat();
        System.out.println("Introduza o valor da saturação de oxigénio.");
        novamatrix2[NumRegistos][2] = teclado.nextFloat();
        return novamatrix2;
    }

    //metodo para guardar a nova matriz no ficheiro
    public static void guardarFicheiro(String[][] matrix, float[][] matrix2) throws IOException {
        int NumRegistos = matrix.length;
        try (PrintWriter patientWriter = new PrintWriter(new FileWriter(FilePacientes));
             PrintWriter vitalSignsWriter = new PrintWriter(new FileWriter(FileMedicoes))) {

            for (int i = 0; i < NumRegistos; i++) {
                patientWriter.println(matrix[i][0] + ";" + matrix[i][1]);
                vitalSignsWriter.printf("%.1f;%.1f;%.1f%n",
                        matrix2[i][0],
                        matrix2[i][1],

                        matrix2[i][2]
                );
            }
            System.out.println("Dados guardados com sucesso!");

        }
    }
}

