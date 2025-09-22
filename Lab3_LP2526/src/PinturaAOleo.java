/**
 * @author Rodrigo
 * classe pintura a oleo que herda de pintura que herda da obra
 */
public class PinturaAOleo extends Pintura {

	private String tipoDeTela;

	/**
	 * @param titulo
	 * @param autor
	 * @param anoCriacao
	 * @param tecnica
	 * @param tipoDeTela
	 */
	public PinturaAOleo(String titulo, String autor, int anoCriacao, String tecnica, String tipoDeTela) {
		super(titulo, autor, anoCriacao, tecnica);
		this.tipoDeTela = tipoDeTela;
	}

	/**
	 * @return the tipoDeTela
	 */
	public String getTipoDeTela() {
		return tipoDeTela;
	}
	
	public void imprimirDetalhes() {
		   super.imprimirDetalhes();
		   System.out.println("Tipo de tela : " + tipoDeTela);
	   }
	
}
