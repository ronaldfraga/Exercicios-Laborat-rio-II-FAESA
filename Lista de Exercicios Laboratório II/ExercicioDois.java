import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		/*
		 * 2) Faça um programa que escreve na tela a mesma frase 10 vezes. E depois faça
		 * com que o programa mostre o número de cada linha no início e no final da
		 * linha, conforme ex: a. 1 Sou um programa Java! 1 b. 2 Sou um programa Java! 2
		 * c. 3 Sou um programa Java! 3 1. ... d. 10 Sou um programa Java! 10
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de linhas que quer repetir a frase: ");
		int numLi = sc.nextInt();
		
		
		for(int i = numLi; i < 10; i++) {
			
			System.out.println(i + " Sou um programa Java" + i);
		}
		
		
		
		
		
		sc.close();
	}

}
