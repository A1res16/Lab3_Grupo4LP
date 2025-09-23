

import java.util.Scanner;

public class Teste {
	
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		GereObra gere = new GereObra();
		
		
		int opcao;
		
		do {
			mostrarMenu();
			opcao = lerInt("Opção: ");
			System.out.println();
			
			switch (opcao) {
			case 1 -> registarObra(gere);                      
            case 2 -> gere.imprimirTodosDetalhes();            
            case 3 -> pesquisarPorTitulo(gere);                
            case 4 -> listarPinturasAOleoPorTela(gere);        
            case 5 -> gere.imprimirDetalhesPorTipo();          
            case 0 -> System.out.println("A sair...");
            default -> System.out.println("Opção inválida!");
			}
			System.out.println();
		}while(opcao != 0);
	}
	
	public static void registarObra(GereObra gere) {
		System.out.println("--REGISTO DA OBRA--");
		String titulo = lerLinha("Título: ");
		String autor = lerLinha("Autor: ");
		int ano = lerInt("Ano: ");
		int tipo = lerInt("tipo: \n1) Pintura\n2) Escultura");
		while (tipo != 1 && tipo != 2)
		{
			System.out.println("Por favor, escolha uma das opções.");
			tipo = lerInt("tipo: \n1) Pintura\n2) Escultura");
		}
		if (tipo == 1) 
		{
			registarObraPintura(titulo, autor, ano, gere);
		}
		if (tipo == 2) 
		{
			registarObraEscultura(titulo, autor, ano, gere);
		}
	}
	
	public static void registarObraPintura(String titulo, String autor, int ano, GereObra gere ) {
		String tecnica = lerLinha("Técnica: ");
		int tipo = lerInt("Pintura a óleo: \n1) Sim\n2) Não");
		while (tipo != 1 && tipo != 2)
		{
			System.out.println("Por favor, escolha uma das opções.");
			tipo = lerInt("Pintura a óleo: \n1) Sim\n2) Não");
		}
		if (tipo == 1) 
		{
			String tipoDeTela = lerLinha("Tipo de tela: ");
			gere.registarPinturaAOleo(titulo, autor, ano, tecnica, tipoDeTela);
			return;
		}
		gere.registarPintura(titulo, autor, ano, tecnica);
	}
	
	public static void registarObraEscultura(String titulo, String autor, int ano, GereObra gere ) {
		String material = lerLinha("Material: ");
		gere.registarEscultura(titulo, autor, ano, material);
	}
	
	
	
	private static void pesquisarPorTitulo(GereObra gere) {
		System.out.println("--PESQUISAR--");
		String titulo = lerLinha("Título: ");
		gere.pesquisarObraPorTitulo(titulo);
	}
	
	private static void listarPinturasAOleoPorTela(GereObra gere) {
        System.out.println("-- Pinturas a Óleo por Tipo de Tela --");
        String tipoTela = lerLinha("Tipo de tela (ex: linho, algodão): ");
        gere.imprimirPinturaAOleoPorTipoDeTela(tipoTela);
    }
	
	private static int lerInt(String mensagem) {
		while(true) {
			try {
				System.out.print(mensagem);
				return Integer.parseInt(sc.nextLine().trim());
			} catch (NumberFormatException e) {
				System.out.print("Este número não é válido. ");
			}
		}
	}
	
	private static String lerLinha(String mensagem) {
		System.out.print(mensagem);
		return sc.nextLine().trim();
	}
	
	private static void mostrarMenu() {
        System.out.println("====MENU====");
        System.out.println("1) Registar obra");
        System.out.println("2) Imprimir detalhes da obra");
        System.out.println("3) Pesquisar uma obra pelo título");
        System.out.println("4) Imprimir (título e autor) das pinturas a óleo por tipo de tela");
        System.out.println("5) Imprimir detalhes agrupados por tipo (Pintura, PinturaAOleo, Escultura)");
        System.out.println("0) Sair");
    }

}
