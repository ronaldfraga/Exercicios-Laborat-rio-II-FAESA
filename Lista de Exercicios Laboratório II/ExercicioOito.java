import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Solicitar os valores de A e B ao usuário
        System.out.print("Digite o valor de A: ");
        int A = sc.nextInt();
        
        System.out.print("Digite o valor de B: ");
        int B = sc.nextInt();

        // Garantir que A seja menor que B
        if (A > B) {
            int temp = A;
            A = B;
            B = temp;
        }

        int soma = 0;

        // Loop para calcular a soma dos inteiros entre A e B
        for (int i = A + 1; i < B; i++) {
            soma += i;
        }

        
        System.out.println("A soma dos inteiros entre " + A + " e " + B + " é: " + soma);

        
        sc.close();
    }

	}


