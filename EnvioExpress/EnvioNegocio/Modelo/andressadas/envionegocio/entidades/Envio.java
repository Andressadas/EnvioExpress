package andressadas.envionegocio.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the envio database table.
 * 
 */
@Entity
@NamedQuery(name="Envio.findAll", query="SELECT e FROM Envio e")
public class Envio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idenvio;

	private int costoenvio;

	private String descripcionenvio;

	private String direcciondestino;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaentrega;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaingreso;

	private String modoenvio;

	private int peso;

	private int piezas;

	private int valordeclarado;

	//bi-directional many-to-one association to Ciudad
	@ManyToOne
	@JoinColumn(name="idciudaddestino")
	private Ciudad ciudad1;

	//bi-directional many-to-one association to Ciudad
	@ManyToOne
	@JoinColumn(name="idciudadorigen")
	private Ciudad ciudad2;

	//bi-directional many-to-one association to Departamento
	@ManyToOne
	@JoinColumn(name="iddepartamentoorigen")
	private Departamento departamento1;

	//bi-directional many-to-one association to Empleado
	@ManyToOne
	@JoinColumn(name="idempleado")
	private Empleado empleado;

	//bi-directional many-to-one association to Sucursal
	@ManyToOne
	@JoinColumn(name="idsucursal")
	private Sucursal sucursal;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="idclienteremite")
	private Cliente cliente1;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="idclientedestinatario")
	private Cliente cliente2;

	//bi-directional many-to-one association to Departamento
	@ManyToOne
	@JoinColumn(name="iddepartamentodestino")
	private Departamento departamento2;

	public Envio() {
	}

	public int getIdenvio() {
		return this.idenvio;
	}

	public void setIdenvio(int idenvio) {
		this.idenvio = idenvio;
	}

	public int getCostoenvio() {
		return this.costoenvio;
	}

	public void setCostoenvio(int costoenvio) {
		this.costoenvio = costoenvio;
	}

	public String getDescripcionenvio() {
		return this.descripcionenvio;
	}

	public void setDescripcionenvio(String descripcionenvio) {
		this.descripcionenvio = descripcionenvio;
	}

	public String getDirecciondestino() {
		return this.direcciondestino;
	}

	public void setDirecciondestino(String direcciondestino) {
		this.direcciondestino = direcciondestino;
	}

	public Date getFechaentrega() {
		return this.fechaentrega;
	}

	public void setFechaentrega(Date fechaentrega) {
		this.fechaentrega = fechaentrega;
	}

	public Date getFechaingreso() {
		return this.fechaingreso;
	}

	public void setFechaingreso(Date fechaingreso) {
		this.fechaingreso = fechaingreso;
	}

	public String getModoenvio() {
		return this.modoenvio;
	}

	public void setModoenvio(String modoenvio) {
		this.modoenvio = modoenvio;
	}

	public int getPeso() {
		return this.peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getPiezas() {
		return this.piezas;
	}

	public void setPiezas(int piezas) {
		this.piezas = piezas;
	}

	public int getValordeclarado() {
		return this.valordeclarado;
	}

	public void setValordeclarado(int valordeclarado) {
		this.valordeclarado = valordeclarado;
	}

	public Ciudad getCiudad1() {
		return this.ciudad1;
	}

	public void setCiudad1(Ciudad ciudad1) {
		this.ciudad1 = ciudad1;
	}

	public Ciudad getCiudad2() {
		return this.ciudad2;
	}

	public void setCiudad2(Ciudad ciudad2) {
		this.ciudad2 = ciudad2;
	}

	public Departamento getDepartamento1() {
		return this.departamento1;
	}

	public void setDepartamento1(Departamento departamento1) {
		this.departamento1 = departamento1;
	}

	public Empleado getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Sucursal getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public Cliente getCliente1() {
		return this.cliente1;
	}

	public void setCliente1(Cliente cliente1) {
		this.cliente1 = cliente1;
	}

	public Cliente getCliente2() {
		return this.cliente2;
	}

	public void setCliente2(Cliente cliente2) {
		this.cliente2 = cliente2;
	}

	public Departamento getDepartamento2() {
		return this.departamento2;
	}

	public void setDepartamento2(Departamento departamento2) {
		this.departamento2 = departamento2;
	}

}