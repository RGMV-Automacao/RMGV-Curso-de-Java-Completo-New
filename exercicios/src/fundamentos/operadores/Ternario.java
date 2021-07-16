package fundamentos.operadores;


public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 7;
		
		String resultadoParcial = media >= 5.0 ? "Em Recuperaão!" : "Reprovado";
		String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoParcial;
		
		System.out.println("O Auluno está " + resultadoFinal);
		
		// Ou podemos usar assim
		
		
		double nota= 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >=7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim.":"Não.";
				
		System.out.printf("Tem Desconto? %s ", resultado);
		
	}

}
