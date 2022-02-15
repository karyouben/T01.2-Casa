package fp.figuras;

public interface Monigote extends Figura{

	/**
	 * @param nuevaAltura Nueva altura del monigote
	 * @param nuevaAnchura Nueva anchura del monigote
	 * Cambia el tama�o al nuevo tama�o (en pixels). El tama�o debe ser >=0.
	 */
	void cambiarTamanyo(Integer nuevaAltura, Integer nuevaAnchura);

}