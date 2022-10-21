package atividades14DeOutubro;

public class PinturaCone {
	private double raio;
	private double altura;
	private double alturaLateral;
	private double areaCone;
	private double areaCirculo;
	private double areaTotal;
	
	private String tipoTinta;
	private double litros;
	private int latas;
	private double precoTotal;
	
	public PinturaCone(double raio, double altura) {
		this.raio = raio;
		this.altura = altura;
	}
	
	public PinturaCone() {
		
	}
	
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		if (raio>0) {
			this.raio = raio;
		}
		
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		if (altura>0){
			this.altura = altura;
		}
		
	}
	
	public double getAlturaLateral() {
		return alturaLateral;
	}
	public void setAlturaLateral() {
		this.alturaLateral = Math.sqrt((this.altura*this.altura)+(this.raio*this.raio));
	}
	public double getAreaCone() {
		return areaCone;
	}
	public void setAreaCone() {
		this.areaCone = 3.14*this.raio*(this.raio+this.alturaLateral);
	}
	public double getAreaCirculo() {
		return areaCirculo;
	}
	public void setAreaCirculo() {
		this.areaCirculo = 3.14*(this.raio*this.raio);
	}
	public double getAreaTotal() {
		return areaTotal;
	}
	public void setAreaTotal() {
		this.areaTotal = this.areaCirculo+this.areaCone;
	}
	public String getTipoTinta() {
		return tipoTinta;
	}
	public void setTipoTinta(String tipoTinta) {
		this.tipoTinta = tipoTinta;
	}
	public double getLitros() {
		return litros;
	}
	public void setLitros() {
		this.litros = this.areaTotal*3.45;
	}
	public int getLatas() {
		return latas;
	}
	public void setLatas() {
		this.latas = (int) Math.ceil(this.litros/18);
	}
	public double getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal() {
		this.precoTotal = 238.9*this.latas;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PinturaCone [raio=");
		builder.append(raio);
		builder.append(", altura=");
		builder.append(altura);
		builder.append(", alturaLateral=");
		builder.append(alturaLateral);
		builder.append(", areaCone=");
		builder.append(areaCone);
		builder.append(", areaCirculo=");
		builder.append(areaCirculo);
		builder.append(", areaTotal=");
		builder.append(areaTotal);
		builder.append(", tipoTinta=");
		builder.append(tipoTinta);
		builder.append(", litros=");
		builder.append(litros);
		builder.append(", latas=");
		builder.append(latas);
		builder.append(", precoTotal=");
		builder.append(precoTotal);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
	
	

}
