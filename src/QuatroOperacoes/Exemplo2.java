package QuatroOperacoes;

import javax.swing.JOptionPane;

public class Exemplo2 {
	
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

		
		double n = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número:"));
		double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número:"));
		int op = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Adição | 2 - Subtração | 3 - Multiplicação | 4 - Divisão"));
		
		switch(op) {
		case 1:
			System.out.println(ex.adicao(n, n1));
			break;
		case 2:
			System.out.println(ex.subtracao(n, n1));
			break;
		case 3:
			System.out.println(ex.multiplicacao(n, n1));
			break;
		case 4:
			System.out.println(ex.divisao(n, n1));
			break;
		default:
			System.out.println("Operação digitada inválida");
			break;
		}
}	
}