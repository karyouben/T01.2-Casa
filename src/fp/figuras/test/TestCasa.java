package fp.figuras.test;

import fp.figuras.Casa;
import fp.figuras.CasaImpl;
import fp.figuras.Circulo;
import fp.figuras.CirculoImpl;

public class TestCasa {

	public static void main(String[] args) {
		Casa c = new CasaImpl();
		c.dibujar();
		
		c.setBlancoYNegro();
		
	}

}
