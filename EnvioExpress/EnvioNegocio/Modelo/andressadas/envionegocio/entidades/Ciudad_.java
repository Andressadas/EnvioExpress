package andressadas.envionegocio.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-02-27T09:46:07.268-0500")
@StaticMetamodel(Ciudad.class)
public class Ciudad_ {
	public static volatile SingularAttribute<Ciudad, Integer> idciudad;
	public static volatile SingularAttribute<Ciudad, String> nombreciudad;
	public static volatile SingularAttribute<Ciudad, Departamento> departamento;
	public static volatile ListAttribute<Ciudad, Empleado> empleados;
	public static volatile ListAttribute<Ciudad, Envio> envios1;
	public static volatile ListAttribute<Ciudad, Envio> envios2;
	public static volatile ListAttribute<Ciudad, Sucursal> sucursals;
}
