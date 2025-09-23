/**
 * Pedro Nobre
 */


import java.util.ArrayList;

public class GereObra {
	
	ArrayList<Obra> obras;

	public GereObra() {
		obras = new ArrayList<>();
	}
	
	
	public Boolean pesquisarObra(String titulo, String autor)
	{
		for(Obra o1 : obras)
		{
			if(o1.getTitulo().equalsIgnoreCase(titulo) && o1.getAutor().equalsIgnoreCase(autor)) 
			{
				System.out.print("obra já existente");
				return false;
			}
		}
		return true;
	}
	
	public void registarPintura(String titulo, String autor, int ano, String tecnica)
	{
		if(pesquisarObra(titulo, autor) == false)
		{
			return;
		}
		Pintura p1 = new Pintura(titulo, autor, ano, tecnica);
		obras.add(p1);
		System.out.println("Pintura registada...");

	}
	
	
	public void registarPinturaAOleo(String titulo, String autor, int ano, String tecnica, String tipoDeTela)
	{
		if(pesquisarObra(titulo, autor) == false)
		{
			return;
		}
		PinturaAOleo p1 = new PinturaAOleo(titulo, autor, ano, tecnica, tipoDeTela);
		obras.add(p1);
		System.out.println("Pintura a óleo registada...");
	}
	
	
	public void registarEscultura(String titulo, String autor, int ano, String material)
	{
		if(pesquisarObra(titulo, autor) == false)
		{
			return;
		}
		Escultura p1 = new Escultura(titulo, autor, ano, material);
		obras.add(p1);
		System.out.println("Escultura registada...");

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
				if(((PinturaAOleo)o1).getTipoDeTela().equalsIgnoreCase(tipo))
				{
					o1.imprimirDetalhes();
				}
			}
		}
	}
	
	
	
	public void imprimirDetalhesPorTipo()
	{
		imprimirDetalhesPorTipoCicloFor("Pintura");
		imprimirDetalhesPorTipoCicloFor("PinturaAOleo");
		imprimirDetalhesPorTipoCicloFor("Escultura");
	}
	
	
	public void imprimirDetalhesPorTipoCicloFor(String c1)
	{
		int count = 0;
		
		System.out.println(c1 +": ");
		System.out.println(" ");
		for(Obra o1 : obras)
		{
			if(o1.getClass().getSimpleName().equalsIgnoreCase(c1))
			{
				o1.imprimirDetalhes();
				count = count + 1;
			}
		}
		System.out.println("numero de obras: " +count);
		System.out.println(" ");
		
	}
	
	

}
