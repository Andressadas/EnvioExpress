package andressadas.envionegocio.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceException;

import andressadas.envionegocio.entidades.Ciudad;

public class CiudadControlador extends Controlador implements CiudadControladorLocal {

	/**
	 * Metodo que permite traer cultar la lista de la ciudad filtrando por el id del departamento
	 * departamento
	 * @param int
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Ciudad> consultarLista(int idDepartamento) {
		// Instanciamos la lista
		List<Ciudad> lista = new ArrayList<>();
		try {
			// Ejecuta la consulta
			lista = em.createNamedQuery(CONSULTAR_LISTA_FILTRA_DEPARTAMENTO).setParameter(idDepartamento, ID_DEPARTAMENTO).getResultList();
			// Limpiamos la unidad de persistence
			em.clear();
		} catch (PersistenceException ex) {
			//Escribe en el log de la aplicacion
			System.out.println("Error: " + ex.getMessage());
		}
		// Retorna la lista
		return lista;
	}

}
