package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" Dia\n\n");
		System.out.println("Bom");
		System.out.println("Dia");
		
		System.out.printf("Mega Sena: %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salario %.1f \n", 1234.5678);
		System.out.printf("Nome %s \n", "Rogerio");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu Nome: ");
		String nome  = entrada.nextLine();
		
		System.out.print("Digite seu Sobrenome: ");
		String sobreNome  = entrada.nextLine();
		
		System.out.print("Digite sua Idade: ");
		int idade  = entrada.nextInt();		
		
		//System.out.println("\n\nNome: " + nome + " " + sobreNome + " e sua Idade é " + idade);
		System.out.printf("%s %s tem  %d anos. \n", nome, sobreNome, idade);
		
		entrada.close();
		
		
	}

}
