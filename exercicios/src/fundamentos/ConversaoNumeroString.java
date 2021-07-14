package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer num1= 10000;
		System.out.println(num1.toString()); //Conversão para String
		System.out.println(num1.toString().length());
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2));  //Conversão para String
		System.out.println(Integer.toString(num2).length());
		
		//Conversão para String com String em braco  Usando a concatenação que é o sibolo de +
		System.out.println(("" + num1).length());
		System.out.println(("" + num1));
		System.out.println(("" + num2).length());
		System.out.println(("" + num2));
	}

}
