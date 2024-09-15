

public class ExercicioNove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 50; // Definindo que o número de termos é 50
        double soma = 0.0;

        // Loop para calcular a série de frações
        for (int i = 1; i <= n; i++) {
            soma += 1.0 / i;
            // Exibe cada termo da série e a soma parcial
            System.out.println("1/" + i + " = " + (1.0 / i) + ", Soma parcial = " + soma);
        }

        // Exibe o resultado final
        System.out.println("A soma da série para os 50 primeiros termos é: " + soma);
    }

	}


