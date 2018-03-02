package andressadas.enviovista.managedbean;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

import andressadas.envionegocio.controladores.EmpleadoControladorLocal;
import andressadas.envionegocio.entidades.Empleado;


/**
 * Session Bean implementation class UsuarioManagedBean
 */
@ManagedBean(name = "EmpleadoManagedBean")
@RequestScoped
public class EmpleadoManagedBean {

	//Objeto Empleado
	private Empleado empleado;
	//Parametro para qsignarle mensajes
	private String mensajes;
	
	@EJB
	private EmpleadoControladorLocal empleadoControlador;
	
	/**
	 * Constructor sin atributos
	 */
	public EmpleadoManagedBean() {
		
		//Inicia el objeto empleado
		empleado = new Empleado();
	}
	
	
	/**
	 * Metodo que permite realizar el login de la aplicacion
	 * @return
	 */
	public String login() {
		// Realizamos la consulta de loggin
		empleado = empleadoControlador.login(empleado);
		// para validar si el empleado esta en la base de datos
		if (empleado.getNombreempleado() != null) {
			// Ejecutamos el metodo que guarda los datos de la seccion
			//guardarSeccion(usuario);
			// Para redireccionar a la ventana inicio
			return "inicio";
		} else {
			// Mostramos el mensaje de error
			//addMessageError(null, GeneralUtilities.getProperty(GeneralUtilities.MENSAJE_LOGIN_ERROR), GeneralUtilities.getProperty(GeneralUtilities.MENSAJE_LOGIN_ERROR));
			// Retornamos null
			return null;
		}
	}


	/**
	 * Metodo para extraccion del objeto empleado
	 * @return
	 */
	public Empleado getEmpleado() {
		return empleado;
	}


	/**
	 * Metodo para encapsular los datos al objeto empleado
	 * @param empleado
	 */
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	
	
}
