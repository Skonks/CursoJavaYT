public class ExercicioControleFluxo2 {

	// crie um switch que dado um valor de 1 a 7 considerando 1 = domingo
	// imprima se é dia util ou final de semana

	public static void main(String[] args) {

		byte dia = 8;
		switch (dia) {
		case 1:
		case 7:
			System.out.println("Final de semana");
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Dia util");
			break;
		default:
			System.out.println("Opção Inválida");
		}
	}
}
