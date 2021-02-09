
public class ExercicioControleFluxo3 {

	public static void main(String[] args) {
		// Imprima todos os números pares de 0 até 100.000
		int valor = 100; // Faz da boa prática pq se vier do banco n tem como mudar
		for (int i = 0; i < valor; i++) {
			if (i % 2 == 0) { // Se quiser impar é !=0
				System.out.println("O valor de i é: " + i);
			}
		}
	}
}
