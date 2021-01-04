import java.util.Scanner;
import java.util.Locale;
public class exec05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int id, nPecas, id2, nPecas2;
		double valorPecas, valorPecas2, calc;
		
		id = sc.nextInt();
		nPecas = sc.nextInt();
		valorPecas = sc.nextDouble();
		id2 = sc.nextInt();
		nPecas2 = sc.nextInt();
		valorPecas2 = sc.nextDouble();
		calc = (nPecas * valorPecas) + (nPecas2 * valorPecas2);
		
		System.out.printf("Valor a pagar = R$ %.2f", calc);
		
		
		
		sc.close();
	}
}
