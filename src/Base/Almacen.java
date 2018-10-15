package Base;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Almacen {
	
	private List<Mesada> listMesadas;
	
	public Almacen(List<Mesada> listMesadas) {
		this.listMesadas = listMesadas;
	}
	
	
	public int apilar() {

		int cant = 0, j, longitud = this.listMesadas.size();
		boolean band;
		Set<Mesada> mesadasBases = new TreeSet<Mesada>();
		
		for (int i = 0; i < longitud; i++) {
			j = 0;
			band = false;
			while (j < longitud && !band) {
				if (j != i && listMesadas.get(i).esApilable(listMesadas.get(j))) 
					band = true; //si es apilable lo descarto como base
				
				j++;
			}

			if (!band) {//si en ningun momento fue apilable es una base de una pila
				mesadasBases.add(this.listMesadas.get(i));
				cant++;
//				System.out.println(this.listMesadas.get(i).toString());	
			}
		}
		
//		for(Mesada m : mesadasBases) {
//			System.out.println(m.toString());
//		}
//		
//		System.out.println(mesadasBases.size());
		
		return mesadasBases.size();
	}
}
