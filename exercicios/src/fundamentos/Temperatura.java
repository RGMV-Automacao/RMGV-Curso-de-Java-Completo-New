package fundamentos;

/*
 * Classe de formatação de Sida no JAVA
 */
import java.text.DecimalFormat;

public class Temperatura {
	public static void main(String[] args) {

		
		// Pacote de Formatação de Saida de Valores.
		// String formato = "R$ #,##0.00";
		String formato = "0.00";
		DecimalFormat d = new DecimalFormat(formato);
		// (var F- constante 32) x constante 5/9 = var °C

		double fahrenheit = 86;
		final double AJUSTE = 32;
		final double FATOR = 5.0 / 9.0;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O Resultado é = " + d.format(celsius) + "°C");

		fahrenheit = 0;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O Resultado é = " + d.format(celsius) + "°C");
	}
}
