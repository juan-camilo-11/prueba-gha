package com.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


import com.calculadora.servicio.iOperaciones;


class CalcuApplicationTests {
	@Test
	 public void multiplicacionDosNumeros() {
		iOperaciones operaciones = new iOperaciones();
       int result = operaciones.multiplicacion(3, 6);
       assertEquals(18, result);
   }

}
