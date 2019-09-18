/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.josetorres.sessionbenas;

import com.josetorres.entities.Idcargoc;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author programacion
 */
@Local
public interface IdcargocFacadeLocal {

    void create(Idcargoc idcargoc);

    void edit(Idcargoc idcargoc);

    void remove(Idcargoc idcargoc);

    Idcargoc find(Object id);

    List<Idcargoc> findAll();

    List<Idcargoc> findRange(int[] range);

    int count();
    
}
