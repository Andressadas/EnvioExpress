package andressadas.envionegocio.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cliente database table.
 * 
 */
@Entity
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idcliente;

	private String emailcliente;

	private String nombrecliente;

	private String numeroidentificacion;

	private String telefonocliente;

	private String tipocliente;

	private String tipoidentificacion;

	//bi-directional many-to-one association to Envio
	@OneToMany(mappedBy="cliente1")
	private List<Envio> envios1;

	//bi-directional many-to-one association to Envio
	@OneToMany(mappedBy="cliente2")
	private List<Envio> envios2;

	public Cliente() {
	}

	public int getIdcliente() {
		return this.idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getEmailcliente() {
		return this.emailcliente;
	}

	public void setEmailcliente(String emailcliente) {
		this.emailcliente = emailcliente;
	}

	public String getNombrecliente() {
		return this.nombrecliente;
	}

	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}

	public String getNumeroidentificacion() {
		return this.numeroidentificacion;
	}

	public void setNumeroidentificacion(String numeroidentificacion) {
		this.numeroidentificacion = numeroidentificacion;
	}

	public String getTelefonocliente() {
		return this.telefonocliente;
	}

	public void setTelefonocliente(String telefonocliente) {
		this.telefonocliente = telefonocliente;
	}

	public String getTipocliente() {
		return this.tipocliente;
	}

	public void setTipocliente(String tipocliente) {
		this.tipocliente = tipocliente;
	}

	public String getTipoidentificacion() {
		return this.tipoidentificacion;
	}

	public void setTipoidentificacion(String tipoidentificacion) {
		this.tipoidentificacion = tipoidentificacion;
	}

	public List<Envio> getEnvios1() {
		return this.envios1;
	}

	public void setEnvios1(List<Envio> envios1) {
		this.envios1 = envios1;
	}

	public Envio addEnvios1(Envio envios1) {
		getEnvios1().add(envios1);
		envios1.setCliente1(this);

		return envios1;
	}

	public Envio removeEnvios1(Envio envios1) {
		getEnvios1().remove(envios1);
		envios1.setCliente1(null);

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
		envios2.setCliente2(this);

		return envios2;
	}

	public Envio removeEnvios2(Envio envios2) {
		getEnvios2().remove(envios2);
		envios2.setCliente2(null);

		return envios2;
	}

}