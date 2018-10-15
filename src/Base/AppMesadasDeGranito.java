package Base;

import java.io.FileNotFoundException;

public class AppMesadasDeGranito {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Almacen almacen = ArchivoMesada.leer(".\\mesadas6.in");
		ArchivoMesada.escribir(".\\mesadas.out", almacen.apilar());
	}

}
