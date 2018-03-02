package andressadas.envionegocio.controladores;

import javax.ejb.Stateless;
import javax.persistence.PersistenceException;

import andressadas.envionegocio.entidades.Empleado;

/**
 * Clase que controla los empleados
 * @author agonzalez
 *
 */
@Stateless
public class EmpleadoControlador extends Controlador implements EmpleadoControladorLocal {

	
	 /**
     * Metodo que permite realizar el login
     * @param Empleado
     * @return
     */
	@Override
    public Empleado login(Empleado empleado) {
        try {
        	//Consulta los datos y lo asignamos por refecia al objeto usuario
        	empleado = (Empleado) em.createNamedQuery(LOGIN).setParameter(USERNAME, empleado.getUsername()).setParameter(PASSWORD, empleado.getPassword()).getSingleResult();
            //Limpiamos la unidad de persistence
        	em.clear();
        } catch (PersistenceException exception) {
            //Imprime el error en el Log
            System.out.println("-- UsuarioController - login - Error: " + exception.getMessage());
        }
        //Retornamos List<Departamento>
        return empleado;
    }
	
	 /**
     * Metodo para registrar en la base de datos
     * @param objeto
     * @return 
     */
    @Override
    public String registrar(Object objeto) {
        //Ejecuta el metodo que permite realizar registros
        return registrarEntidad(objeto);
    }
	
}
