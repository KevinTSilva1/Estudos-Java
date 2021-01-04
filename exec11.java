import java.util.Scanner;
import java.util.Locale;
public class exec11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int id, quantidade;
		double valor;
		
		id = sc.nextInt();
		quantidade = sc.nextInt();
		valor = 0;
		
		if(id == 1) {
			valor = quantidade * 4.00;
		}
		else if(id == 2) {
			valor = quantidade * 4.50;
		}
		else if(id == 3) {
			valor = quantidade * 5.00;
		}
		else if(id == 4) {
			valor = quantidade * 2.00;
		}
		else if(id == 5) {
			valor = quantidade * 1.50;
		}
		
		System.out.printf("Total: R$ %.2f%n", valor);
		
		
		sc.close();
	}
}
