package com.josetorres.entities;

import com.josetorres.entities.Areas;
import com.josetorres.entities.Facturacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T08:45:08")
@StaticMetamodel(Mesas.class)
public class Mesas_ { 

    public static volatile SingularAttribute<Mesas, Integer> idmesa;
    public static volatile SingularAttribute<Mesas, Areas> idarea;
    public static volatile ListAttribute<Mesas, Facturacion> facturacionList;

}