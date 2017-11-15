package curso.oo.lab04;

import javax.swing.JOptionPane;

public class MaiorNumeroResposta {

	public static void main(String[] args) {

		int[] num = new int[10];
		int contador;
		int menorNumero = 0;
		int numerostotal = 3;

		// Pede ao usuário para digitar números
		for (contador = 0; contador < numerostotal; contador++) {

			num[contador] = Integer.parseInt(JOptionPane.showInputDialog("Entre com números até " + numerostotal + " no total"));

			if (( contador == 0 ) || ( num[contador] < menorNumero ))
				menorNumero = num[contador];
		}

        // Objetivo: Mostrar o menor número digitado
		JOptionPane.showMessageDialog(null, "O menor n�mero �: " + menorNumero);
	}

}
