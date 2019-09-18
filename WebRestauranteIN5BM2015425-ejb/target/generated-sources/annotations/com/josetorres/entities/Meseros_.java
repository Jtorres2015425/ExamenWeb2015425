package com.josetorres.entities;

import com.josetorres.entities.Facturacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T08:45:08")
@StaticMetamodel(Meseros.class)
public class Meseros_ { 

    public static volatile SingularAttribute<Meseros, String> apellidos;
    public static volatile ListAttribute<Meseros, Facturacion> facturacionList;
    public static volatile SingularAttribute<Meseros, Integer> idmesero;
    public static volatile SingularAttribute<Meseros, Integer> idTurno;
    public static volatile SingularAttribute<Meseros, String> nombres;

}