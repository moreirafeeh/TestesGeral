package com.lipe.teste.Interface;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Somar son = new Somar();
			Subtrair sub = new Subtrair();
			Calculadora calc =  new Calculadora(sub);
			
			calc.operar();
			
	}

}
