package br.upe.ia.busca;

import java.util.Scanner;

import br.upe.ia.estrutura.ListaOrdenada;
import br.upe.ia.geo.Adjacente;
import br.upe.ia.geo.Fronteira;
import br.upe.ia.geo.Municipio;
import br.upe.ia.geo.Municipios;

public class BuscaGulosa {
	
	private ListaOrdenada fronteira;
	private Municipio destino;
	protected boolean achou;
	private int visitados;
	
	public BuscaGulosa(Municipio destino) {
		this.destino = new Municipio(destino.getNome(), destino.getDistanciaPercurso());
		this.destino.setAdjacentes(destino.getAdjacentes());
		this.destino.setVisitado(destino.isVisitado());
		this.achou = false;
		this.visitados = 0;
		
	}
	
	public void buscar(Municipio origem) {
		System.out.println("____________________________________________");
		System.out.println("Cidade atual: "+ origem.getNome());
		System.out.println("____________________________________________");
		origem.setVisitado(true);
		
		if(origem.getNome().equals(destino.getNome())) {
			this.achou = true;
			
		}else {
			this.visitados++;
			this.fronteira = new ListaOrdenada();
			for(Adjacente a : origem.getAdjacentes()) {
				if(!a.getMunicipio().isVisitado()) {
					a.getMunicipio().setVisitado(true);
					this.fronteira.inserir(a.getMunicipio());
				}
			}
			this.fronteira.mostrar();
			
			if(this.fronteira.getPrimeiro()!=null) {
				this.buscar(this.fronteira.getPrimeiro());
			}			
		}
		if (this.achou) {
			System.out.println("Achou destino: "+ origem.getNome());
			System.out.println("Visitados: "+this.visitados);
			System.exit(0);			
			
		}
	}
	
	public static void main(String[]  args) {		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println(" Insira:\n 0 para Angelim \n 1 para Caetes \n 2 para Calçado \n 3 para Canhotinho \n 4 para Capoeiras \n 5 para Garanhuns "
				+ "\n 6 para Jucati \n 7 para Jupi \n 8 para Jurema \n 9 para  Lajedo \n 10 para Paranatama \n 11 para São Bento do Una \n 12 para São João \n");
		
		System.out.println("Insira o número correspondente a sua cidade de origem: ");
		int cidadeOrigem = entrada.nextInt();
		System.out.println("Insira  o número correspondente a sua cidade de destino: ");
		int cidadeDestino = entrada.nextInt();
		
		Municipios lista = new Municipios();
		
		Fronteira fronteira = new Fronteira(cidadeDestino);
		BuscaGulosa busca = new BuscaGulosa(fronteira.apontaCidade(cidadeDestino));
		busca.buscar(fronteira.apontaCidade(cidadeOrigem));
		
	}
	
		
}
