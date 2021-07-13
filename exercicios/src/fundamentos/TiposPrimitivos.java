package fundamentos;


public class TiposPrimitivos {
	public static void main(String[] args) {

		// Informa��es de dados primitivos do JAVA
		// Informa��es do Funcionario

		// Tipos n�mericos inteiros
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;

		// Tipos N�mericos reias
		float salario = 11_445_44F;
		double vendasAcumuladas = 2_991_797_103.01;

		// Tipo Booleano
		boolean estaDeFerias = false; // true

		// Tipos Caracteres
		char status = 'A'; // Ativo

		// Dias de Empresa
		System.out.println("Quantidade de Dias do Funcionario na Empresa: = " + anosDeEmpresa * 365);

		// Numeros de Viagens
		System.out.println("N�meros de Voos do Funcionario: = " + numerosDeVoos / 2);

		// Pontos por Real vendido
		System.out.println("Numeros de Pontos por Vendas do Funcionario: = " + pontosAcumulados / vendasAcumuladas);

		// Salario do Funcionario
		System.out.println("O Funcionario de ID: = " + id + " Ganha um Sal�rio de: = " + salario);
		
		//Status do Cliente na empresa
		System.out.println("Status do Funcionario na Empresa: " + status + " De Ativo");
		
		//Status de Ferias
		System.out.println("O Funcionario est� de F�rias? " + estaDeFerias);
	}

}
