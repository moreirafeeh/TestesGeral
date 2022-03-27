package com.lipe.teste.Interface;



public class Calculadora {
	
	public CalcMethods calc;
	
	public Calculadora(CalcMethods calc) {
		this.calc = calc;
	}
	
	public void operar() {
		
		calc.operacao();
		
	}
	
	
}
