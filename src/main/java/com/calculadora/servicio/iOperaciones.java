package com.calculadora.servicio;

public class iOperaciones implements Operaciones{

	@Override
	public int sumar(int a, int b) {
		return a+b;
	}

	@Override
	public int multiplicacion(int a, int b) {
		return a*b;
	}

	@Override
	public int resta(int a, int b) {
		return a-b;
	}

}
