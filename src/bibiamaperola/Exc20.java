package bibiamaperola;
import java.util.Scanner;
public class Exc20 {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        String resposta = "";

		        while (!resposta.equalsIgnoreCase("buraco")) {
		            System.out.print("O que é, o que é? Quanto mais se tira, mais a gente tem: ");
		            resposta = sc.nextLine();
		        }

		        System.out.println("Resposta correta!");
		        
		        sc.close();
		    }
		

	}


