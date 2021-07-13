package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {

		// Trabalhando com String
		String s = "Bom di Helena";
		s = s.replace("di", "dia");
		s = s.toUpperCase();
		s = s.concat("!!!");
		System.out.println(s);

		String x = "Leo".toUpperCase();
		System.out.println(x);

		String y = "Bom dia, X".replace("X", "Helena Máximo").toUpperCase().concat("!!!");
		System.out.println(y);

		// Tipos Primitivos não tem o operador ".";
		int a = 3;
		System.out.println(a);

	}

}
