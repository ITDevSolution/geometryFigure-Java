package com.itdevsolution.figurasgeometricas.principal;

import com.itdevsolution.figurasgeometricas.negocio.bean.Cilindro;
import com.itdevsolution.figurasgeometricas.negocio.bean.Cono;
import com.itdevsolution.figurasgeometricas.negocio.bean.Cubo;
import com.itdevsolution.figurasgeometricas.negocio.bean.Esfera;
import com.itdevsolution.figurasgeometricas.negocio.bean.Paralelepipedo;
import com.itdevsolution.figurasgeometricas.interfaces.*;

public class Examen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cubo c1 = new Cubo(4);
		Paralelepipedo p1 = new Paralelepipedo(2, 3, 4);
		Esfera e1 = new Esfera(2.65);
		Cilindro cl1 = new Cilindro(2, 1.5);
		Cono co1 = new Cono(5, 6);
		Cono co2 = new Cono(5, 6, 3);
		
		Figura f1[] = new Figura[6];
		
		f1[0] = c1;
		f1[1] = p1;
		f1[2] = e1;
		f1[3] = cl1;
		f1[4] = co1;
		f1[5] = co2;
		
		for(Figura fgeometrica : f1) {
			System.out.println(fgeometrica);
		}
	}

}
