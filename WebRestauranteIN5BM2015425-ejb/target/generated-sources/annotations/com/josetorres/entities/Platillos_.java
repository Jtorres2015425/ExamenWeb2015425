package com.josetorres.entities;

import com.josetorres.entities.Cocineros;
import com.josetorres.entities.Facturacion;
import com.josetorres.entities.Menu;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T08:45:08")
@StaticMetamodel(Platillos.class)
public class Platillos_ { 

    public static volatile SingularAttribute<Platillos, String> descripcion;
    public static volatile SingularAttribute<Platillos, Double> precio;
    public static volatile SingularAttribute<Platillos, Integer> idplatillo;
    public static volatile SingularAttribute<Platillos, Menu> idmenu;
    public static volatile ListAttribute<Platillos, Facturacion> facturacionList;
    public static volatile SingularAttribute<Platillos, Cocineros> idcocinero;

}