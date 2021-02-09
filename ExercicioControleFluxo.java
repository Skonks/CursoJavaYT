import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioControleFluxo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		@SuppressWarnings("resource")

		double salario = 0;
		double imposto = 0;

		System.out.println("Digite o seu salario: ");
		salario = input.nextDouble();

		if (salario < 1000) {
			imposto = salario * 0.05;
		} else if (salario >= 1000 && salario < 2000) {
			imposto = salario * 0.1;
		} else if (salario >= 2000 && salario < 4000) {
			imposto = salario * 0.15;
		} else {
			imposto = salario * 0.2;
		}

		System.out.println("O imposto eh de: " + imposto);
		//DecimalFormat df = new DecimalFormat();
		//df.applyPattern("Volume = #,##0.000");
		//System.out.printf(df.format(volume));
		
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	}
}
