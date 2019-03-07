package com.itdevsolution.figurasgeometricas.negocio.bean;

public class Cono extends Cilindro{
	
	private double generatriz;
	
	public Cono(double h, double r) {
		super(h, r);
	}
	
	public Cono (double h, double r, double generatriz) {
		super(h,r);
		this.generatriz = generatriz;
	}
	
	public double getGeneratriz() {
		return Math.sqrt(Math.pow(getH(), 2) + Math.pow(getR(), 2));
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * getR() * generatriz + Math.PI * Math.pow(getR(), 2);
	}

	@Override
	public double getVolumen() {
		// TODO Auto-generated method stub
		return (Math.PI * Math.pow(getR(), 2) * getH())/3;
	}
	
	@Override
	public String toString() {
		return String.format("Figura Geometrica: Cono:\n\t"
				+ "Altura.....: %,.2f\n\t"
				+ "Radio......: %,.2f\n\t"
				+ "Generatriz.: %,.2f\n\t"
				+ "Area.......: %,.2f\n\t"
				+ "Volumen.....: %,.2f\n", getH(), getR(), generatriz,
				getArea(),getVolumen());
	}

}
