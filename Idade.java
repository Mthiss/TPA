import java.util.Scanner;
public class Idade {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i=1, anoNasc,anoAtual,idade,n;
		do {
			System.out.println("Digite o ano do nascimento do usuario:");
			anoNasc = in.nextInt();
			System.out.println("Digite o ano do Atual:");
			anoAtual = in.nextInt();
			idade =  anoAtual - anoNasc;
			System.out.println("A idade do usuario é  "+idade);
			if (idade<18){
				System.out.println("Menor de idade");
			}else{
				System.out.println("Maior de idade");
			}
			System.out.println("Deseja continuar a execuçao? 1-SIM 2-Nao");
			n = in.nextInt();
			i++;
			}while (i<18);
			switch(n) {
				case 1: 
					System.out.println("Digite o ano do nascimento do usuario:");
					anoNasc = in.nextInt();
					System.out.println("Digite o ano do Atual:");
					anoAtual = in.nextInt();
					idade =  anoAtual - anoNasc;
					System.out.println("A idade do usuario é  "+idade);
					if (idade<18){
						System.out.println("Menor de idade");
					}else{
						System.out.println("Maior de idade");
					}
				break;
				case 2: 
					System.out.println("Fim da execução!");
					break;
				default: 
					System.out.println("Opçao invalida");
			}
		}
	}
