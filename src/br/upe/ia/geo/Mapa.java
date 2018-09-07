package br.upe.ia.geo;

public class Mapa {

	private Municipio caetes;
	private Municipio capoeiras;
	private Municipio jucati;
	private Municipio saoBentoDoUna;
	private Municipio jupi;
	private Municipio calcado;
	private Municipio lajedo;
	private Municipio jurema;
	private Municipio canhotinho;
	private Municipio saoJoao;
	private Municipio paranatama;
	private Municipio garanhuns;
	private Municipio angelim;

	public Mapa() {
		
		//-------------criacao da distancia de cada cidade para angelim----------//
		this.caetes = new Municipio("Caetés", 44);
		this.capoeiras = new Municipio("Capoeiras", 50);
		this.jucati = new Municipio("Jucati", 50);
		this.saoBentoDoUna = new Municipio("São Bento do Una", 61);
		this.jupi = new Municipio("Jupi", 42);
		this.calcado = new Municipio("Calçado", 40);
		this.lajedo= new Municipio("Lajedo", 43);
		this.jurema = new Municipio("Jurema", 49);
		this.canhotinho = new Municipio("Canhotinho", 12);
		this.saoJoao = new Municipio("Sao João", 10);
		this.paranatama = new Municipio("Paranatama", 45);
		this.garanhuns = new Municipio("Garanhuns", 25);
		this.angelim = new Municipio("Angelim", 0);
		
		//-------------criacao das arestas----------------//
		
		this.caetes.addAjacente(new Adjacente(capoeiras));
		this.caetes.addAjacente(new Adjacente(garanhuns));
		this.caetes.addAjacente(new Adjacente(paranatama));
		
		this.capoeiras.addAjacente(new Adjacente(caetes));
		this.capoeiras.addAjacente(new Adjacente(garanhuns));
		this.capoeiras.addAjacente(new Adjacente(jucati));
		this.capoeiras.addAjacente(new Adjacente(saoBentoDoUna));
		
		this.paranatama.addAjacente(new Adjacente(caetes));
		this.paranatama.addAjacente(new Adjacente(garanhuns));
		
		this.saoJoao.addAjacente(new Adjacente(angelim));
		this.saoJoao.addAjacente(new Adjacente(garanhuns));
		this.saoJoao.addAjacente(new Adjacente(jupi));
		
		this.canhotinho.addAjacente(new Adjacente(angelim));
		this.canhotinho.addAjacente(new Adjacente(calcado));
		this.canhotinho.addAjacente(new Adjacente(jurema));
		
		this.jurema.addAjacente(new Adjacente(canhotinho));
		this.jurema.addAjacente(new Adjacente(lajedo));
		
		this.calcado.addAjacente(new Adjacente(angelim));
		this.calcado.addAjacente(new Adjacente(canhotinho));
		this.calcado.addAjacente(new Adjacente(jupi));
		this.calcado.addAjacente(new Adjacente(lajedo));
		this.calcado.addAjacente(new Adjacente(saoBentoDoUna));
		
		this.lajedo.addAjacente(new Adjacente(calcado));
		this.lajedo.addAjacente(new Adjacente(jurema));
		this.lajedo.addAjacente(new Adjacente(saoBentoDoUna));
		
		this.saoBentoDoUna.addAjacente(new Adjacente(calcado));
		this.saoBentoDoUna.addAjacente(new Adjacente(capoeiras));
		this.saoBentoDoUna.addAjacente(new Adjacente(jupi));
		this.saoBentoDoUna.addAjacente(new Adjacente(jucati));
		this.saoBentoDoUna.addAjacente(new Adjacente(lajedo));
		
		this.jupi.addAjacente(new Adjacente(calcado));
		this.jupi.addAjacente(new Adjacente(garanhuns));
		this.jupi.addAjacente(new Adjacente(jucati));
		this.jupi.addAjacente(new Adjacente(saoBentoDoUna));
		this.jupi.addAjacente(new Adjacente(saoJoao));
		
		this.jucati.addAjacente(new Adjacente(capoeiras));
		this.jucati.addAjacente(new Adjacente(garanhuns));
		this.jucati.addAjacente(new Adjacente(jupi));
		this.jucati.addAjacente(new Adjacente(saoBentoDoUna));
		
		this.garanhuns.addAjacente(new Adjacente(caetes));
		this.garanhuns.addAjacente(new Adjacente(capoeiras));
		this.garanhuns.addAjacente(new Adjacente(jucati));
		this.garanhuns.addAjacente(new Adjacente(jupi));
		this.garanhuns.addAjacente(new Adjacente(paranatama));
		this.garanhuns.addAjacente(new Adjacente(saoJoao));
		
		this.angelim.addAjacente(new Adjacente(calcado));
		this.angelim.addAjacente(new Adjacente(canhotinho));
		this.angelim.addAjacente(new Adjacente(saoJoao));
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

	public Municipio getCalcado() {
		return calcado;
	}

	public void setCalcado(Municipio calcado) {
		this.calcado = calcado;
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
