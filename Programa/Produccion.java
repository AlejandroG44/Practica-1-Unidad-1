package granjita;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Produccion {
	
	final int N=100;
	private int limiteRegistros;
	private int limiteVacas;
	private Vaca lista[];
	private RegistroVaca [] Registros;
	
	public Produccion() throws FileNotFoundException {
		limiteRegistros =0;
		limiteVacas = 0;
		lista= new Vaca[N];
		Registros = new RegistroVaca[N]; 
		Registros();
		Vacas();
	}
	
    private void Registros() throws FileNotFoundException  {
    	Scanner input;
				input = new Scanner(new FileInputStream("RegistrosVacas.txt"));
		    	while(input.hasNext()) {
		    		int cod= input.useDelimiter(";").nextInt();
		    		int sem=input.nextInt();
		    		int año=input.nextInt();
		    		int litros=input.nextInt();
		    		Registros[limiteRegistros++]= new RegistroVaca(cod,sem,año,litros);
		    	}
		    	input.close();
    }

	private void Vacas() throws FileNotFoundException  {
		Scanner input;
		input = new Scanner(new FileInputStream("vacuno.txt"));

		while(input.hasNext()) {
			int cod= input.useDelimiter(";").nextInt();
			String fecha=input.next();
			byte edad=input.nextByte();
			String raza=input.next();
			lista[limiteVacas++]= new Vaca(cod,fecha,edad,raza);
		}
		input.close();
	}

	public void MuestraDatos() {
		System.out.println("Datos de las vacas: ");
		for(int i = 0; i< limiteVacas; i++) {
			System.out.print(lista[i].getCod());
    		System.out.print("\t"+lista[i].getEdad());
    		System.out.print("\t"+lista[i].getFecha());
    		System.out.println("\t"+lista[i].getRaza());
		}
		System.out.println("\n"+"Registros: ");
		for(int i = 0; i< limiteRegistros; i++) {
			System.out.print(Registros[i].getCod());
			System.out.print("\t"+Registros[i].getSemana());
    		System.out.print("\t"+Registros[i].getAño());
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
    	
    	Produccion i = new Produccion();
		i.MuestraDatos();
		System.out.println("La vaca con mayor produccion de leche es: "+i.MaxLeche());
		System.out.println("El promedio de leche de las vacas es: "+i.lecheProm());
    }
      
}