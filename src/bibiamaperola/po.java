package bibiamaperola;
import java.util.Scanner;
public class po {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		        System.out.print("Quantidade de turmas: ");
		        int turmas = sc.nextInt();

		        for (int t = 1; t <= turmas; t++) {
		            System.out.println("\nTurma " + t);

		            System.out.print("Quantidade de alunos: ");
		            int alunos = sc.nextInt();

		            double soma = 0;

		            for (int a = 1; a <= alunos; a++) {
		                System.out.print("Média do aluno " + a + ": ");
		                soma += sc.nextDouble();
		            }

		            double mediaTurma = soma / alunos;
		            System.out.println("Média da turma " + t + ": " + mediaTurma);
		            
		            sc.close(); 
		        }
		    }

	}


