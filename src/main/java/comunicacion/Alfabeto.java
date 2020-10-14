package comunicacion;

import java.util.ArrayList;
import java.util.List;

public class Alfabeto extends Pictograma {
	private static List<String> letras = new ArrayList<>();;
	private String interpretacion;

	public Alfabeto(String origen, String[] strings, String interpretacion) {
		super(origen);
		for (String string : strings) {
			Alfabeto.letras.add(string);
		}
		this.interpretacion = interpretacion;
	}

	@Override
	public String interpretacion() {
		return interpretacion;
	}

	@Override
	public String toString() {
		String cad = "";
		for (int i = 1; i <= letras.size(); i++) {
			cad += letras.get(i);
			if (i < letras.size()) {
				cad += ", ";
			}
		}
		return cad;
	}

	public int cantidadLetras() {
		return letras.size();
	}

	public List<String> getLetras() {
		return letras;
	}

	public void setLetras(List<String> letras) {
		Alfabeto.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

}
