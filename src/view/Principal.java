package view;

import javax.swing.JOptionPane;

import controller.SomaController;

public class Principal {

	public static void main(String[] args) {
		SomaController somacontroller = new SomaController();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número natural"));
		int contador = 1;
		int soma = 0;
		int resultado = somacontroller.somannatural(n, contador, soma);
		JOptionPane.showMessageDialog(null, "A soma dos números naturais de 1 a " + n + " é igual a " + resultado);		
	}
}