package controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Digite um valor");
		int valorConvertido = Integer.parseInt(valor);
		
		if(valorConvertido % 2 == 0) {
			JOptionPane.showMessageDialog(null, "O valor: " + valor + " é par.");
		}else {
			JOptionPane.showMessageDialog(null, "O valor: " + valor + " é impar.");
		}
	}
}
