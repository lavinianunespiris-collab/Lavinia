package bibiamaperola;
import java.util.Scanner;
public class Exc21 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Quantidade de produtos: ");
		        int qtd = sc.nextInt();

		        double total = 0;

		        for (int i = 1; i <= qtd; i++) {
		            System.out.print("Preço do produto " + i + ": ");
		            total += sc.nextDouble();
		        }

		        System.out.println("Total da compra: R$ " + total);
		        
		        sc.close();
		    }
		

	}


