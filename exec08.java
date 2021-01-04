import java.util.Scanner;
public class exec08 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Número é par");
		}
		else {
			System.out.println("Número é impar");
		}
		
		sc.close();
	}
}
