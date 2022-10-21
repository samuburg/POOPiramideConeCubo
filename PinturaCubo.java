package atividades14DeOutubro;

public class PinturaCubo {
	private double lado;
	private double area;
	private double areaTotal;
	private double volume;
	private double diagonal;
	private int tipoTinta;
	private double rendimento; // metros quadrados por litro;
	private double litros;
	private int latas;
	private double precoTotal;
	
	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		if (lado>0) {
			this.lado = lado;
		}
	}
	public double getArea() {
		return area;
	}
	public void setArea() {
		this.area = this.lado*this.lado;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume() {
		this.volume = this.lado*this.lado*this.lado;
	}
	public double getDiagonal() {
		return diagonal;
	}
	public void setDiagonal() {
		this.diagonal = this.lado*Math.cbrt(3);
	}
	public int getTipoTinta() {
		return tipoTinta;
	}
	public void setTipoTinta(int tipoTinta) {
		if (tipoTinta>0&&tipoTinta<4) {
			this.tipoTinta = tipoTinta;
		}
		
	}
	public double getRendimento() {
		return rendimento;
	}
	public void setRendimento(double rendimento) {
		if (rendimento>0){
			this.rendimento = rendimento;
		}

	}
	public double getLitros() {
		return litros;
	}
	public void setLitros() {
		this.litros = areaTotal/rendimento;
	}
	public int getLatas() {
		return latas;
	}
	public void setLatas() {
		this.latas = (int) Math.ceil(litros/18);
	}
	public double getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal() {
		if (tipoTinta==1) {
			this.precoTotal = latas*101.9;
		}else if (tipoTinta==2){
			this.precoTotal = latas*212.45;
		}else if (tipoTinta==3){
			this.precoTotal = latas*345.56;
		}
		
	}
	public double getAreaTotal() {
		return areaTotal;
	}
	public void setAreaTotal() {
		this.areaTotal = this.area*6;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PinturaCubo lado=");
		builder.append(lado);
		builder.append("\n");
		builder.append("area=");
		builder.append(area);
		builder.append("\n");
		builder.append("areaTotal=");
		builder.append(areaTotal);
		builder.append("\n");
		builder.append("volume=");
		builder.append(volume);
		builder.append("\n");
		builder.append("diagonal=");
		builder.append(diagonal);
		builder.append("\n");
		builder.append("tipoTinta=");
		builder.append(tipoTinta);
		builder.append("\n");
		builder.append("rendimento=");
		builder.append(rendimento);
		builder.append("\n");
		builder.append("litros=");
		builder.append(litros);
		builder.append("\n");
		builder.append("latas=");
		builder.append(latas);
		builder.append("\n");
		builder.append("precoTotal=");
		builder.append(precoTotal);
		
		return builder.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
