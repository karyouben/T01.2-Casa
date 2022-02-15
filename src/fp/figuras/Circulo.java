package fp.figuras;

public interface Circulo extends Figura{

	/**
	 * @param nuevoDiametro Nuevo di�metro en pixeles.
	 * Cambia el tama�o del c�rculo por el nuevo tama�o(en pixeles). El nuevo di�metro debe ser >=0. 
	 */
	void cambiarTamanyo(Integer nuevoDiametro);

}