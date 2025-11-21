package bibiamaperola;
import java.util.Scanner;
public class salademerda {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        String fecharCaixa;

		        do {
		            double totalCompra = 0;
		            String maisItens;

		            System.out.println("\nNovo cliente!");

		            do {
		                System.out.print("Preço do item: ");
		                totalCompra += sc.nextDouble();

		                System.out.print("Há mais itens? (s/n): ");
		                maisItens = sc.next();
		            } while (maisItens.equalsIgnoreCase("s"));

		            System.out.println("Total da compra: R$ " + totalCompra);

		            System.out.print("Deseja fechar o caixa? (s/n): ");
		            fecharCaixa = sc.next();

		        } while (!fecharCaixa.equalsIgnoreCase("s"));

		        System.out.println("Caixa fechado.");
		        
		        sc.close(); 
		    }
		
	}


