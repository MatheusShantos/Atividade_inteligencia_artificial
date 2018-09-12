package br.upe.ia.estrutura;

import java.util.LinkedList;

import br.upe.ia.estrutura.ListaOrdenada;
import br.upe.ia.geo.Mapa;
import br.upe.ia.geo.Municipio;

public class ListaOrdenada {

private LinkedList<Municipio> municipios;
	
	public ListaOrdenada() {
		this.municipios = new LinkedList<Municipio>();
	}
	
	
	public void inserir(Municipio municipio) {
		this.municipios.add(municipio);
		this.ordenar();
	}
	
	private void ordenar() {
		for(int i=0; i<this.municipios.size() -1; i++) {
			if(this.municipios.get(i).getDistanciaPercurso() > this.municipios.get(i+1).getDistanciaPercurso()) {
				trocar(i);				
				ordenar();
			}
		}
	}
	
	private void trocar(int i) {
		Municipio municipio1 = new Municipio(this.municipios.get(i).getNome(), this.municipios.get(i).getDistanciaPercurso());
		Municipio municipio2 = new Municipio(this.municipios.get(i+1).getNome(), this.municipios.get(i+1).getDistanciaPercurso());
		
		municipio1.setVisitado(this.municipios.get(i).isVisitado());
		municipio1.setAdjacentes(this.municipios.get(i).getAdjacentes());
		municipio2.setVisitado(this.municipios.get(i+1).isVisitado());
		municipio2.setAdjacentes(this.municipios.get(i+1).getAdjacentes());
		
		this.municipios.get(i).setAdjacentes(municipio2.getAdjacentes());
		this.municipios.get(i).setDistanciaPercurso(municipio2.getDistanciaPercurso());
		this.municipios.get(i).setNome(municipio2.getNome());
		this.municipios.get(i).setVisitado(municipio2.isVisitado());
		
		this.municipios.get(i+1).setAdjacentes(municipio1.getAdjacentes());
		this.municipios.get(i+1).setDistanciaPercurso(municipio1.getDistanciaPercurso());
		this.municipios.get(i+1).setNome(municipio1.getNome());
		this.municipios.get(i+1).setVisitado(municipio1.isVisitado());
	}
	public void mostrar() {
		for(int i=0; i< this.municipios.size(); i++) {
			System.out.println(this.municipios.get(i).getNome()+" "+this.municipios.get(i).getDistanciaPercurso());
		}
	}
	public Municipio getPrimeiro() {
		if(!this.municipios.isEmpty()) {
			return this.municipios.getFirst();
		}else {
			return null;
		}
		
	}
	
	public static void main(String[] argrs) {
		Mapa m = new Mapa();
		ListaOrdenada l = new ListaOrdenada();
		
		l.inserir(m.getCaetes());
		l.inserir(m.getCapoeiras());
		l.inserir(m.getGaranhuns());
		l.mostrar();		
	}

}
