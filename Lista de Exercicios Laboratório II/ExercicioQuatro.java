
public class ExercicioQuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int somaRest = 0;
				
		for( int i = 1; i <= 200; i++) {
		int resto = i % 3;
		somaRest += resto;
		System.out.println("Número: " + i + ", Resto da divisão por 3: " + resto);
					
	}
		System.out.println("A soma dos restos da divisão por 3 dos 200 números é: " + somaRest);
		
}
	}
