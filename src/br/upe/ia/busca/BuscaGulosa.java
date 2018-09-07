package br.upe.ia.busca;

import br.upe.ia.estrutura.ListaOrdenada;
import br.upe.ia.geo.Adjacente;
import br.upe.ia.geo.Mapa;
import br.upe.ia.geo.Municipio;

public class BuscaGulosa {

	private ListaOrdenada fronteira;
	private Municipio destino;
	protected boolean achou;
	private int visitados;

	public BuscaGulosa(Municipio destino) {
		this.destino = destino;
		this.achou = false;
		this.visitados = 0;
	}

	public void buscar(Municipio origem) {
		System.out.println("================================================");
		System.out.println("Cidade atual: " + origem.getNome());
		System.out.println("================================================");
		origem.setVisitado(true);
		if (origem.getNome().equals(destino.getNome())) {
			this.achou = true;
		} else {
			this.visitados++;
			this.fronteira = new ListaOrdenada();
			for (Adjacente a : origem.getAdjacentes()) {

				if (!a.getMunicipio().isVisitado()) {
					a.getMunicipio().setVisitado(true);
					this.fronteira.inserir(a.getMunicipio());
				}
			}

			this.fronteira.mostrar();
			if (this.fronteira.getPrimeiro() != null) {
				this.buscar(this.fronteira.getPrimeiro());
			}
		}

		if (this.achou) {
			System.out.println("Achou o destino: " + origem.getNome());
			System.out.println("Visitados: " + this.visitados);
			System.exit(0);
		}

	}
	
	public static void main(String[] args) {
		Mapa m = new Mapa();
		BuscaGulosa b = new BuscaGulosa(m.getAngelim());
		b.buscar(m.getSaoBentoDoUna());
	}

}
