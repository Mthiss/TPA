public class Altura {

	public static void main(String[] args) {
		
		double joao = 1.34, pedro = 1.45 , i = 1;
		while (joao<=pedro) {
			joao = (joao+0.025);
			pedro = (pedro+0.020);
		i++;
		
		}
		System.out.println("será " +i+ " anos para o joao ser maior que pedro");
}
}
