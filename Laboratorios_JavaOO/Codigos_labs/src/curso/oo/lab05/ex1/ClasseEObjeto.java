package curso.oo.lab05.ex1;

public class ClasseEObjeto {

	public static void main(String[] args) {

		// Para criar uma inst�ncia de uma classe use a palavra chave new
		// Por exemplo, para criar uma inst�ncia da classe String
		// procedemos como segue
		String strObjeto1 = new String("Este objeto � uma inst�ncia da classe String");
		System.out.println("Estado da inst�ncia de strObjeto1 = " + strObjeto1);
		// A classe String � uma classe especial que permite a cria��o de uma
		// inst�ncia pela atribui��o de um literal string. Nenhuma outra classe
		// em java permite este tipo de cria��o. Al�m disso para cada literal
		// string � criada uma �nica inst�ncia desta string
		String strObjeto2 = "Este objeto � uma inst�ncia da classe String";
		System.out.println("Estado da inst�ncia de strObjeto2 = " + strObjeto2);

	}

}
