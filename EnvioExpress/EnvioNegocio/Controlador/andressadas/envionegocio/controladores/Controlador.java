package andressadas.envionegocio.controladores;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

public class Controlador {

	// Constante con el nombre de la conexion
	private final static String CONEXION = "EnvioNegocio";

	// Constantes de mensajes de registro en base de datos
	protected final static String _RegistroExito = "Registro Exitoso";
	protected final static String _RegistroFail = "No se Realizo el Registro";

	/**
	 * Unidad de persistencia
	 */
	@PersistenceContext(unitName = CONEXION)
	protected EntityManager em;

	/**
	 * Metodo que permite realizar los registros
	 * 
	 * @param objeto
	 * @return
	 */
	protected String registrarEntidad(Object objeto) {
		// Variable que va a contener el mensaje de respuesta
		String retorno = _RegistroExito;
		try {
			// Setea los datos a la base de datos
			em.getTransaction().begin();
			em.persist(objeto);
			em.getTransaction().commit();
			// Limpiamos la unidad de persistence
			em.clear();
		} catch (PersistenceException ex) {
			// Imprime el error en el Log
			System.out.println("-- Controller - Registrar - Error: " + ex.getMessage());
			// Asignamos el mensaje de error
			retorno = _RegistroFail;
		}
		// Retornamos el mensaje del registro
		return retorno;
	}

	/**
	 * Metodo que permite consultar la lista sin filtrar
	 * 
	 * @param lista
	 * @param nameQuery
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected List<Object> consultarLista(String nameQuery) {
		try {
			// Consulta la lista en la base de datos
			List<Object> lista = em.createNamedQuery(nameQuery).getResultList();
			// Limpia la unidad de persistencia
			em.clear();
			// Retorna la lista con los datos
			return lista;
		} catch (PersistenceException ex) {
			// Imprime el error en el Log
			System.out.println("-- Controller - Registrar - Error: " + ex.getMessage());
			//retorna null
			return null;
		}
	}

	
}
