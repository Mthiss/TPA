package exercicio2;
import java.util.Scanner;

public class faixaEreditaria {

	public static void main(String[] args) {
		Scanner in =  new Scanner (System.in);
		int i=1, p1=0, p2=0, p3=0, p4=0, p5=0, res1, res2, res3, res4, res5, idade;
		do {
			System.out.println("Digite a idade:");
			idade = in.nextInt();
			if(idade<=15) {
				p1++;
			}else if (idade>=16 && idade<=30){
				p2++;
			}else if (idade>=31 && idade<=45) {
				p3++;
			}else if (idade>=45 && idade<=60) {
				p4++;
			}else if (idade>61) {
				p5++;
			}
			i++;
		}while(i<=15);
			res1 = (p1*100)/15;
			System.out.println("Primeira Faixa: " + res1);
			res2 = (p2*100)/15;
			System.out.println("Segunda Faixa: " + res2);
			res3 = (p3*100)/15;
			System.out.println("Terceira Faixa: " + res3);
			res4 = (p4*100)/15;
			System.out.println("Quarta Faixa: " + res4);
			res5 = (p5*100)/15;
			System.out.println("Quinta Faixa: " + res5);

	}

}
