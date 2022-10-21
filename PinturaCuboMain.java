package atividades14DeOutubro;

public class PinturaCuboMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PinturaCubo cubo = new PinturaCubo();
		
		cubo.setLado(5);
		cubo.setTipoTinta(2);
		cubo.setRendimento(2); // em metros quadrados por litro;
		cubo.setArea();
		cubo.setAreaTotal();
		cubo.setLitros();
		cubo.setLatas();
		cubo.setPrecoTotal();
		
		System.out.println(cubo);

	}

}
