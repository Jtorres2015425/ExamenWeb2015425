package com.josetorres.entities;

import com.josetorres.entities.Platillos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T08:45:08")
@StaticMetamodel(Menu.class)
public class Menu_ { 

    public static volatile SingularAttribute<Menu, String> descripcion;
    public static volatile SingularAttribute<Menu, String> descuento;
    public static volatile SingularAttribute<Menu, Integer> idmenu;
    public static volatile ListAttribute<Menu, Platillos> platillosList;

}