/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.josetorres.sessionbenas;

import com.josetorres.entities.Facturacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author programacion
 */
@Local
public interface FacturacionFacadeLocal {

    void create(Facturacion facturacion);

    void edit(Facturacion facturacion);

    void remove(Facturacion facturacion);

    Facturacion find(Object id);

    List<Facturacion> findAll();

    List<Facturacion> findRange(int[] range);

    int count();
    
}
