package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; // Convers�o Impl�cita
		System.out.println(a);
		
		float b = (float) 1.123456788888; // Convers�o Expl�cita (CAST)
		System.out.println(b);
		
		int c = 340;   // Convers�o Expl�cita (CAST)
		byte d = (byte) c; 
		System.out.println(d);
		
		double e = 1.9999999999;
		int f = (int) e;
		System.out.println(f);
		
	}

}
