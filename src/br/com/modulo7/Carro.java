package br.com.modulo7;

/**
 * @author ana.neto
 *
 * @class br.com.modulo7.Carro
 *
 * @version 1.0
 */
public class Carro {
	
	double velocidadeAtual = 0.00;
	static double velocidadeAcelerada = 0.00;

	public static void main(String[] args) {

		Carro meuCarro = new Carro();
		meuCarro.acelerar();
		meuCarro.mostrarVelocidadeAcelerada(velocidadeAcelerada) ;
	}

	private void acelerar() {

		velocidadeAcelerada = velocidadeAtual + 20.00;

	}

	private void mostrarVelocidadeAcelerada(double velocidadeAcelerada) {
		
		System.out.println("Minha velocidade é " + velocidadeAcelerada);

	}
}
