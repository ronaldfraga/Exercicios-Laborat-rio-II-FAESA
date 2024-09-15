import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long fatorial = 1;
        int contador = 1;

        
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = sc.nextInt();

        
        while (contador <= numero) {
            fatorial *= contador;  
            contador++;            
        }

        
        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        
        sc.close();
    }

	}


