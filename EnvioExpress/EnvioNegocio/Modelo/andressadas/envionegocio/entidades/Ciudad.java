package andressadas.envionegocio.entidades;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the ciudad database table.
 * 
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Ciudad.filtra.departamento", query = "SELECT c FROM Ciudad c WHERE c.departamento = :idDepartamento"),
    @NamedQuery(name = "Ciudad.all", query = "SELECT c FROM Ciudad c")})
public class Ciudad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idciudad;

	private String nombreciudad;

	//bi-directional many-to-one association to Departamento
	@ManyToOne
	@JoinColumn(name="iddepartamento")
	private Departamento departamento;

	//bi-directional many-to-one association to Empleado
	@OneToMany(mappedBy="ciudad")
	private List<Empleado> empleados;

	//bi-directional many-to-one association to Envio
	@OneToMany(mappedBy="ciudad1")
	private List<Envio> envios1;

	//bi-directional many-to-one association to Envio
	@OneToMany(mappedBy="ciudad2")
	private List<Envio> envios2;

	//bi-directional many-to-one association to Sucursal
	@OneToMany(mappedBy="ciudad")
	private List<Sucursal> sucursals;

	public Ciudad() {
	}

	public int getIdciudad() {
		return this.idciudad;
	}

	public void setIdciudad(int idciudad) {
		this.idciudad = idciudad;
	}

	public String getNombreciudad() {
		return this.nombreciudad;
	}

	public void setNombreciudad(String nombreciudad) {
		this.nombreciudad = nombreciudad;
	}

	public Departamento getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Empleado> getEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public Empleado addEmpleado(Empleado empleado) {
		getEmpleados().add(empleado);
		empleado.setCiudad(this);

		return empleado;
	}

	public Empleado removeEmpleado(Empleado empleado) {
		getEmpleados().remove(empleado);
		empleado.setCiudad(null);

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
		envios1.setCiudad1(this);

		return envios1;
	}

	public Envio removeEnvios1(Envio envios1) {
		getEnvios1().remove(envios1);
		envios1.setCiudad1(null);

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
		envios2.setCiudad2(this);

		return envios2;
	}

	public Envio removeEnvios2(Envio envios2) {
		getEnvios2().remove(envios2);
		envios2.setCiudad2(null);

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
		sucursal.setCiudad(this);

		return sucursal;
	}

	public Sucursal removeSucursal(Sucursal sucursal) {
		getSucursals().remove(sucursal);
		sucursal.setCiudad(null);

		return sucursal;
	}

}