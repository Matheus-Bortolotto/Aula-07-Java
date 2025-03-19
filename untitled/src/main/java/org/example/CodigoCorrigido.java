import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

class FormatarSimbolos {
    public String FormatarDecimal(double valor) {
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(Locale.US);
        simbolos.setDecimalSeparator('.');
        DecimalFormat formato = new DecimalFormat("#,##0.00", simbolos);
        return formato.format(valor);
    }
}

public class CodigoCorrigido {
    private String[] valoresFormatados;  // Array para armazenar os valores formatados
    private FormatarSimbolos formatarSimbolos = new FormatarSimbolos(); // Instância da classe formatadora

    public void realizarLeituraValores(Scanner scanner, int quantidade) {
        valoresFormatados = new String[quantidade]; // Inicializa o array

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Informar o valor decimal " + (i + 1) + ": ");

            while (!scanner.hasNextDouble()) { // Validação para evitar entrada inválida
                System.out.println("Entrada inválida. Digite um número decimal válido.");
                scanner.next(); // Descarta entrada inválida
            }

            double valor = scanner.nextDouble();
            valoresFormatados[i] = realizarFormatacao(valor);
        }
    }

    public String realizarFormatacao(double valor) {
        return formatarSimbolos.FormatarDecimal(valor);
    }

    public void exibirValoresFormatados() {
        System.out.println("\nValores formatados:");
        for (String valorFormato : valoresFormatados) {
            System.out.println(valorFormato);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CodigoCorrigido app = new CodigoCorrigido(); // Criando instância da classe principal

        try {
            System.out.print("Quantos valores decimais você deseja processar agora? ");
            int quantidade = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

            app.realizarLeituraValores(scanner, quantidade);
            app.exibirValoresFormatados();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
