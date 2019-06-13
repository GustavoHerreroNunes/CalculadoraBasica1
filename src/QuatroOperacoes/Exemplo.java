package QuatroOperacoes;

public class Exemplo {
	
	public double adicao(double n, double n1) {
		return n + n1;
}
	public double subtracao(double n, double n1) {
		return n - n1;
	}
	public double multiplicacao(double n, double n1) {
		return n * n1;
	}
	public double divisao(double n, double n1) {
		return n / n1;
	}
	public static void main (String [] args) {
		Exemplo ex = new Exemplo();
		
		System.out.println(ex.adicao(10, 1));
		System.out.println(ex.subtracao(10, 5));
		System.out.println(ex.multiplicacao(6, 4));
		System.out.println(ex.divisao(8, 2));
	}
}