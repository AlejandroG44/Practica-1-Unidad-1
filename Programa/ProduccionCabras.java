package granjita;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProduccionCabras {
	
	final int N=100;
	private int limiteRegistros;
	private int limiteCabras;
	private Cabra lista[];
	private RegistroCabra [] Registros;
	
	public ProduccionCabras() throws FileNotFoundException {
		limiteRegistros =0;
		limiteCabras = 0;
		lista= new Cabra[N];
		Registros = new RegistroCabra[N]; 
		Registros();
		Cabras();
	}
	
    private void Registros() throws FileNotFoundException  {
    	Scanner input;
				input = new Scanner(new FileInputStream("RegistrosCabras.txt"));
		    	while(input.hasNext()) {
		    		int cod= input.useDelimiter(";").nextInt();
		    		int men=input.nextInt();
		    		int litros=input.nextInt();
		    		Registros[limiteRegistros++]= new RegistroCabra(cod,men,litros);
		    	}
		    	input.close();
    }

	private void Cabras() throws FileNotFoundException  {
		Scanner input;
		input = new Scanner(new FileInputStream("caprino.txt"));

		while(input.hasNext()) {
			int cod= input.useDelimiter(";").nextInt();
			String fecha=input.next();
			byte edad=input.nextByte();
			String raza=input.next();
			lista[limiteCabras++]= new Cabra(cod,fecha,edad,raza);
		}
		input.close();
	}

	public void MuestraDatos() {
		System.out.println("Datos de las vacas: ");
		for(int i = 0; i< limiteCabras; i++) {
			System.out.print(lista[i].getCod());
    		System.out.print("\t"+lista[i].getEdad());
    		System.out.print("\t"+lista[i].getFecha());
    		System.out.println("\t"+lista[i].getRaza());
		}
		System.out.println("\n"+"Registros: ");
		for(int i = 0; i< limiteRegistros; i++) {
			System.out.print(Registros[i].getCod());
			System.out.print("\t"+Registros[i].getMes());
    		System.out.println("\t"+Registros[i].getLitros());
		}
		
	}

    private int lecheProm() {
    	int l=0;
    	for(int i = 0; i< limiteRegistros; i++)
    		l+=Registros[i].getLitros();
    	
    	return l/ limiteRegistros;
    }
    
    private int MaxLeche() {
    	int mleche=0;
    	int c=0;
    	for(int i=0;i<limiteRegistros;i++) {
    		if(Registros[i].getLitros()>mleche) {
    			mleche=Registros[i].getLitros();
    	        c=Registros[i].getCod();
    	        }
    		}
    	return c;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
    	
    	ProduccionCabras c = new ProduccionCabras();
		c.MuestraDatos();
		System.out.println("La cabra con mayor produccion de leche es: "+c.MaxLeche());
		System.out.println("El promedio de leche de las cabras es: "+c.lecheProm());
    }
      
}