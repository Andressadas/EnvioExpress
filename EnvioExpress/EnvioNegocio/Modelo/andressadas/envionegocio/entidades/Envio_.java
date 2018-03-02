package andressadas.envionegocio.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-02-27T09:46:07.378-0500")
@StaticMetamodel(Envio.class)
public class Envio_ {
	public static volatile SingularAttribute<Envio, Integer> idenvio;
	public static volatile SingularAttribute<Envio, Integer> costoenvio;
	public static volatile SingularAttribute<Envio, String> descripcionenvio;
	public static volatile SingularAttribute<Envio, String> direcciondestino;
	public static volatile SingularAttribute<Envio, Date> fechaentrega;
	public static volatile SingularAttribute<Envio, Date> fechaingreso;
	public static volatile SingularAttribute<Envio, String> modoenvio;
	public static volatile SingularAttribute<Envio, Integer> peso;
	public static volatile SingularAttribute<Envio, Integer> piezas;
	public static volatile SingularAttribute<Envio, Integer> valordeclarado;
	public static volatile SingularAttribute<Envio, Ciudad> ciudad1;
	public static volatile SingularAttribute<Envio, Ciudad> ciudad2;
	public static volatile SingularAttribute<Envio, Departamento> departamento1;
	public static volatile SingularAttribute<Envio, Empleado> empleado;
	public static volatile SingularAttribute<Envio, Sucursal> sucursal;
	public static volatile SingularAttribute<Envio, Cliente> cliente1;
	public static volatile SingularAttribute<Envio, Cliente> cliente2;
	public static volatile SingularAttribute<Envio, Departamento> departamento2;
}
