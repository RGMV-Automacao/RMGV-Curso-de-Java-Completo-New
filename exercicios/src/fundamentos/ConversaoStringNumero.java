package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {

		/*
		 * Usando um nova Classe JOptionPane que abre uma janela para ser digitada os
		 * valores
		 */
		String valor1 = JOptionPane.showInputDialog("Digite o Primeiro Número:");
		String valor2 = JOptionPane.showInputDialog("Digite o Segundo Número:");

		System.out.println(valor1 + valor2); // Nesse caso, como estamos usando valor em string, não teremos a soma, e
												// sim a concatenação dos valores.

		// Para realizar operações matematicas com os numeros de strings, temos que
		// converter para numero primitivo

		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
 
		double soma = numero1+numero2;
		double media = (numero1+numero2)/2;
		
		System.out.println("A soma de " + numero1 + " + " + numero2 + " é = " + soma);
		System.out.println("A média de "+ numero1 + numero2 + " é " + media);
		
		System.out.println();
	}

}
