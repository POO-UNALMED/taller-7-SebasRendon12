package comunicacion;

import java.util.ArrayList;
import java.util.List;

public class Alfabeto extends Pictograma {
	private static String[] letras;
	private String interpretacion;

	public Alfabeto(String origen, String[] strings, String interpretacion) {
		super(origen);
		letras = strings;
		this.interpretacion = interpretacion;
	}

	@Override
	public String interpretacion() {
		return interpretacion;
	}

	@Override
	public String toString() {
		String cad = "";
		for (int i = 0; i < letras.length; i++) {
			cad += letras[i];
			if (i < letras.length - 1) {
				cad += ", ";
			}
		}
		return cad;
	}

	public int cantidadLetras() {
		return letras.length;
	}

	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		Alfabeto.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

}
