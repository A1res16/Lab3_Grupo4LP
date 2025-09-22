/**@author aires
 * @version 1ª classe Pintura, extende a super classe obra
 */
public class Pintura extends Obra
{ 
   private String tecnica;

   //construtor
   public Pintura(String titulo, String autor, int anoCriacao, String tecnica) 
   {
	   super(titulo, autor, anoCriacao);
	   this.tecnica = tecnica;
   }
   
   
   
   public String getTecnica() {
	return tecnica;
}



//polimorfismo
   //Metodo para imprimir os detalhes das obras
   @Override
   public void imprimirDetalhes()
   {
	   super.imprimirDetalhes();
	   System.out.println("Tecnica : " + tecnica);
   }
}
