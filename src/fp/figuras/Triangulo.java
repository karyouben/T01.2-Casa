package fp.figuras;

public interface Triangulo extends Figura{

	/**
	 * @param nuevaAltura Nueva altura del tri�ngulo
	 * @param nuevaAnchura Nueva anchura del tri�ngulo
	 * Cambia el tama�o del tri�ngulo al nuevo tama�o (en pixeles). El tama�o debe ser >=0.
	 */
	void cambiarTamanyo(Integer nuevaAltura, Integer nuevaAnchura);
}