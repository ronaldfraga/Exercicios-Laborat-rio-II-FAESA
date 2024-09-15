import java.util.Scanner;

public class ExercicioOnze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        double soma = 0;
        int i = 0;
        int positivos = 0;
        int negativos = 0;
        double valor;

        // Início da leitura dos valores
        System.out.println("Digite valores (0 para encerrar):");

        while (true) {
            // Leitura do valor
            System.out.print("Digite um valor: ");
            valor = sc.nextDouble();

            
            if (valor == 0) {
                break;
            }
            
            soma += valor;
           
            i++;

            
            if (valor > 0) {
                positivos++;
            } else if (valor < 0) {
                negativos++;
            }
        }

        // Verifica se foram inseridos valores (para evitar divisão por zero)
        if (i > 0) {
           double media = soma / i;
           double percentualNegativos = ((double) negativos / i) * 100;

            // Exibe os resultados
            System.out.println("\nResultados:");
            System.out.println("Média aritmética: " + media);
            System.out.println("Quantidade de valores positivos: " + positivos);
            System.out.println("Percentual de valores negativos: " + percentualNegativos + "%");
        } else {
            System.out.println("Nenhum valor válido foi inserido.");
        }

        // Fecha o scanner
        sc.close();
    }
}