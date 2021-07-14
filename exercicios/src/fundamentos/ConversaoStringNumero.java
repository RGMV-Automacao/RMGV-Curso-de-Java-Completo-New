package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {

		/*
		 * Usando um nova Classe JOptionPane que abre uma janela para ser digitada os
		 * valores
		 */
		String valor1 = JOptionPane.showInputDialog("Digite o Primeiro N�mero:");
		String valor2 = JOptionPane.showInputDialog("Digite o Segundo N�mero:");

		System.out.println(valor1 + valor2); // Nesse caso, como estamos usando valor em string, n�o teremos a soma, e
												// sim a concatena��o dos valores.

		// Para realizar opera��es matematicas com os numeros de strings, temos que
		// converter para numero primitivo

		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
 
		double soma = numero1+numero2;
		double media = (numero1+numero2)/2;
		
		System.out.println("A soma de " + numero1 + " + " + numero2 + " � = " + soma);
		System.out.println("A m�dia de "+ numero1 + numero2 + " � " + media);
		
		System.out.println();
	}

}
