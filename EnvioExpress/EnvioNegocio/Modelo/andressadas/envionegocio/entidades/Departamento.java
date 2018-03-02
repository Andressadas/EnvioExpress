package andressadas.envionegocio.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the departamento database table.
 * 
 */
@Entity
@NamedQuery(name="Departamento.findAll", query="SELECT d FROM Departamento d")
public class Departamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int iddepartamento;

	private String nombredepartamento;

	//bi-directional many-to-one association to Ciudad
	@OneToMany(mappedBy="departamento")
	private List<Ciudad> ciudads;

	//bi-directional many-to-one association to Empleado
	@OneToMany(mappedBy="departamento")
	private List<Empleado> empleados;

	//bi-directional many-to-one association to Envio
	@OneToMany(mappedBy="departamento1")
	private List<Envio> envios1;

	//bi-directional many-to-one association to Envio
	@OneToMany(mappedBy="departamento2")
	private List<Envio> envios2;

	//bi-directional many-to-one association to Sucursal
	@OneToMany(mappedBy="departamento")
	private List<Sucursal> sucursals;

	public Departamento() {
	}

	public int getIddepartamento() {
		return this.iddepartamento;
	}

	public void setIddepartamento(int iddepartamento) {
		this.iddepartamento = iddepartamento;
	}

	public String getNombredepartamento() {
		return this.nombredepartamento;
	}

	public void setNombredepartamento(String nombredepartamento) {
		this.nombredepartamento = nombredepartamento;
	}

	public List<Ciudad> getCiudads() {
		return this.ciudads;
	}

	public void setCiudads(List<Ciudad> ciudads) {
		this.ciudads = ciudads;
	}

	public Ciudad addCiudad(Ciudad ciudad) {
		getCiudads().add(ciudad);
		ciudad.setDepartamento(this);

		return ciudad;
	}

	public Ciudad removeCiudad(Ciudad ciudad) {
		getCiudads().remove(ciudad);
		ciudad.setDepartamento(null);

		return ciudad;
	}

	public List<Empleado> getEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public Empleado addEmpleado(Empleado empleado) {
		getEmpleados().add(empleado);
		empleado.setDepartamento(this);

		return empleado;
	}

	public Empleado removeEmpleado(Empleado empleado) {
		getEmpleados().remove(empleado);
		empleado.setDepartamento(null);

		return empleado;
	}

	public List<Envio> getEnvios1() {
		return this.envios1;
	}

	public void setEnvios1(List<Envio> envios1) {
		this.envios1 = envios1;
	}

	public Envio addEnvios1(Envio envios1) {
		getEnvios1().add(envios1);
		envios1.setDepartamento1(this);

		return envios1;
	}

	public Envio removeEnvios1(Envio envios1) {
		getEnvios1().remove(envios1);
		envios1.setDepartamento1(null);

		return envios1;
	}

	public List<Envio> getEnvios2() {
		return this.envios2;
	}

	public void setEnvios2(List<Envio> envios2) {
		this.envios2 = envios2;
	}

	public Envio addEnvios2(Envio envios2) {
		getEnvios2().add(envios2);
		envios2.setDepartamento2(this);

		return envios2;
	}

	public Envio removeEnvios2(Envio envios2) {
		getEnvios2().remove(envios2);
		envios2.setDepartamento2(null);

		return envios2;
	}

	public List<Sucursal> getSucursals() {
		return this.sucursals;
	}

	public void setSucursals(List<Sucursal> sucursals) {
		this.sucursals = sucursals;
	}

	public Sucursal addSucursal(Sucursal sucursal) {
		getSucursals().add(sucursal);
		sucursal.setDepartamento(this);

		return sucursal;
	}

	public Sucursal removeSucursal(Sucursal sucursal) {
		getSucursals().remove(sucursal);
		sucursal.setDepartamento(null);

		return sucursal;
	}

}