import java.text.DecimalFormat;

public class Paciente {
	private double peso;
	private double altura;

	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}

	double calcularIMC() {
		
		return  this.peso / Math.pow(this.altura, 2);
		
	}

	String diagnostico() {
		
		
		DecimalFormat df2 = new DecimalFormat(".##"); //Formata o Double com apenas 2 casas decimais depois da virgula
		String diagnostico = null;
		double resultadoIMC = calcularIMC();
		

		if (resultadoIMC < 16) {

			diagnostico = "Baixo peso muito grave ";

		} else if (resultadoIMC >= 16 && resultadoIMC <= 16.99) {

			diagnostico = "Baixo peso grave";

		} else if (resultadoIMC >= 17 && resultadoIMC <= 18.49) {

			diagnostico = "Baixo peso";

		} else if (calcularIMC() >= 18.50 && calcularIMC() <= 24.99) {

			diagnostico = "Peso normal";

		} else if (calcularIMC() >= 25 && calcularIMC() <= 29.99) {

			diagnostico = "Sobrepeso";

		} else if (calcularIMC() >= 30 && calcularIMC() <= 34.99) {

			diagnostico = "Obesidade grau I";

		} else if (calcularIMC() >= 35 && calcularIMC() <= 39.99) {

			diagnostico = "Obesidade grau II";

		} else if (calcularIMC() >= 40) {

			diagnostico = "Obesidade grau III";
		}
		System.out.println("Seu IMC é: " + df2.format(calcularIMC())+ " seu diagnostico é: " + diagnostico);
		return diagnostico;
	}

	/*
	 * Getters and Setters
	 */
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}
