/** 
 * @author Rodrigo
 * classe escultura que herda da obra
 */

public class Escultura extends Obra {

	private String material;

	/**
	 * @param titulo
	 * @param autor
	 * @param anoCriacao
	 */
	public Escultura(String titulo, String autor, int anoCriacao, String material) {
		super(titulo, autor, anoCriacao);
		this.material = material;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Escultura [material=" + material + ", getTitulo()=" + getTitulo() + ", getAutor()=" + getAutor()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	public void imprimirDetalhes() {
		   super.imprimirDetalhes();
		   System.out.println("Tipo de material : " + material);
	   }
}
