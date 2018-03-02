package andressadas.envionegocio.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-02-27T09:46:07.368-0500")
@StaticMetamodel(Cliente.class)
public class Cliente_ {
	public static volatile SingularAttribute<Cliente, Integer> idcliente;
	public static volatile SingularAttribute<Cliente, String> emailcliente;
	public static volatile SingularAttribute<Cliente, String> nombrecliente;
	public static volatile SingularAttribute<Cliente, String> numeroidentificacion;
	public static volatile SingularAttribute<Cliente, String> telefonocliente;
	public static volatile SingularAttribute<Cliente, String> tipocliente;
	public static volatile SingularAttribute<Cliente, String> tipoidentificacion;
	public static volatile ListAttribute<Cliente, Envio> envios1;
	public static volatile ListAttribute<Cliente, Envio> envios2;
}
