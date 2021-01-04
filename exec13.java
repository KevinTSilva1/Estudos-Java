import java.util.Scanner;
import java.util.Locale;
public class exec13 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (y == 0 && x == 0) {
			System.out.println("Origem");
		}
		else if(y > 0 && x > 0) {
			System.out.println("Q1");
		}
		else if(y < 0 && x < 0) {
			System.out.println("Q3");
		}
		else if(y > 0 && x < 0) {
			System.out.println("Q2");
		}
		else if(y < 0 && x > 0) {
			System.out.println("Q4");
		}
		
		sc.close();
	}
}
