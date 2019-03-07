package com.itdevsolution.figurasgeometricas.negocio.bean;

public class Paralelepipedo extends Cubo {
	
	private double b;
	private double h;
	public Paralelepipedo(double a, double b, double h) {
		super(a);
		this.b = b;
		this.h = h;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 2 * (getA()*getB() + getB()*getH() + getA()*getH());
	}
	@Override
	public double getVolumen() {
		// TODO Auto-generated method stub
		return getA() * getB() * getH();
	}
	
	@Override
	public String toString() {
		return String.format("Figura Geometrica Paralelepipedo:\n\t"
				+ "Area........: %,.2f\n\t"
				+ "Volumen.....: %,.2f", getArea(),getVolumen());
	}
	
}
