import java.util.Scanner;
import java.util.Locale;

public class exec14 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario;
		
		salario = sc.nextDouble();
		
		if(salario <= 2000) {
			System.out.println("Isento");
		}
		else if(salario >= 2000 && salario <= 3000) {
			
		}
	}
}
