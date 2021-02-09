import java.util.Scanner;

public class ControledeFluxo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int idade = 0;
		String categoria;

		System.out.println("Digite a sua idade");
		idade = ler.nextInt();

		if (idade < 15) {
			categoria = "Infantil";
		} else if (idade >= 16 && idade < 18) {
			categoria = "Jovem";
		} else {
			categoria = "Adulto";
		}

		System.out.println(categoria);
	}

}
