package atividades14DeOutubro;

import java.util.Scanner;

public class PinturaConeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		PinturaCone cone = new PinturaCone();
		
		cone.setAltura(2);
		cone.setRaio(5);
		
		cone.setAreaCirculo();
		cone.setAlturaLateral();
		cone.setAreaCone();
		cone.setAreaTotal();
		cone.setLitros();
		cone.setLatas();
		cone.setPrecoTotal();
		System.out.println("Area total " +cone.getAreaTotal());
		System.out.println("Litros: "+cone.getLitros());
		System.out.println("Latas: "+cone.getLatas());
		System.out.printf("Preço total: %.2f",(cone.getPrecoTotal()));
		
		
		
	}

}
