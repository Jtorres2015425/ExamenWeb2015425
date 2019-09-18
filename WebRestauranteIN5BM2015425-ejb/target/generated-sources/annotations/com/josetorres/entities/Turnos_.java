package com.josetorres.entities;

import com.josetorres.entities.Cocineros;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T08:45:08")
@StaticMetamodel(Turnos.class)
public class Turnos_ { 

    public static volatile ListAttribute<Turnos, Cocineros> cocinerosList;
    public static volatile SingularAttribute<Turnos, Date> entrada;
    public static volatile SingularAttribute<Turnos, Integer> idturno;
    public static volatile SingularAttribute<Turnos, Date> salida;

}