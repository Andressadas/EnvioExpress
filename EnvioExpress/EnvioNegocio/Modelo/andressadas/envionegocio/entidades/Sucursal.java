package andressadas.envionegocio.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sucursal database table.
 * 
 */
@Entity
@NamedQuery(name="Sucursal.findAll", query="SELECT s FROM Sucursal s")
public class Sucursal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idsucursal;

	private String direccionsucursal;

	private String nombresucursal;

	//bi-directional many-to-one association to Envio
	@OneToMany(mappedBy="sucursal")
	private List<Envio> envios;

	//bi-directional many-to-one association to Ciudad
	@ManyToOne
	@JoinColumn(name="idciudad")
	private Ciudad ciudad;

	//bi-directional many-to-one association to Departamento
	@ManyToOne
	@JoinColumn(name="iddepartamento")
	private Departamento departamento;

	public Sucursal() {
	}

	public int getIdsucursal() {
		return this.idsucursal;
	}

	public void setIdsucursal(int idsucursal) {
		this.idsucursal = idsucursal;
	}

	public String getDireccionsucursal() {
		return this.direccionsucursal;
	}

	public void setDireccionsucursal(String direccionsucursal) {
		this.direccionsucursal = direccionsucursal;
	}

	public String getNombresucursal() {
		return this.nombresucursal;
	}

	public void setNombresucursal(String nombresucursal) {
		this.nombresucursal = nombresucursal;
	}

	public List<Envio> getEnvios() {
		return this.envios;
	}

	public void setEnvios(List<Envio> envios) {
		this.envios = envios;
	}

	public Envio addEnvio(Envio envio) {
		getEnvios().add(envio);
		envio.setSucursal(this);

		return envio;
	}

	public Envio removeEnvio(Envio envio) {
		getEnvios().remove(envio);
		envio.setSucursal(null);

		return envio;
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

}