package curso.oo.lab04;

public class DiasDaSemanaResposta {

	public static void main(String[] args) {

		String[][] dias = new String[7][2];

/*		 inicializa o array dicionario para cada linha de dia
		 Lembrando que deve conter em cada linha, o correspondente em português e ingles
		 Cada linha será uma entrada no dicionário nosso
		 Exemplo para Domingo:
*/	
		
		dias[0][0] = new String("Domingo");
		dias[0][1] = "Sunday";

		dias[1][0] = new String("Segunda");
		dias[1][1] = "Monday";
		
		dias[2][0] = new String("Ter�a");
		dias[2][1] = "Tuesday";
		
		dias[3][0] = new String("Quarta");
		dias[3][1] = "Wednesday";
		
		dias[4][0] = new String("Quinta");
		dias[4][1] = "Thursday";
		
		dias[5][0] = new String("Sexta");
		dias[5][1] = "Friday";
		
		dias[6][0] = new String("S�bado");
		dias[6][1] = "Saturday";
		

		// imprime a traducao de portugues-ingles dos dias da semana
		System.out.println("\nPORTUGUES - INGLES");

		for (int i = 0; j=0; i < dias.length; i++) {
			System.out.println(dicionario[i][j]+"");
			// todo 4 - altere para mostrar o valor em português e outro em inglês
			// Lembrando que o Português é a primeira coluna e inglês o da segunda coluna
			System.out.println(dias[i] + " - " + dias[i]);
		}
	}
}
