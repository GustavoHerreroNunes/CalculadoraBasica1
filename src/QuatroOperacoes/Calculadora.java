/* Esta classe de modelagem tem como fun��o conter atributos e m�todos necess�rios para se desenvolver um sistema
 * de c�lculos simples das 4 oper��es (soma, subtra��o, multiplica��o, divis�o)
 */

package QuatroOperacoes;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Calculadora {
	
	/*Cria��o de atributos*/
	private double n1;
	private double n2;
	private double r;
	
	/*Criando objeto da classe "ImageIcon" utilizar como icone nas janelas*/
	ImageIcon logo = new ImageIcon("Imagens/Calc.jpg");
	
	/*Cria��o de Construtores*/
	
	public Calculadora() {//Construtor para inicializa��o dos atributos vazios
		this(0,0,0);
	}
	
	public Calculadora(double n1, double n2, double r) {//Construtor para inicializa��o dos atributos com valores passados pelo usu�rio
		this.n1 = n1;
		this.n2 = n2;
		this.r = r;
	}
	
	
	/*Cria��o de Getters e Setters*/
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
	
	/*Cria��o dos m�todos espec�ficos*/
	
	public void somar() {//M�todo sem retorno para soma e sem par�metros que internamente faz a opera��o e exibe o reusltado
		
		/*De forma encapsulada estou passando os valores digitados pelo usu�rio para os atributos*/
		this.setN1(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro valor:", "Calculadora", 1)));
		
		this.setN2(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo valor:", "Calculadora", 1)));
		
		this.setR(this.n1 + this.n2);
		
		JOptionPane.showMessageDialog(null, "O resultado de:\n" + this.n1 + " + " + this.n2 + " = " + this.r, "Calculadora", -1, this.logo);//Mostrando o resultado para o usu�rio
	}
	
	public void subtrair(double a, double b) {//M�todo sem retorno com par�metros para subtra��o que executa a opera��o e mostra o resultado ao usu�rio  
		
		/*De forma encapsulada estou passando os valores digitados pelo usu�rio para os atributos*/
		this.setN1(a);
		this.setN2(b);
		
		this.setR(this.n1 - this.n2);
		
		JOptionPane.showMessageDialog(null, "O resultado de:\n" + this.n1 + " - " + this.n2 + " = " + this.r, "Calculadora", -1, this.logo);//Mostrando o resultado para o usu�rio
	}
	
	public double multiplicacao() {//M�todo com retorno sem par�metros para multiplica��o, executa a opera��o e envia o resultado para a classe principal
		
		/*De forma encapsulada estou passando os valores digitados pelo usu�rio para os atributos*/
		this.setN1(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro valor:", "Calculadora", 1)));
		
		this.setN2(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo valor:", "Calculadora", 1)));
		
		this.setR(this.n1 * this.n2);
		
		return this.getR();//Enviando o resultado, que esta em 'r', de forma encapsulada para a classe principal
	}
	
	public double dividir(double a, double b) {//M�todo com retorno e par�metros para divis�o, executa a opera��o e envia o resultado para a classe principal
		
		/*De forma encapsulada estou passando os valores digitados pelo usu�rio para os atributos*/
		this.setN1(a);
		this.setN2(b);
		
		this.setR(this.n1 / this.n2);
		
		return this.getR();//Enviando o resultado, que esta em 'r', de forma encapsulada para a classe principal
	}
	
	

}
