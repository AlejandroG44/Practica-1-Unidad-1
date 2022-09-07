package granjita;

public class Cabra {
	
	private int cod;
	private String fecha;
	private byte edad;
	private String raza;
	public Cabra(int cod, String fecha, byte edad, String raza) {
		super();
		this.cod = cod;
		this.fecha = fecha;
		this.edad = edad;
		this.raza = raza;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public byte getEdad() {
		return edad;
	}
	public void setEdad(byte edad) {
		this.edad = edad;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	@Override
	public String toString() {
		return "Cabra [cod=" + cod + ", fecha=" + fecha + ", edad=" + edad + ", raza=" + raza + "]";
	}
	
	
}
