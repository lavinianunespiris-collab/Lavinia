package bibiamaperola;
import java.util.Scanner;
public class melissalavinianunespirisgostosa {

	public static void main(String[] args) {


		        Scanner sc = new Scanner(System.in);

		        System.out.print("Digite o primeiro número: ");
		        double a = sc.nextDouble();

		        System.out.print("Digite o segundo número: ");
		        double b = sc.nextDouble();

		        System.out.println("1 - Somar");
		        System.out.println("2 - Subtrair");
		        System.out.println("3 - Multiplicar");
		        System.out.println("4 - Dividir");
		        System.out.print("Opção: ");
		        int op = sc.nextInt();

		        switch(op) {
		            case 1: System.out.println("Resultado: " + (a + b)); break;
		            case 2: System.out.println("Resultado: " + (a - b)); break;
		            case 3: System.out.println("Resultado: " + (a * b)); break;
		            case 4: System.out.println("Resultado: " + (a / b)); break;
		            default: System.out.println("Opção inválida!");
		            
		            sc.close();
		            
		        }
		    }
		

		
	}


