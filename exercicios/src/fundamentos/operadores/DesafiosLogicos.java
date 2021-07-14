package fundamentos.operadores;

public class DesafiosLogicos {
	
	public static void main(String[] args) {
		/*
		 * Trabalho na terça (V ou F)
		 * 		
		 * Trabalho na quinta (V ou F)
		 * 
		 * se os 2 trabalhos derem certo, vou comprar uma TV de  polegadasno fim de semana
		 * Se apenas 1 der certo, vamos comrpar uma TV de 32 polegadas
		 * Ou comrando uma TV de 50 ou comprando uma TV de 32, vamos tomar sorvete juntos
		 * Se os 2 trabalhos não derem certo, vamos todos ficar em casa
		 * Fazer a negação noliga, não tomou soreve, ficou mais saudade, não tomou sorve, ficou com fome
		 * 
		 * Tem que usar o SystemOu.ln
		 */
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;

		boolean comprouSorvete = trabalho1 || trabalho2;
		
		boolean maisSaldavel = !comprouSorvete;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		System.out.println("Você comprou a TV de 50 Polegadas? " +comprouTV50);
		
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		System.out.println("Você comprou a TV de 50 Polegadas? " +comprouTV32);

		System.out.println("Mais saudavel?? " +maisSaldavel);
		
		
	}

}
