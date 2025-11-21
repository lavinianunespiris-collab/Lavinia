package bibiamaperola;
import java.util.Scanner;
public class maedamelissaegostosa {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Digite o sexo (M/F): ");
		        String s = sc.next().toUpperCase();

		        if (s.equals("M"))
		            System.out.println("Seja bem-vindo, Senhor!");
		        else if (s.equals("F"))
		            System.out.println("Seja bem-vinda, Senhora!");
		        else
		            System.out.println("Valor inválido!");
		        
		        sc.close();
		        
		    }
		

		
	}


