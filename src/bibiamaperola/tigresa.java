package bibiamaperola;
import java.util.Scanner;
public class tigresa {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Quantidade de alunos: ");
		        int qtd = sc.nextInt();

		        for (int i = 1; i <= qtd; i++) {
		            System.out.println("\nAluno " + i);

		            System.out.print("Nota 1: ");
		            double n1 = sc.nextDouble();

		            System.out.print("Nota 2: ");
		            double n2 = sc.nextDouble();

		            double media = (n1 + n2) / 2;

		            if (media >= 6)
		                System.out.println("Aprovado! Média: " + media);
		            else
		                System.out.println("Reprovado! Média: " + media);
		            
		            sc.close();
		        }
		    }
		


	}


