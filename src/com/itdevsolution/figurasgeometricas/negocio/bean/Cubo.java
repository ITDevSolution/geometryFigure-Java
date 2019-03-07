package com.itdevsolution.figurasgeometricas.negocio.bean;

import com.itdevsolution.figurasgeometricas.interfaces.Figura;

public class Cubo implements Figura{
	
	private double a;
	
	public Cubo(double a) {
		this.a = a;
	}
	
	public double getA() {
		return a;
	}
	
	public void setA(double a) {
		this.a = a;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 6 * Math.pow(a, 2) ;
	}

	@Override
	public double getVolumen() {
		// TODO Auto-generated method stub
		return Math.pow(a, 3);
	}
	
	@Override
	public String toString() {
		return String.format("FIGURA GEOMETRICA: Cubo\n\t"
				+ "Area......: %,.2f\n\t"
				+ "Volumen...: %,.2f", getArea(),getVolumen());
	}
	
	
	
}
