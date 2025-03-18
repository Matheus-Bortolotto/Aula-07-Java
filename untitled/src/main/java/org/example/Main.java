package org.example;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos valores decimais vc quer processar: ");
        int quantidadeDosValores = scanner.nextInt();

        double[] valores = new double[quantidadeDosValores];

        // Corrigindo o laço for e a leitura de valores decimais
        for (int i = 0; i < quantidadeDosValores; i++) {
            System.out.print("Digite o valor decimal " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
        }

        // Configura o simbolo decimal para ponto
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(Locale.US);
        simbolos.setDecimalSeparator('.');

        // Aplica o formato desejado
        DecimalFormat formato = new DecimalFormat("#.##", simbolos);

        // Formata e exibe os valores
        for (double valor : valores) {
            String valorFormatado = formato.format(valor);
            System.out.println("Valor formatado: " + valorFormatado);
        }
    }
}
