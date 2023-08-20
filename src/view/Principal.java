package view;
import controller.ControllerContaValorPresente;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		double valor=0;
		double n;
		
		do {
			valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite valor:"));
		} while (valor < 10 || valor >= 999999);
		
		do {
			n = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite valor a ser buscado e contado:"));
		} while (n < 0 || n > 9);

		
		ControllerContaValorPresente cvp = new ControllerContaValorPresente();
		int res = cvp.ContaNumeros(valor, n);
		System.out.println(res);

	}

}
