import java.util.Scanner;
public class exec10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, duracao;
		
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if(horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaFinal + horaInicial;
		}
		
		System.out.printf("O jogo durou %d ", duracao);
		
		
		sc.close();
	}
}
