package imc;

import javax.swing.JOptionPane;

public class Imc {

	public static void main(String[] args) {
		int resposta = JOptionPane.showConfirmDialog(null, "Olá, vamos descobrir seu IMC?");

		String altura = JOptionPane.showInputDialog("Qual a sua altura?");
		String peso = JOptionPane.showInputDialog("Qual o seu peso?");

		double dAltura = Double.parseDouble(altura);
		double dPeso = Double.parseDouble(peso);

		double imc = (dPeso / Math.pow(dAltura, 2));

		if (imc < 18.5) {
			JOptionPane.showMessageDialog(null, "Você está abaixo do peso, seu IMC é " + imc);
		} else if (imc >= 18.5 && imc < 25) {
			JOptionPane.showMessageDialog(null, "Você está com peso ideal, seu IMC é " + imc);
		} else if (imc >= 25 && imc < 30) {
			JOptionPane.showMessageDialog(null, "Você está levemente acima do peso, seu IMC é " + imc);
		} else if (imc >= 30 && imc < 35) {
			JOptionPane.showMessageDialog(null, "Você está com obesidade de grau I, seu IMC é " + imc);
		} else if (imc >= 35 && imc < 40) {
			JOptionPane.showMessageDialog(null, "Você está com obesidade de grau II, seu IMC é " + imc);
		} else {
			JOptionPane.showMessageDialog(null,
					"Obesidade III, seu IMC é " + imc + ". Por favor, procure um nutricionista.");

		}

	}
}
