/* Classe pr�ncipal do meu projeto, que gerenciar� os m�todos e atributos 
 * da classe "Calculadora" de acordo com os comandos do usu�rio
 */

package QuatroOperacoes;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		/*V�riaveis necess�rias atribuidas com valores nulos para futuro uso, se necessario*/
		double a =0, b =0, result =0;
		int op =0, sair =0;
		
		//Vetores string para cria��o de push buttons nos futuros JOptionPanes
		String opStr[] = {"Somar", "Subtrair", "Multiplicar", "Dividir", "Sair"}, opSair[] = {"Cancelar", "Confirmar"};
		
		Calculadora calc1 = new Calculadora();//Inst�nciando minha classe de modelagem 'Calculadora'

		/*Extrutura de repeti��o para informe do menu com op��es das opera��es ao usu�rio at� que desejado*/
		do {
			op =JOptionPane.showOptionDialog(null, "Bem vindo ao sistema e calculadora 2.0\nSelecione a op��o que deseja realizar...", "Calculadora", -1,-1, calc1.logo, opStr, null);//Mostrando as op��es de opera��es ao usu�rio
			switch(op) {
			
			case 0://Se for escolhido "Somar"
				
				calc1.somar();//Chamada do m�todo somar()
				break;
				
			case 1://Se for escolhido "Subtrair"
				a = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro valor:", "Calculadora", 1));
				b = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo valor:", "Calculadora", 1));
				
				calc1.subtrair(a, b);//Chamada do m�todo subtrair()
				break;
				
			case 2://Se for escolhido "Multiplicar"
				
				result = calc1.multiplicacao();//Chamada do m�todo multiplicar()
				
				JOptionPane.showMessageDialog(null, "O resultado de:\n" + calc1.getN1() + " x " + calc1.getN2() + " = " + result, "Calculadora", -1, calc1.logo);
				break;
			case 3:
				a = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro valor:", "Calculadora", 1));
				b = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo valor:", "Calculadora", 1));
				
				result = calc1.dividir(a, b);//Chamada do m�todo dividir()
				
				JOptionPane.showMessageDialog(null, "O resultado de:\n" + a + " / " + b + " = " + result, "Calculadora", -1, calc1.logo);
				break;
				
			default://Se for escolhido "Sair"
				
				sair = JOptionPane.showOptionDialog(null, "Deseja sair?", "Calculadora", -1, 2, null, opSair, null);//Pe�o confirma��o da a��o
				break;
			}
		}while(sair !=1);
	}

}
