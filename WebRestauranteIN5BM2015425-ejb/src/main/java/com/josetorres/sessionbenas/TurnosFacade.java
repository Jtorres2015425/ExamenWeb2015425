/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.josetorres.sessionbenas;

import com.josetorres.entities.Turnos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author programacion
 */
@Stateless
public class TurnosFacade extends AbstractFacade<Turnos> implements TurnosFacadeLocal {

    @PersistenceContext(unitName = "WebRetaurante_2015425")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TurnosFacade() {
        super(Turnos.class);
    }
    
}
