import java.util.Scanner;

public class ControledeFluxo3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		byte dia = 0;
		String sexo = "F";

		System.out.println("Digite o dia: ");
		dia = input.nextByte();

		// char = '', int, byte, short, enum e String =""
		// tipos que podem ser usados no switch
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Ter�a");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("S�bado");
			break;
		}

		switch (sexo) {
		case "F":
			System.out.println("Feminino");
			break;
		case "M":
			System.out.println("Masculino");
			break;
		default:
			System.out.println("Op��o Invalida");
		}
	}
}
