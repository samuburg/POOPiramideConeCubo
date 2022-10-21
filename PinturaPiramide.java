package atividades14DeOutubro;

public class PinturaPiramide {
	
	private int tipo;
	private double altura;
	private double base;
	
	public double calcAreaBase() {
		double areaBase = (this.base * this.base);
		
		return areaBase;
	}
	
	public double calcAreaTriangulo() {
		double areaTriangulo = (this.base*this.altura)/2;
		
		return areaTriangulo;
	}
	
	public double calcAreaTotal() {
		double areaTotal;
		areaTotal = (((this.base*this.altura)/2)*4) + (this.base * this.base);
		
		return areaTotal;
	}
	
	public double calcLitros() {
		double litros;
		litros = calcAreaTotal()/4.76;
		
		return litros;
	}
	
	public double calcVolumePiramide() {
		double volume;
		double areaBase = calcAreaBase();
		volume = (0.3333*areaBase)*this.altura;
		
		return volume;
	}
	
	public int calcLatasTinta() {
		int lata;
		lata = (int) Math.ceil(calcLitros()/18);
		
		return lata;
	}
	
	public double calcPreco() {
		double preco;
		if (this.tipo==1) {
			preco = calcLatasTinta()*127.90; 
		} else if (this.tipo==2) {
			preco = calcLatasTinta()*258.98; 
		}else{
			preco = calcLatasTinta()*344.34;
		}
		
		return preco;

	}
	
	
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		if (tipo<4 && tipo>0) {
			this.tipo = tipo;
		}
		
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		if (altura>0) {
			this.altura = altura;
		}
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		if (base>0) {
			this.base = base;
		}
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PinturaPiramide [tipo=");
		builder.append(tipo);
		builder.append(", altura=");
		builder.append(altura);
		builder.append(", base=");
		builder.append(base);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	

}
