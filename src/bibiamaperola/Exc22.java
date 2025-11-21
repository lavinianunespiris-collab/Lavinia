package bibiamaperola;
import java.util.Scanner;
public class Exc22 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Quantidade de funcionários: ");
		        int qtd = sc.nextInt();
		        sc.nextLine(); 

		        int comFerias = 0;
		        int semFerias = 0;

		        for (int i = 1; i <= qtd; i++) {
		            System.out.print("Nome do funcionário: ");
		            String nome = sc.nextLine();

		            System.out.print("Tempo de serviço (meses): ");
		            int meses = sc.nextInt();
		            sc.nextLine(); 

		            if (meses > 12) {
		                System.out.println(nome + " tem direito a férias.");
		                comFerias++;
		            } else {
		                System.out.println(nome + " NÃO tem direito a férias.");
		                semFerias++;
		            }
		        }

		        System.out.println("\nFuncionários com férias: " + comFerias);
		        System.out.println("Funcionários sem férias: " + semFerias);
		        
              sc.close();
		    }
		


	}


