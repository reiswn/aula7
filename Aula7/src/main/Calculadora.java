package main;


/**
 * Esta classe Calculadora é responsável por executar as operações matemáticas básicas.
 * 
 * @author willian
 * @see java.lang.Math
 * @since 1.0.0
 */

public class Calculadora {

	/**
	 * O método {@code somar} faz a soma de dois números
	 * 
	 * @param i valor do primeiro número a ser somado
	 * @param j valor do segundo número a ser somado
	 * @return valor da soma de i e j
	 * @see Math
	 */
	public double somar(double i, double j) {
		return i + j;
	}

	/**
	 * O método {@code subtrair} faz a subtração de dois números
	 * 
	 * @param i valor do primeiro número a ser subtraido
	 * @param j valor do segundo número a ser subtraido
	 * @return valor da subtração de i e j
	 * @see Math
	 */
	public double subtrair(double i, double j) {
		double x = i - j;
		return x;
	}

	/**
	 * O método {@code dividir} faz a divisão de dois números
	 * 
	 * @param i valor do primeiro número a ser dividido
	 * @param j valor do segundo número a ser dividido
	 * @return valor da divisão de i e j
	 * @see Math
	 */
	public double dividir(double i, double j) {
		return i / j;
	}

	/**
	 * O método {@code multiplicar} faz a multiplicação de dois números
	 * 
	 * @param i valor do primeiro número a ser multiplicado
	 * @param j valor do segundo número a ser multiplicado
	 * @return valor da multiplicação de i e j
	 * @see Math
	 */
	public double multiplicar(double i, double j) {
		return i*j;
	}

}