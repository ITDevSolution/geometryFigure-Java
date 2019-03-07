package com.itdevsolution.figurasgeometricas.negocio.bean;

public class Cilindro extends Esfera{
	
	private double h;
	
	public Cilindro(double h, double r) {
		super(r);
		this.h = h;
	}
	
	public double getH() {
		return h;
	}
	
	public void setH(double h) {
		this.h = h;
	}
	
	@Override
	public double getArea() {
		return 2 * Math.PI * getR() * (getH() + getR());
	}
	
	@Override
	public double getVolumen() {
		return Math.PI * Math.pow(getR(), 2) * getH();
	}
	
	@Override
	public String toString() {
		return String.format("Figura Geometrica: Cilindro:\n\t"
				+ "Altura.....: %,.2f\n\t"
				+ "Radio......: %,.2f\n\t"
				+ "Area.......: %,.2f\n\t"
				+ "Voumen.....: %,.2f\n\t", getH(), getR(), getArea(),getVolumen());
	}
}
