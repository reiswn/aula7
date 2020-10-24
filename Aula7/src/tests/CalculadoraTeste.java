package tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Calculadora;

class CalculadoraTeste {

	@Test
	void testSomar() {
		
		Calculadora calc = new Calculadora();
		double resultado = calc.somarNumeros(5.5,5.7);
		
		assertEquals(11.2, resultado);
	}
	
	@Test
	void testSubtrair() {
		
		Calculadora calc = new Calculadora();
		double resultado = calc.subtrair(6,-1);
		
		assertEquals(7, resultado);
		
	}

	@Test
	void testDividir() {
		Calculadora calc = new Calculadora();
		double resultado = calc.dividir(10,2);
		
		assertEquals(5, resultado);
	}
	
	@Test
	void testMultiplicar() {
		Calculadora calc = new Calculadora();
		double resultado = calc.multiplicar(10,2);
		
		assertEquals(20, resultado);
	}
	
}
