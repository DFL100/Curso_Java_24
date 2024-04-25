package objetos2;

public class Pelicula {

	private String titulo;
	private String plataforma;
	private int anho;
	
	public Pelicula(String titulo, String plataforma, int anho) {
		super();
		this.titulo = titulo;
		this.plataforma = plataforma;
		this.anho = anho;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public int getAnho() {
		return anho;
	}

	public void setAnho(int anho) {
		this.anho = anho;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", plataforma=" + plataforma + ", anho=" + anho + "]";
	}
	
	
	
}
