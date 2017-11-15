package curso.oo.lab05.ex1;

public class ClasseEObjetoResposta2 {

	public static void main(String[] args) {

		// Para criar uma instância de uma classe use a palavra chave new
		// Por exemplo, para criar uma instância da classe String
		// procedemos como segue
		String strObjeto1 = new String("Este objeto e uma instância da classe String");
		System.out.println("Estado da instância de strObjeto1 = " + strObjeto1);

		// A classe String e uma classe especial que permite a criação de uma
		// instância pela atribuição de um literal string. Nenhuma outra classe
		// em java permite este tipo de criação. Além disso para cada literal
		// string e criada uma única instância desta string
		String strObjeto2 = "Este objeto Ã© uma instância da classe String";
		System.out.println("Estado da instÃ¢ncia de strObjeto2 = " + strObjeto2);

		// todo 1 - Altere para criar uma instancia de Integer
		// cria uma instância de objeto da classe Integer
		Integer intObjeto1 = new Integer(100);

		//todo 2 - altere para mostrar o estado da instância Integer criada anteriormente
		System.out.println("Estado da instância de intObjeto1 = " +intObjeto1);

	}

}
