import java.util.Scanner;
import java.util.Locale;

public class exec06 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, PI, baseTriangulo, areaCirculo, areaTrapezio, areaQuadrado;
		
		PI = 3.14159;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		baseTriangulo = (B * A) / 2;
		areaCirculo = PI * C * C;
		areaTrapezio = (A + B) / 2 * C;
		areaQuadrado = B * B;
		
		
		
		
		sc.close();
	}
}
