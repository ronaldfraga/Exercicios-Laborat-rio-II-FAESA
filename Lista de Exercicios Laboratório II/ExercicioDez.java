import java.util.Scanner;

public class ExercicioDez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Solicitar os valores de n e m ao usuário
        System.out.print("Digite o valor de n (número para a tabuada): ");
        int n = sc.nextInt();

        System.out.print("Digite o valor de m (até onde calcular a tabuada): ");
        int m = sc.nextInt();

        // Exibe a tabuada de n até m
        System.out.println("Tabuada de " + n + " de 1 até " + m + ":");
        for (int i = 1; i <= m; i++) {
            // Calcula e exibe cada multiplicação
            System.out.println(i + " x " + n + " = " + (i * n));
        }

        
        sc.close();
    }
}
