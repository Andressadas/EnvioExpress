package andressadas.envionegocio.controladores;

import javax.ejb.Local;

import andressadas.envionegocio.entidades.Empleado;

/**
 * 
 * @author agonzalez
 *
 */
@Local
public interface EmpleadoControladorLocal {

	/**
	 * Constantes
	 */
	static final String LOGIN = "Empleado.login";
	static final String USERNAME = "username";
	static final String PASSWORD = "password";

	 /**
    * Metodo que permite realizar el login
    * @param Empleado
    * @return
    */
   Empleado login(Empleado empleado);
   
   /**
    * Metodo para registrar en la base de datos
    * @param objeto
    * @return 
    */
   String registrar(Object objeto);
	
}
