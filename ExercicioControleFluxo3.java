
public class ExercicioControleFluxo3 {

	public static void main(String[] args) {
		// Imprima todos os n�meros pares de 0 at� 100.000
		int valor = 100; // Faz da boa pr�tica pq se vier do banco n tem como mudar
		for (int i = 0; i < valor; i++) {
			if (i % 2 == 0) { // Se quiser impar � !=0
				System.out.println("O valor de i �: " + i);
			}
		}
	}
}
