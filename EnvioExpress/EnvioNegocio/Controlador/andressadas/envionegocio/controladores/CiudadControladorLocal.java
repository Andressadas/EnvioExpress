package andressadas.envionegocio.controladores;

import java.util.List;

import andressadas.envionegocio.entidades.Ciudad;

/**
 * 
 * @author agonzalez
 *
 */
public interface CiudadControladorLocal {

	/**
	 * Constantes
	 */
	static final String CONSULTAR_LISTA_FILTRA_DEPARTAMENTO = "Ciudad.filtra.departamento";
	static final String ID_DEPARTAMENTO = "idDepartamento";

	/**
	 * Metodo que permite traer cultar la lista de la ciudad filtrando por el id del departamento
	 * departamento
	 * @param int
	 * @return
	 */
     List<Ciudad> consultarLista(int idDepartamento);
	
}
