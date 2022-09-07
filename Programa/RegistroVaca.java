package granjita;

public class RegistroVaca {
	
	private int cod;
	private int semana;
	private int año;
	private int litros;
	
	public RegistroVaca(int cod, int semana, int año, int litros) {
		super();
		this.cod = cod;
		this.semana = semana;
		this.año = año;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getLitros() {
		return litros;
	}

	public void setLitros(int litros) {
		this.litros = litros;
	}

	@Override
	public String toString() {
		return "RegistroVaca [cod=" + cod + ", semana=" + semana + ", año=" + año + ", litros=" + litros + "]";
	}
	
	
	

}
