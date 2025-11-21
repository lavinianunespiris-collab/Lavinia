package bibiamaperola;
import java.util.Scanner;
public class macaco {

	public static void main(String[] args) {


		        Scanner sc = new Scanner(System.in);

		        System.out.print("Digite x: ");
		        int x = sc.nextInt();
		        
		        System.out.print("Digite y: ");
		        int y = sc.nextInt();

		        if (x > y)
		            System.out.println("Maior: " + x);
		        else
		            System.out.println("Maior: " + y);
		        
		        sc.close();
		        
		    }
		

		
	}


