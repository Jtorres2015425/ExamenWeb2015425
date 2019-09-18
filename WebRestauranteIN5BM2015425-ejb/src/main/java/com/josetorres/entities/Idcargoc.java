/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.josetorres.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "idcargoc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Idcargoc.findAll", query = "SELECT i FROM Idcargoc i")
    , @NamedQuery(name = "Idcargoc.findByIdcargo", query = "SELECT i FROM Idcargoc i WHERE i.idcargo = :idcargo")
    , @NamedQuery(name = "Idcargoc.findByDescripcion", query = "SELECT i FROM Idcargoc i WHERE i.descripcion = :descripcion")})
public class Idcargoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcargo")
    private Integer idcargo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcargo")
    private List<Cocineros> cocinerosList;

    public Idcargoc() {
    }

    public Idcargoc(Integer idcargo) {
        this.idcargo = idcargo;
    }

    public Idcargoc(Integer idcargo, String descripcion) {
        this.idcargo = idcargo;
        this.descripcion = descripcion;
    }

    public Integer getIdcargo() {
        return idcargo;
    }

    public void setIdcargo(Integer idcargo) {
        this.idcargo = idcargo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Cocineros> getCocinerosList() {
        return cocinerosList;
    }

    public void setCocinerosList(List<Cocineros> cocinerosList) {
        this.cocinerosList = cocinerosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcargo != null ? idcargo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Idcargoc)) {
            return false;
        }
        Idcargoc other = (Idcargoc) object;
        if ((this.idcargo == null && other.idcargo != null) || (this.idcargo != null && !this.idcargo.equals(other.idcargo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.josetorres.entities.Idcargoc[ idcargo=" + idcargo + " ]";
    }
    
}
