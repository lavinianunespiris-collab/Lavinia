package bibiamaperola;
import java.util.Scanner;
public class shifu {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Quantidade de animais: ");
		        int qtd = sc.nextInt();

		        int gatos = 0, cachorros = 0;

		        for (int i = 1; i <= qtd; i++) {
		            System.out.print("Animal " + i + " (gato/cachorro): ");
		            String tipo = sc.next();

		            if (tipo.equalsIgnoreCase("gato"))
		                gatos++;
		            else if (tipo.equalsIgnoreCase("cachorro"))
		                cachorros++;
		        }

		        System.out.println("Gatos: " + gatos);
		        System.out.println("Cachorros: " + cachorros);
		        
		        sc.close(); 
		    }
		


	}


