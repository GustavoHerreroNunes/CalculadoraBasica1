/* Esta classe de modelagem tem como função conter atributos e métodos necessários para se desenvolver um sistema
 * de cálculos simples das 4 operções (soma, subtração, multiplicação, divisão)
 */

package QuatroOperacoes;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Calculadora {
	
	/*Criação de atributos*/
	private double n1;
	private double n2;
	private double r;
	
	/*Criando objeto da classe "ImageIcon" utilizar como icone nas janelas*/
	ImageIcon logo = new ImageIcon("Imagens/Calc.jpg");
	
	/*Criação de Construtores*/
	
	public Calculadora() {//Construtor para inicialização dos atributos vazios
		this(0,0,0);
	}
	
	public Calculadora(double n1, double n2, double r) {//Construtor para inicialização dos atributos com valores passados pelo usuário
		this.n1 = n1;
		this.n2 = n2;
		this.r = r;
	}
	
	
	/*Criação de Getters e Setters*/
	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	/*Criação dos métodos específicos*/
	
	public void somar() {//Método sem retorno para soma e sem parâmetros que internamente faz a operação e exibe o reusltado
		
		/*De forma encapsulada estou passando os valores digitados pelo usuário para os atributos*/
		this.setN1(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro valor:", "Calculadora", 1)));
		
		this.setN2(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo valor:", "Calculadora", 1)));
		
		this.setR(this.n1 + this.n2);
		
		JOptionPane.showMessageDialog(null, "O resultado de:\n" + this.n1 + " + " + this.n2 + " = " + this.r, "Calculadora", -1, this.logo);//Mostrando o resultado para o usuário
	}
	
	public void subtrair(double a, double b) {//Método sem retorno com parâmetros para subtração que executa a operação e mostra o resultado ao usuário  
		
		/*De forma encapsulada estou passando os valores digitados pelo usuário para os atributos*/
		this.setN1(a);
		this.setN2(b);
		
		this.setR(this.n1 - this.n2);
		
		JOptionPane.showMessageDialog(null, "O resultado de:\n" + this.n1 + " - " + this.n2 + " = " + this.r, "Calculadora", -1, this.logo);//Mostrando o resultado para o usuário
	}
	
	public double multiplicacao() {//Método com retorno sem parâmetros para multiplicação, executa a operação e envia o resultado para a classe principal
		
		/*De forma encapsulada estou passando os valores digitados pelo usuário para os atributos*/
		this.setN1(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro valor:", "Calculadora", 1)));
		
		this.setN2(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo valor:", "Calculadora", 1)));
		
		this.setR(this.n1 * this.n2);
		
		return this.getR();//Enviando o resultado, que esta em 'r', de forma encapsulada para a classe principal
	}
	
	public double dividir(double a, double b) {//Método com retorno e parâmetros para divisão, executa a operação e envia o resultado para a classe principal
		
		/*De forma encapsulada estou passando os valores digitados pelo usuário para os atributos*/
		this.setN1(a);
		this.setN2(b);
		
		this.setR(this.n1 / this.n2);
		
		return this.getR();//Enviando o resultado, que esta em 'r', de forma encapsulada para a classe principal
	}
	
	

}
