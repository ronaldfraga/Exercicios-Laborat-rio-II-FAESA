import java.util.Scanner;

public class ExercicioDoze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Solicita o número de pessoas
        System.out.print("Digite o número de pessoas: ");
        int n = sc.nextInt();

        // Variáveis para armazenar os resultados
        int iH = 0;
        int iM = 0;
        int countHomensAcima170 = 0;
        double somaAlturasMulheres = 0;
        int countMulheresAltura = 0;

        // Leitura dos dados das pessoas
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a altura da pessoa " + i + " (em metros): ");
            double altura = sc.nextDouble();

            System.out.print("Digite o sexo da pessoa " + i + " (M para masculino e F para feminino): ");
            char sexo = sc.next().charAt(0);

            // Contabiliza o sexo e altura
            if (sexo == 'M' || sexo == 'm') {
                iH++;
                if (altura > 1.70) {
                    countHomensAcima170++;
                }
            } else if (sexo == 'F' || sexo == 'f') {
                iM++;
                somaAlturasMulheres += altura;
                countMulheresAltura++;
            } else {
                System.out.println("Sexo inválido. Use M para masculino e F para feminino.");
            }
        }

        // Calcula a média das alturas das mulheres, se houver mulheres
        double mediaAlturasMulheres = 0;
        if (countMulheresAltura > 0) {
            mediaAlturasMulheres = somaAlturasMulheres / countMulheresAltura;
        }

        // Exibe os resultados
        System.out.println("\nResultados:");
        System.out.println("Quantidade de homens: " + iH);
        System.out.println("Quantidade de mulheres: " + iM);
        System.out.println("Quantidade de homens com altura acima de 1,70m: " + countHomensAcima170);
        System.out.println("Média das alturas das mulheres: " + mediaAlturasMulheres);

        
        sc.close();
    }
}