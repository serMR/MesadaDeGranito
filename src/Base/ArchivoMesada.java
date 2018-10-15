package Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArchivoMesada {
	
	static public Almacen leer(String path) throws FileNotFoundException  {
		
		Scanner sc = new Scanner(new File(path));
		int cantMesadas = sc.nextInt(), largo, ancho;
		List<Mesada> listMesadas = new ArrayList<Mesada>();
		
		for(int j=0; j<cantMesadas;j++) {
			largo=sc.nextInt();
			ancho=sc.nextInt();
			if(ancho!=0 && largo!=0)
				listMesadas.add(new Mesada(largo,ancho));		
		}

		Collections.sort(listMesadas);
		
		sc.close(); 
		return new Almacen(listMesadas);
	}
	
	static public void escribir(String path, int dato) throws FileNotFoundException {
		
		PrintWriter salida = new PrintWriter(new File(path));
		System.out.println(dato);
		salida.println(dato);
		salida.close();
		
	}
	

}
