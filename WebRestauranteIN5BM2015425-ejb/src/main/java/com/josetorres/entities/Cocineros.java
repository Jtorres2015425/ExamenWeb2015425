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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "cocineros")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cocineros.findAll", query = "SELECT c FROM Cocineros c")
    , @NamedQuery(name = "Cocineros.findByIdcocinero", query = "SELECT c FROM Cocineros c WHERE c.idcocinero = :idcocinero")
    , @NamedQuery(name = "Cocineros.findByNombres", query = "SELECT c FROM Cocineros c WHERE c.nombres = :nombres")})
public class Cocineros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcocinero")
    private Integer idcocinero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombres")
    private String nombres;
    @JoinColumn(name = "idcargo", referencedColumnName = "idcargo")
    @ManyToOne(optional = false)
    private Idcargoc idcargo;
    @JoinColumn(name = "idturno", referencedColumnName = "idturno")
    @ManyToOne(optional = false)
    private Turnos idturno;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcocinero")
    private List<Platillos> platillosList;

    public Cocineros() {
    }

    public Cocineros(Integer idcocinero) {
        this.idcocinero = idcocinero;
    }

    public Cocineros(Integer idcocinero, String nombres) {
        this.idcocinero = idcocinero;
        this.nombres = nombres;
    }

    public Integer getIdcocinero() {
        return idcocinero;
    }

    public void setIdcocinero(Integer idcocinero) {
        this.idcocinero = idcocinero;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Idcargoc getIdcargo() {
        return idcargo;
    }

    public void setIdcargo(Idcargoc idcargo) {
        this.idcargo = idcargo;
    }

    public Turnos getIdturno() {
        return idturno;
    }

    public void setIdturno(Turnos idturno) {
        this.idturno = idturno;
    }

    @XmlTransient
    public List<Platillos> getPlatillosList() {
        return platillosList;
    }

    public void setPlatillosList(List<Platillos> platillosList) {
        this.platillosList = platillosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcocinero != null ? idcocinero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cocineros)) {
            return false;
        }
        Cocineros other = (Cocineros) object;
        if ((this.idcocinero == null && other.idcocinero != null) || (this.idcocinero != null && !this.idcocinero.equals(other.idcocinero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.josetorres.entities.Cocineros[ idcocinero=" + idcocinero + " ]";
    }
    
}
