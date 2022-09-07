package granjita;

public class RegistroVaca {
	
	private int cod;
	private int semana;
	private int a�o;
	private int litros;
	
	public RegistroVaca(int cod, int semana, int a�o, int litros) {
		super();
		this.cod = cod;
		this.semana = semana;
		this.a�o = a�o;
		this.litros = litros;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public int getSemana() {
		return semana;
	}

	public void setSemana(int semana) {
		this.semana = semana;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public int getLitros() {
		return litros;
	}

	public void setLitros(int litros) {
		this.litros = litros;
	}

	@Override
	public String toString() {
		return "RegistroVaca [cod=" + cod + ", semana=" + semana + ", a�o=" + a�o + ", litros=" + litros + "]";
	}
	
	
	

}
