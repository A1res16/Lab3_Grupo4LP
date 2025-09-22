

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
		gere.registarObra(titulo, autor, ano);
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
