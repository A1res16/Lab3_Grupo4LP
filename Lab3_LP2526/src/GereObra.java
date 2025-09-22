import java.util.ArrayList;

public class GereObra {
	
	ArrayList<Obra> obras;

	public GereObra() {
		obras = new ArrayList<>();
	}
	
	
	public void registarObra(String titulo, String autor, int ano)
	{
		for(Obra o1 : obras)
		{
			if(o1.getTitulo().equalsIgnoreCase(titulo) && o1.getAutor().equalsIgnoreCase(autor)) 
			{
				System.out.print("obra já existente");
				return;
			}
		}
		Obra o2 = new Obra(titulo, autor, ano);
		obras.add(o2);
		System.out.print("obra registada");
	}
	
	
	public void imprimirTodosDetalhes()
	{
		for(Obra o1 : obras)
		{
			o1.imprimirDetalhes();
		}
	}
	
	
	public void pesquisarObraPorTitulo(String titulo)
	{
		for(Obra o1 : obras)
		{
			if(o1.getTitulo().equalsIgnoreCase(titulo)) 
			{
				o1.imprimirDetalhes();
				return;
			}
		}
		System.out.print("obra de arte não encontrada");
	}
	
	
	public void imprimirPinturaAOleoPorTipoDeTela(String tipo)
	{
		for(Obra o1 : obras)
		{
			if(o1.getClass().getSimpleName().equalsIgnoreCase("PinturaAOleo"))
			{
				if(((PinturaAOleo)o1).getTipo().equalsIgnoreCase(tipo))
				{
					o1.imprimirDetalhes();
				}
			}
		}
	}
	
	
	
	public void imprimirDetalhesPorTipo(String c1)
	{
		imprimirDetalhesPorTipoCicloFor("Pintura");
		imprimirDetalhesPorTipoCicloFor("PinturaAOleo");
		imprimirDetalhesPorTipoCicloFor("Escultura");
	}
	
	
	public void imprimirDetalhesPorTipoCicloFor(String c1)
	{
		int count = 0;
		
		System.out.println(c1 +": ");
		for(Obra o1 : obras)
		{
			if(o1.getClass().getSimpleName().equalsIgnoreCase(c1))
			{
				o1.imprimirDetalhes();
				count = count + 1;
			}
		}
		System.out.println("numero de obras: " +count);
		
	}
	
	

}
