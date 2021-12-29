package fundamentos;

import java.util.Date;

import javax.swing.JOptionPane;

public class Import {

	public static void main(String[] args) {
		String texto = "Valor da String";
		System.out.println(texto);
		
		Date data = new Date();
		System.out.println(data);
		
		JOptionPane.showMessageDialog(null, "Informação sobre import");
	}
}
