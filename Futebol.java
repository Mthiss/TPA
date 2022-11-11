import java.util.Scanner;
public class Futebol {

	public static void main(String[] args) {
		try (Scanner in = new Scanner (System.in)) {
			int idade;
			System.out.println("Digite a idade do aluno de 6 ate 10 anos para descobrir sua categoria no futebol:");
			idade = in.nextInt();
			switch (idade) {
			case 6 :
				System.out.println("Dente de leite");
				break;
			case 7:
				System.out.println("Junior");
				break;
			case 8: 
				System.out.println("Junior max");
				break;
			case 9:
				System.out.println("Junior master");
				break;
			case 10:
				System.out.println("Master");
				break;
			default:
				System.out.println("Idade invalida");
			}
		}
	}

}
