import java.util.Scanner;
import java.util.Locale;

public class exec04 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int id, horas;
		double valorHora, salario;
		
		id = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salario = horas * valorHora;
		
		System.out.printf("Number = %d%n", id);
		System.out.printf("Salary = U$  %.2f%n", salario);
		
		sc.close();
		
	}
}
