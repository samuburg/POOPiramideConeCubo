package atividades14DeOutubro;

public class PinturaPiramideMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PinturaPiramide queops = new PinturaPiramide();
		
		queops.setAltura(41.87);
		queops.setBase(13.89);
		queops.setTipo(3);
		
		System.out.println("Area base: "+ queops.calcAreaBase());
		System.out.println("Area triangulo: "+ queops.calcAreaTriangulo());
		System.out.println("Area total: "+ queops.calcAreaTotal());
		System.out.println("Tipo da tinta: "+ queops.getTipo());
		System.out.println("Litros de tinta: "+ queops.calcLitros());
		System.out.println("Volume Piramide: "+ queops.calcVolumePiramide());
		System.out.println("Latas de tinta: "+ queops.calcLatasTinta());
		System.out.println("Preço total: "+ queops.calcPreco());
		
		

	}

}
