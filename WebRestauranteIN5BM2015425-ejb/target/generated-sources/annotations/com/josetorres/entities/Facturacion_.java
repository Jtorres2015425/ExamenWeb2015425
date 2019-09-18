package com.josetorres.entities;

import com.josetorres.entities.Clientes;
import com.josetorres.entities.Mesas;
import com.josetorres.entities.Meseros;
import com.josetorres.entities.Platillos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T08:45:08")
@StaticMetamodel(Facturacion.class)
public class Facturacion_ { 

    public static volatile SingularAttribute<Facturacion, Mesas> idmesa;
    public static volatile SingularAttribute<Facturacion, Date> fechafactura;
    public static volatile SingularAttribute<Facturacion, Integer> idfacturacion;
    public static volatile SingularAttribute<Facturacion, Platillos> idplatillo;
    public static volatile SingularAttribute<Facturacion, Clientes> idcliente;
    public static volatile SingularAttribute<Facturacion, Meseros> idmesero;

}