package com.josetorres.entities;

import com.josetorres.entities.Idcargoc;
import com.josetorres.entities.Platillos;
import com.josetorres.entities.Turnos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T08:45:08")
@StaticMetamodel(Cocineros.class)
public class Cocineros_ { 

    public static volatile SingularAttribute<Cocineros, Idcargoc> idcargo;
    public static volatile SingularAttribute<Cocineros, Turnos> idturno;
    public static volatile ListAttribute<Cocineros, Platillos> platillosList;
    public static volatile SingularAttribute<Cocineros, Integer> idcocinero;
    public static volatile SingularAttribute<Cocineros, String> nombres;

}