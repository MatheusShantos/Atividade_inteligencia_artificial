package br.upe.ia.geo;

public class Mapa {
	
	private Municipio caetes, capoeiras, jucati, saoBentoDoUna, jupi, calcados, lajedo, jurema, 
	canhotinho, saoJoao, paranatama, garanhuns, angelim;
	
	public Mapa() {			
		
		this.angelim = new Municipio("angelim", 0);
		this.caetes = new Municipio ("caetes", 0);
		this.calcados = new Municipio ("calcados", 0);
		this.canhotinho = new Municipio("canhotinho", 0);
		this.capoeiras = new Municipio ("capoeiras", 0);
		this.garanhuns = new Municipio("garanhuns", 0);
		this.jucati = new Municipio ("jucati", 0);
		this.jupi = new Municipio("jupi", 0);
		this.jurema = new Municipio("jurema", 0);
		this.lajedo = new Municipio ("lajedo", 0);
		this.paranatama = new Municipio("paranatama", 0);
		this.saoBentoDoUna = new Municipio("saoBentoDoUna", 0);
		this.saoJoao = new Municipio("saoJoao", 0);
		
		//--------------------------Arestas--------------------------------------//
		
		this.caetes.addAjacente(new Adjacente(capoeiras));
		this.caetes.addAjacente(new Adjacente(garanhuns));
		this.caetes.addAjacente(new Adjacente(paranatama));
		
		this.capoeiras.addAjacente(new Adjacente(caetes));
		this.capoeiras.addAjacente(new Adjacente(garanhuns));
		this.capoeiras.addAjacente(new Adjacente(jucati));
		this.capoeiras.addAjacente(new Adjacente(saoBentoDoUna));
		
		this.jucati.addAjacente(new Adjacente(capoeiras));
		this.jucati.addAjacente(new Adjacente(garanhuns));
		this.jucati.addAjacente(new Adjacente(jupi));
		this.jucati.addAjacente(new Adjacente(saoBentoDoUna));
		
		
		this.saoBentoDoUna.addAjacente(new Adjacente(calcados));
		this.saoBentoDoUna.addAjacente(new Adjacente(capoeiras));
		this.saoBentoDoUna.addAjacente(new Adjacente(jucati));
		this.saoBentoDoUna.addAjacente(new Adjacente(jupi));		
		this.saoBentoDoUna.addAjacente(new Adjacente(lajedo));
		
		
		this.jupi.addAjacente(new Adjacente(saoJoao));
		this.jupi.addAjacente(new Adjacente(garanhuns));
		this.jupi.addAjacente(new Adjacente(jucati));
		this.jupi.addAjacente(new Adjacente(saoBentoDoUna));
		this.jupi.addAjacente(new Adjacente(calcados));
		

		this.calcados.addAjacente(new Adjacente(angelim));
		this.calcados.addAjacente(new Adjacente(canhotinho));		
		this.calcados.addAjacente(new Adjacente(jupi));
		this.calcados.addAjacente(new Adjacente(lajedo));
		this.calcados.addAjacente(new Adjacente(saoBentoDoUna));
		

		this.lajedo.addAjacente(new Adjacente(calcados));
		this.lajedo.addAjacente(new Adjacente(jurema));		
		this.lajedo.addAjacente(new Adjacente(saoBentoDoUna));	
		
		
		this.jurema.addAjacente(new Adjacente(canhotinho));
		this.jurema.addAjacente(new Adjacente(lajedo));
		
		
		this.canhotinho.addAjacente(new Adjacente(angelim));
		this.canhotinho.addAjacente(new Adjacente(calcados));
		this.canhotinho.addAjacente(new Adjacente(jurema));
		
		
		this.saoJoao.addAjacente(new Adjacente(garanhuns));
		this.saoJoao.addAjacente(new Adjacente(jupi));
		this.saoJoao.addAjacente(new Adjacente(angelim));
		
		this.paranatama.addAjacente(new Adjacente(caetes));
		this.paranatama.addAjacente(new Adjacente(garanhuns));		
		
		
		this.garanhuns.addAjacente(new Adjacente(caetes));
		this.garanhuns.addAjacente(new Adjacente(paranatama));		
		this.garanhuns.addAjacente(new Adjacente(capoeiras));
		this.garanhuns.addAjacente(new Adjacente(jucati));
		this.garanhuns.addAjacente(new Adjacente(jupi));
		this.garanhuns.addAjacente(new Adjacente(saoJoao));		
	
		
		this.angelim.addAjacente(new Adjacente(saoJoao));
		this.angelim.addAjacente(new Adjacente(calcados));
		this.angelim.addAjacente(new Adjacente(canhotinho));
		
	}


	public Municipio getCaetes() {
		return caetes;
	}


	public void setCaetes(Municipio caetes) {
		this.caetes = caetes;
	}


	public Municipio getCapoeiras() {
		return capoeiras;
	}


	public void setCapoeiras(Municipio capoeiras) {
		this.capoeiras = capoeiras;
	}


	public Municipio getJucati() {
		return jucati;
	}


	public void setJucati(Municipio jucati) {
		this.jucati = jucati;
	}


	public Municipio getSaoBentoDoUna() {
		return saoBentoDoUna;
	}


	public void setSaoBentoDoUna(Municipio saoBentoDoUna) {
		this.saoBentoDoUna = saoBentoDoUna;
	}


	public Municipio getJupi() {
		return jupi;
	}


	public void setJupi(Municipio jupi) {
		this.jupi = jupi;
	}


	public Municipio getCalcados() {
		return calcados;
	}


	public void setCalcados(Municipio calcados) {
		this.calcados = calcados;
	}


	public Municipio getLajedo() {
		return lajedo;
	}


	public void setLajedo(Municipio lajedo) {
		this.lajedo = lajedo;
	}


	public Municipio getJurema() {
		return jurema;
	}


	public void setJurema(Municipio jurema) {
		this.jurema = jurema;
	}


	public Municipio getCanhotinho() {
		return canhotinho;
	}


	public void setCanhotinho(Municipio canhotinho) {
		this.canhotinho = canhotinho;
	}


	public Municipio getSaoJoao() {
		return saoJoao;
	}


	public void setSaoJoao(Municipio saoJoao) {
		this.saoJoao = saoJoao;
	}


	public Municipio getParanatama() {
		return paranatama;
	}


	public void setParanatama(Municipio paranatama) {
		this.paranatama = paranatama;
	}


	public Municipio getGaranhuns() {
		return garanhuns;
	}


	public void setGaranhuns(Municipio garanhuns) {
		this.garanhuns = garanhuns;
	}


	public Municipio getAngelim() {
		return angelim;
	}


	public void setAngelim(Municipio angelim) {
		this.angelim = angelim;
	}	
	
	
	
}
