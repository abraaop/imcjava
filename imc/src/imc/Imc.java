package imc;

import javax.swing.JOptionPane;

public class Imc {

	public static void main(String[] args) {
		int resposta = JOptionPane.showConfirmDialog(null, "Ol�, vamos descobrir seu IMC?");
		if(resposta==0) {
			
			String altura = JOptionPane.showInputDialog("Qual a sua altura?");
			String peso = JOptionPane.showInputDialog("Qual o seu peso?");

			double dAltura = Double.parseDouble(altura);
			double dPeso = Double.parseDouble(peso);

			double imc = (dPeso / Math.pow(dAltura, 2));

			if (imc < 18.5) {
				JOptionPane.showMessageDialog(null, "Voc� est� abaixo do peso, seu IMC � " + imc);
			} else if (imc >= 18.5 && imc < 25) {
				JOptionPane.showMessageDialog(null, "Voc� est� com peso ideal, seu IMC � " + imc);
			} else if (imc >= 25 && imc < 30) {
				JOptionPane.showMessageDialog(null, "Voc� est� levemente acima do peso, seu IMC � " + imc);
			} else if (imc >= 30 && imc < 35) {
				JOptionPane.showMessageDialog(null, "Voc� est� com obesidade de grau I, seu IMC � " + imc);
			} else if (imc >= 35 && imc < 40) {
				JOptionPane.showMessageDialog(null, "Voc� est� com obesidade de grau II, seu IMC � " + imc);
			} else {
				JOptionPane.showMessageDialog(null,
						"Obesidade III, seu IMC � " + imc + ". Por favor, procure um nutricionista.");

			}
		} else {
			JOptionPane.showMessageDialog(null, "Ok, quando quiser saber do seu IMC, por favor, volte!");
		}

		

	}
}
