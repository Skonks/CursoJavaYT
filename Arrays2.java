public class Arrays2 {

	public static void main(String args[]) {

		String[] nomes = new String[4];
		// byte, short, int, long, float, double = 0
		// char = ""
		// boolean = false
		// reference = null

		nomes[0] = "Librao";
		nomes[1] = "Skonks";
		nomes[2] = "Slips";
		nomes[3] = "Wally";

		// System.out.println(nomes.length); mostra o tamanho do array

		for (int i = 0; i < nomes.length; i++) { // nomes.lenght faz nao precisar mexer no for
			System.out.println((i + 1) + " nome: " + nomes[i]);
		}
	}
}
