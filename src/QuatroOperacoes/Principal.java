/* Classe príncipal do meu projeto, que gerenciará os métodos e atributos 
 * da classe "Calculadora" de acordo com os comandos do usuário
 */

package QuatroOperacoes;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		/*Váriaveis necessárias atribuidas com valores nulos para futuro uso, se necessario*/
		double a =0, b =0, result =0;
		int op =0, sair =0;
		
		//Vetores string para criação de push buttons nos futuros JOptionPanes
		String opStr[] = {"Somar", "Subtrair", "Multiplicar", "Dividir", "Sair"}, opSair[] = {"Cancelar", "Confirmar"};
		
		Calculadora calc1 = new Calculadora();//Instânciando minha classe de modelagem 'Calculadora'

		/*Extrutura de repetição para informe do menu com opções das operações ao usuário até que desejado*/
		do {
			op =JOptionPane.showOptionDialog(null, "Bem vindo ao sistema e calculadora 2.0\nSelecione a opção que deseja realizar...", "Calculadora", -1,-1, calc1.logo, opStr, null);//Mostrando as opções de operações ao usuário
			switch(op) {
			
			case 0://Se for escolhido "Somar"
				
				calc1.somar();//Chamada do método somar()
				break;
				
			case 1://Se for escolhido "Subtrair"
				a = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro valor:", "Calculadora", 1));
				b = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo valor:", "Calculadora", 1));
				
				calc1.subtrair(a, b);//Chamada do método subtrair()
				break;
				
			case 2://Se for escolhido "Multiplicar"
				
				result = calc1.multiplicacao();//Chamada do método multiplicar()
				
				JOptionPane.showMessageDialog(null, "O resultado de:\n" + calc1.getN1() + " x " + calc1.getN2() + " = " + result, "Calculadora", -1, calc1.logo);
				break;
			case 3:
				a = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro valor:", "Calculadora", 1));
				b = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo valor:", "Calculadora", 1));
				
				result = calc1.dividir(a, b);//Chamada do método dividir()
				
				JOptionPane.showMessageDialog(null, "O resultado de:\n" + a + " / " + b + " = " + result, "Calculadora", -1, calc1.logo);
				break;
				
			default://Se for escolhido "Sair"
				
				sair = JOptionPane.showOptionDialog(null, "Deseja sair?", "Calculadora", -1, 2, null, opSair, null);//Peço confirmação da ação
				break;
			}
		}while(sair !=1);
	}

}
