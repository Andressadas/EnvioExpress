package andressadas.envionegocio.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-02-27T09:46:07.382-0500")
@StaticMetamodel(Sucursal.class)
public class Sucursal_ {
	public static volatile SingularAttribute<Sucursal, Integer> idsucursal;
	public static volatile SingularAttribute<Sucursal, String> direccionsucursal;
	public static volatile SingularAttribute<Sucursal, String> nombresucursal;
	public static volatile ListAttribute<Sucursal, Envio> envios;
	public static volatile SingularAttribute<Sucursal, Ciudad> ciudad;
	public static volatile SingularAttribute<Sucursal, Departamento> departamento;
}
