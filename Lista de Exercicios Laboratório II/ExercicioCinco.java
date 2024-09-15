import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        double maiorAltura = 0;
        double segundaMaiorAltura = 0;
        double altura;

        
        System.out.println("Digite a altura das moças (digite 0 para encerrar):");

        while (true) {
            
            System.out.print("Altura: ");
            altura = sc.nextDouble();

            
            if (altura == 0) {
                break;
            }

            
            if (altura > maiorAltura) {
                segundaMaiorAltura = maiorAltura;
                maiorAltura = altura;
            } else if (altura > segundaMaiorAltura) {
                segundaMaiorAltura = altura;
            }

          
            System.out.println("Maior altura atual: " + maiorAltura);
            System.out.println("Segunda maior altura atual: " + segundaMaiorAltura);
        }

       
        if (maiorAltura > 0) {
            System.out.println("A maior altura é: " + maiorAltura);
            System.out.println("A segunda maior altura é: " + segundaMaiorAltura);
        } else {
            System.out.println("Nenhuma altura válida foi inserida.");
        }

        
        sc.close();
    }
}


