import java.util.Scanner;
import java.util.Locale;

public class exec03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, calc;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		calc = (A * B - C * D);
		
		System.out.printf("Diferença = %d%n", calc);
		
		sc.close();
		
	}
}
