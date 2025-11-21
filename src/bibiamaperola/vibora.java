package bibiamaperola;
import java.util.Scanner;
public class vibora {

	public static void main(String[] args) {
		

		        Scanner sc = new Scanner(System.in);

		        while (true) {
		            System.out.print("Peso (<=0 para sair): ");
		            double peso = sc.nextDouble();

		            System.out.print("Altura (<=0 para sair): ");
		            double altura = sc.nextDouble();

		            if (peso <= 0 || altura <= 0) {
		                System.out.println("Encerrando...");
		                break;
		            }

		            double imc = peso / (altura * altura);
		            System.out.println("IMC: " + imc);
		            
		            sc.close();
		        }
		    }
		


	}


