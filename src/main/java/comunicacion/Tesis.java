package comunicacion;

import java.util.ArrayList;
import java.util.List;

public class Tesis extends Escrito {
	private String idea;
	private static List<String> argumentos = new ArrayList<>();
	private String conclusion;
	private String referencias;
	private String interpretacion;

	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] strings,
			String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		for (String string : strings) {
			Tesis.argumentos.add(string);
		}
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}

	@Override
	public int palabrasTotales(int palabrasPagina) {
		return getPaginas() * 5;
	}

	@Override
	public String interpretacion() {
		return interpretacion;
	}

	@Override
	public String toString() {
		String cad = "";
		cad += super.getOrigen() + "\n";
		cad += super.getTitulo() + "\n";
		cad += super.getAutor() + "\n";
		cad += super.getPaginas() + "\n";
		cad += idea + "\n";
		cad += argumentos.size() + "\n";
		cad += conclusion + "\n";
		cad += referencias;
		return cad;
	}

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	public String[] getArgumentos() {
		String[] lst = null;
		for (int i = 0; i < argumentos.size(); i++) {
			lst[i] = argumentos.get(i);
		}
		return lst;
	}

	public void setArgumentos(List<String> argumentos) {
		Tesis.argumentos = argumentos;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getReferencias() {
		return referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

}
