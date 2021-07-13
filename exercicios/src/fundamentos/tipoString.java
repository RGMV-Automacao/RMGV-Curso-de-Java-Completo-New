package fundamentos;

public class tipoString {
public static void main(String[] args) {
	String s = "Boa tarde";
	System.out.println(s.concat("!!!"));
	System.out.println(s + ("!!!"));
	System.out.println(s.startsWith("Boa")); //Validando se a frase inicia com Boa
	System.out.println(s.startsWith("boa")); //Validando se a frase inicia com Boa
	System.out.println(s.toLowerCase().startsWith("boa")); //Validando se a frase inicia com Boa
	System.out.println(s.toUpperCase().endsWith("TARDE")); //Validando se a frase termna com Tarde
	System.out.println(s.length()); // Mostrando o tamnho da frase
	System.out.println(s.toLowerCase().equals("Boa tarde")); //Comparando a frese
	System.out.println(s.equalsIgnoreCase("Boa tarde")); //Comparando a frese, ignorando maiscula e minuscula.
	
	var nome = "Helena";
	var sobreNome = "Diniz Máximo";
	var idade = 6;
	var salario = 12345.978;
	
	System.out.println("Nome: "+ nome + "\nSobreNome: " + sobreNome +"\nIdade: "+ idade + "\nSalário: "+ salario + "\n");
	
	System.out.printf("A dona %s " //%s para strings
			+ "%s tem %d " //Para valores inteiros
			+ "meses e ganha uma salario de: R$%.2f"//Para valores de Pontos Flutuantes e .2f poara quantidade de casas descimasis
			+ "", nome, sobreNome, idade, salario);
	
	String frase = String.format("\nA dona %s %s tem %d meses e ganha uma salario de: R$%.2f", nome, sobreNome, idade, salario);
	System.out.println(frase);
	
	System.out.println("Rogerio Maximo Vieira".contains("Maximo"));
	System.out.println("Rogerio Maximo Vieira".indexOf("Maximo"));
	System.out.println("Rogerio Maximo Vieira".substring(8));
	System.out.println("Rogerio Maximo Vieira".substring(8, 10));
	
	
}
}
