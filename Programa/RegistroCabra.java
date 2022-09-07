package granjita;

public class RegistroCabra {
	
	private int cod;
	private int mes;
	private int litros;
	
	public RegistroCabra(int cod, int mes, int litros) {
		super();
		this.cod = cod;
		this.mes = mes;
		this.litros = litros;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getLitros() {
		return litros;
	}
	public void setLitros(int litros) {
		this.litros = litros;
	}
	@Override
	public String toString() {
		return "RegistroCabra [cod=" + cod + ", mes=" + mes + ", litros=" + litros + "]";
	}
	
}
