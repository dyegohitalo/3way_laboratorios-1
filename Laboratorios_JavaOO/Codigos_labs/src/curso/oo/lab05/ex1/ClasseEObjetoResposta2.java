package curso.oo.lab05.ex1;

public class ClasseEObjetoResposta2 {

	public static void main(String[] args) {

		// Para criar uma inst�ncia de uma classe use a palavra chave new
		// Por exemplo, para criar uma inst�ncia da classe String
		// procedemos como segue
		String strObjeto1 = new String("Este objeto e uma inst�ncia da classe String");
		System.out.println("Estado da inst�ncia de strObjeto1 = " + strObjeto1);

		// A classe String e uma classe especial que permite a cria��o de uma
		// inst�ncia pela atribui��o de um literal string. Nenhuma outra classe
		// em java permite este tipo de cria��o. Al�m disso para cada literal
		// string e criada uma �nica inst�ncia desta string
		String strObjeto2 = "Este objeto é uma inst�ncia da classe String";
		System.out.println("Estado da instância de strObjeto2 = " + strObjeto2);

		// todo 1 - Altere para criar uma instancia de Integer
		// cria uma inst�ncia de objeto da classe Integer
		Integer intObjeto1 = new Integer(100);

		//todo 2 - altere para mostrar o estado da inst�ncia Integer criada anteriormente
		System.out.println("Estado da inst�ncia de intObjeto1 = " +intObjeto1);

	}

}
