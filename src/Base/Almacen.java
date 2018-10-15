package Base;

import java.util.List;

public class Almacen {
	
	private List<Mesada> listMesadas;
	
	public Almacen(List<Mesada> listMesadas) {
		this.listMesadas = listMesadas;
	}
	
	
	public int apilar() {

		int cant = 0, j, longitud = this.listMesadas.size();
		boolean band;

		for (int i = 0; i < longitud; i++) {
			j = 0;
			band = false;
			while (j < longitud && !band) {
				if (j != i && listMesadas.get(i).esApilable(listMesadas.get(j)))
					band = true; //si es apilable lo descarto como base
				j++;
			}

			if (!band) //si en ningun momento fue apilable es una base de una pila
				cant++;
		}

		return cant == 0 && longitud != 0 ? 1 : cant;
	}
}
