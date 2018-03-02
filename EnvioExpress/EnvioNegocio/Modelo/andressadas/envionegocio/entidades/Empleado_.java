package andressadas.envionegocio.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-02-27T10:46:40.501-0500")
@StaticMetamodel(Empleado.class)
public class Empleado_ {
	public static volatile SingularAttribute<Empleado, Integer> idempleado;
	public static volatile SingularAttribute<Empleado, String> direccionempleado;
	public static volatile SingularAttribute<Empleado, String> emailempleado;
	public static volatile SingularAttribute<Empleado, String> estadoempleado;
	public static volatile SingularAttribute<Empleado, String> nombreempleado;
	public static volatile SingularAttribute<Empleado, String> perfil;
	public static volatile SingularAttribute<Empleado, String> telefonoempleado;
	public static volatile SingularAttribute<Empleado, Ciudad> ciudad;
	public static volatile SingularAttribute<Empleado, Departamento> departamento;
	public static volatile ListAttribute<Empleado, Envio> envios;
	public static volatile SingularAttribute<Empleado, String> username;
	public static volatile SingularAttribute<Empleado, String> password;
}
