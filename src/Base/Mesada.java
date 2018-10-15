package Base;

public class Mesada implements Comparable<Object> {
	private int largo;
	private int ancho;
	
	public Mesada(int l, int ancho) {
		this.largo = l;
		this.ancho = ancho;
	}
	
	public boolean esApilable(Mesada obj) {	
		return (obj.largo>this.largo && obj.ancho>this.ancho) || 
				(obj.largo>this.ancho && obj.ancho>this.largo);	
	}
	
	public String toString() {
		return this.largo + " " + this.ancho;
	}

	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		return this.largo - ((Mesada)obj).largo;
	}
	
	
	
	
}
