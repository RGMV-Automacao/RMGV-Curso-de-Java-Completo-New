package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		
		//Fazendo o Desafio de Conversão
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o Salario um:");
		String salario1 = entrada.nextLine().replace(",", "."); 
		//Usando o metodo .replace(",", "."), para aceitar na entrada, tantovalor com . como com , "4,4 ou 4,4"
		
		System.out.print("Digite o Salario dois:");
		String salario2 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o Salario tres:");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		String soma = salario1 + salario2 + salario3 ;
		
		System.out.println(soma);
		
		double sal1 = Double.parseDouble(salario1);
		double sal2 = Double.parseDouble(salario2);
		double sal3 = Double.parseDouble(salario3);
		
		double somanew = (sal1+sal2+sal3);
		System.out.println("A soma de salarios é = " + somanew);
		System.out.println("A Média de salário é de = " + somanew/3);
		
//		double s = (8123.56+12567.90+7598.54)/3;
//		System.out.println(s);
		
		entrada.close();
		
	}

}
