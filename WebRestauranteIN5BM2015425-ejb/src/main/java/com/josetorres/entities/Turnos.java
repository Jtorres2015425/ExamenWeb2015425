/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.josetorres.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "turnos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Turnos.findAll", query = "SELECT t FROM Turnos t")
    , @NamedQuery(name = "Turnos.findByIdturno", query = "SELECT t FROM Turnos t WHERE t.idturno = :idturno")
    , @NamedQuery(name = "Turnos.findByEntrada", query = "SELECT t FROM Turnos t WHERE t.entrada = :entrada")
    , @NamedQuery(name = "Turnos.findBySalida", query = "SELECT t FROM Turnos t WHERE t.salida = :salida")})
public class Turnos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idturno")
    private Integer idturno;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Entrada")
    @Temporal(TemporalType.TIME)
    private Date entrada;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Salida")
    @Temporal(TemporalType.TIME)
    private Date salida;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idturno")
    private List<Cocineros> cocinerosList;

    public Turnos() {
    }

    public Turnos(Integer idturno) {
        this.idturno = idturno;
    }

    public Turnos(Integer idturno, Date entrada, Date salida) {
        this.idturno = idturno;
        this.entrada = entrada;
        this.salida = salida;
    }

    public Integer getIdturno() {
        return idturno;
    }

    public void setIdturno(Integer idturno) {
        this.idturno = idturno;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
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
        hash += (idturno != null ? idturno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Turnos)) {
            return false;
        }
        Turnos other = (Turnos) object;
        if ((this.idturno == null && other.idturno != null) || (this.idturno != null && !this.idturno.equals(other.idturno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.josetorres.entities.Turnos[ idturno=" + idturno + " ]";
    }
    
}
