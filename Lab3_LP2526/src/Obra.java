/**@author aires
 * @version 1ª classe obra para catalogar obras de arte de um museu
 */

public class Obra 
{
   private String titulo;
   private String autor;
   private int anoCriacao;

   public Obra(String titulo, String autor, int anoCriacao) 
   {
	   this.titulo = titulo;
	   this.autor = autor;
	   this.anoCriacao = anoCriacao;
   }

   //Metodos interrogadores
   public String getTitulo() 
   {
	   return titulo;
   }

   public String getAutor() 
   {
	   return autor;
   }
   
   //Metodo para imprimir os detalhes das obras
   public void imprimirDetalhes()
   {
	   System.out.println("Titulo : " + titulo);
	   System.out.println("Autor : " + autor);
	   System.out.println("Ano de Criacao : " + anoCriacao);
   }
   
}
