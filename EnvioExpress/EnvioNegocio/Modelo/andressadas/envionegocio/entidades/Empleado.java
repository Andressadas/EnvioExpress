package andressadas.envionegocio.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the empleado database table.
 * 
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Empleado.login", query = "SELECT e FROM Empleado e WHERE e.username = :username AND e.password = :password"),
    @NamedQuery(name = "Empleado.all", query = "SELECT e FROM Empleado e")})
public class Empleado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idempleado;

	private String direccionempleado;

	private String emailempleado;

	private String estadoempleado;

	private String nombreempleado;

	private String perfil;

	private String telefonoempleado;
	
	private String username;
	
	private String password;

	//bi-directional many-to-one association to Ciudad
	@ManyToOne
	@JoinColumn(name="idciudad")
	private Ciudad ciudad;

	//bi-directional many-to-one association to Departamento
	@ManyToOne
	@JoinColumn(name="iddepartamento")
	private Departamento departamento;

	//bi-directional many-to-one association to Envio
	@OneToMany(mappedBy="empleado")
	private List<Envio> envios;

	public Empleado() {
	}

	public int getIdempleado() {
		return this.idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}

	public String getDireccionempleado() {
		return this.direccionempleado;
	}

	public void setDireccionempleado(String direccionempleado) {
		this.direccionempleado = direccionempleado;
	}

	public String getEmailempleado() {
		return this.emailempleado;
	}

	public void setEmailempleado(String emailempleado) {
		this.emailempleado = emailempleado;
	}

	public String getEstadoempleado() {
		return this.estadoempleado;
	}

	public void setEstadoempleado(String estadoempleado) {
		this.estadoempleado = estadoempleado;
	}

	public String getNombreempleado() {
		return this.nombreempleado;
	}

	public void setNombreempleado(String nombreempleado) {
		this.nombreempleado = nombreempleado;
	}

	public String getPerfil() {
		return this.perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getTelefonoempleado() {
		return this.telefonoempleado;
	}

	public void setTelefonoempleado(String telefonoempleado) {
		this.telefonoempleado = telefonoempleado;
	}
	
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public Ciudad getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public Departamento getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Envio> getEnvios() {
		return this.envios;
	}

	public void setEnvios(List<Envio> envios) {
		this.envios = envios;
	}

	public Envio addEnvio(Envio envio) {
		getEnvios().add(envio);
		envio.setEmpleado(this);

		return envio;
	}

	public Envio removeEnvio(Envio envio) {
		getEnvios().remove(envio);
		envio.setEmpleado(null);

		return envio;
	}

}