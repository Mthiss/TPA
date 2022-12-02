package exercicio3;
import java.util.Scanner;

public class numPrimo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		System.out.println("Informe o número: ");
		num = in.nextInt();
		
		if (num % 2 == 0 && num != 2 ) {
		System.out.println("Não é primo.");
		}else {
		System.out.println("É primo."); 
		}

	}

}
