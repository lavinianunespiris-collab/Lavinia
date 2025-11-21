package bibiamaperola;
import java.util.Scanner;
public class juliete {

	public static void main(String[] args) {


		        Scanner sc = new Scanner(System.in);

		        System.out.print("Digite x: ");
		        int x = sc.nextInt();

		        System.out.print("Digite y: ");
		        int y = sc.nextInt();

		        int aux = x;
		        x = y;
		        y = aux;

		        System.out.println("Após a troca:");
		        System.out.println("x = " + x);
		        System.out.println("y = " + y);
		    }
		

		
	}


