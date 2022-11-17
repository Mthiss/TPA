package exercicio4;
import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int anterior=0, atual=1, exibir=1,i=1,n;
		System.out.println("Digite um valor:");
		n = in.nextInt();
		do{
			System.out.println(exibir + " ");
			exibir = atual + anterior;
		    anterior = atual;
		    atual = exibir;
		    i++;
		}while(i<=n);

	}

}
