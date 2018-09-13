package br.upe.ia.geo;

public class Mapa {

	private Municipio caetes, capoeiras, jucati, saoBentoDoUna, jupi, calcados, lajedo, jurema, 
	canhotinho, saoJoao, paranatama, garanhuns, angelim;
	
	public Mapa(int n) {
		
		Froneteira lista = new Froneteira();
		lista.SetDistancias();
		
		this.angelim = new Municipio("angelim", lista.SetDistancias()[n][0]);
		this.caetes = new Municipio ("caetes", lista.SetDistancias()[n][1]);
		this.calcados = new Municipio ("calcados", lista.SetDistancias()[n][2]);
		this.canhotinho = new Municipio("canhotinho", lista.SetDistancias()[n][3]);
		this.capoeiras = new Municipio ("capoeiras", lista.SetDistancias()[n][4]);
		this.garanhuns = new Municipio("garanhuns", lista.SetDistancias()[n][5]);
		this.jucati = new Municipio ("jucati", lista.SetDistancias()[n][6]);
		this.jupi = new Municipio("jupi", lista.SetDistancias()[n][7]);
		this.jurema = new Municipio("jurema", lista.SetDistancias()[n][8]);
		this.lajedo = new Municipio ("lajedo", lista.SetDistancias()[n][9]);
		this.paranatama = new Municipio("paranatama", lista.SetDistancias()[n][10]);
		this.saoBentoDoUna = new Municipio("saoBentoDoUna", lista.SetDistancias()[n][11]);
		this.saoJoao = new Municipio("saoJoao", lista.SetDistancias()[n][12]);
		
		//----------------------------------------------------------------
		
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
	
	public Municipio apontaCidade(int n) {
		switch (n) {
		case 0:
			return angelim; 
		case 1:
			return caetes;
		case 2 :
			return calcados;
		case 3:
			return canhotinho;
		case 4:
			return capoeiras;
		case 5:
			return garanhuns;
		case 6:
			return jucati;
		case 7:
			return jupi;
		case 8:
			return jurema;
		case 9:
			return lajedo;
		case 10:
			return paranatama;
		case 11:
			return saoBentoDoUna;
		case 12:
			return saoJoao;
		
		default:
			break;
		}
		return null;
	}

}