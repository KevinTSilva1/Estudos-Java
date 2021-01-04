import java.util.Scanner;
import java.util.Locale;
public class exec02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, R, PI;
		
		PI = 3.14159;
		R = sc.nextDouble();
		A = PI * R * R;
		
		System.out.printf("A = %.4f%n", A);
		
		sc.close();
	}
}
