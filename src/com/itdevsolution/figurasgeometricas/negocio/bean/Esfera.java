package com.itdevsolution.figurasgeometricas.negocio.bean;

import com.itdevsolution.figurasgeometricas.interfaces.Figura;

public class Esfera implements Figura {
	
	private double r;
	public static double PI = 3.1416;

	public Esfera(double r) {
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 4*PI*Math.pow(r, 2);
	}

	@Override
	public double getVolumen() {
		// TODO Auto-generated method stub
		return (4/3) * PI * Math.pow(r, 3);
	}

	@Override
	public String toString() {
		return String.format("Figura Geometrica: Esfera\n\t"
					+ "Area...........: %,.2f\n\t"
					+ "Volumen........: %,.2f\n", getArea(),getVolumen());
	}
	

}
