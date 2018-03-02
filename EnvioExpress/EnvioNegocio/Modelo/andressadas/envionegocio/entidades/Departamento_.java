package andressadas.envionegocio.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-02-27T09:46:07.372-0500")
@StaticMetamodel(Departamento.class)
public class Departamento_ {
	public static volatile SingularAttribute<Departamento, Integer> iddepartamento;
	public static volatile SingularAttribute<Departamento, String> nombredepartamento;
	public static volatile ListAttribute<Departamento, Ciudad> ciudads;
	public static volatile ListAttribute<Departamento, Empleado> empleados;
	public static volatile ListAttribute<Departamento, Envio> envios1;
	public static volatile ListAttribute<Departamento, Envio> envios2;
	public static volatile ListAttribute<Departamento, Sucursal> sucursals;
}
