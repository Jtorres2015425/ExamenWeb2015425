package com.josetorres.entities;

import com.josetorres.entities.Facturacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T08:45:08")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, String> apellidos;
    public static volatile SingularAttribute<Clientes, String> nit;
    public static volatile SingularAttribute<Clientes, Long> dpi;
    public static volatile SingularAttribute<Clientes, Integer> telefono;
    public static volatile ListAttribute<Clientes, Facturacion> facturacionList;
    public static volatile SingularAttribute<Clientes, Integer> idcliente;
    public static volatile SingularAttribute<Clientes, String> nombres;

}