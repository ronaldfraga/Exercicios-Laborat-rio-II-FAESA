import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		/*
		 * 3) Faça um programa que vai pedindo números ao usuário até que este introduza
		 * o número -1. O computador deve dizer a média dos números introduzidos
		 * (excluindo o - 1).
		 */
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		int num = 0;
		int i = 0;
		
		// importando numero
		while (true) {
			num = sc.nextInt();
			if(num  == -1) {
				break;
					
			}
			soma += num;
			i++;
		}
		if( i  > 0) {
			double media = soma / i;
			System.out.println("A soma das medias dos numeros é: "+ media);
		}
		else {
			System.out.println("Um numero inválido foi inserido");
		}
		sc.close();
	
	}
	}
