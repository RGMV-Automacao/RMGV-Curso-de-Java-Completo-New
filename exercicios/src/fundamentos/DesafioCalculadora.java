package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	/*
	 * Ler num1
	 * Ler num2
	 * Escolha da opera��o + - * / %
	 */

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o Primeiro N�mero: ");
		double num1 = entrada.nextDouble(); 
		
		System.out.print("Digite o Seguindo N�mero: ");
		double num2 = entrada.nextDouble(); 
		
		System.out.print("Digite o Seguindo N�mero: ");
		String ope = entrada.next(); 
		
		//Logica da Calculadora
		
		double resultado = "+".equals(ope) ? num1 + num2 : 0;
		resultado = "-".equals(ope) ? num1 - num2 : resultado;
		resultado = "*".equals(ope) ? num1 * num2 : resultado;
		resultado = "/".equals(ope) ? num1 / num2 : resultado;
		resultado = "%".equals(ope) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %.2s %.2f = %.2f",num1, ope, num2, resultado);
		
		
		

		
		entrada.close();
	}
}
