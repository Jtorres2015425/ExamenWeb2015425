/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.josetorres.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "facturacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facturacion.findAll", query = "SELECT f FROM Facturacion f")
    , @NamedQuery(name = "Facturacion.findByIdfacturacion", query = "SELECT f FROM Facturacion f WHERE f.idfacturacion = :idfacturacion")
    , @NamedQuery(name = "Facturacion.findByFechafactura", query = "SELECT f FROM Facturacion f WHERE f.fechafactura = :fechafactura")})
public class Facturacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idfacturacion")
    private Integer idfacturacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechafactura")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechafactura;
    @JoinColumn(name = "idcliente", referencedColumnName = "idcliente")
    @ManyToOne(optional = false)
    private Clientes idcliente;
    @JoinColumn(name = "idmesa", referencedColumnName = "idmesa")
    @ManyToOne(optional = false)
    private Mesas idmesa;
    @JoinColumn(name = "idmesero", referencedColumnName = "idmesero")
    @ManyToOne(optional = false)
    private Meseros idmesero;
    @JoinColumn(name = "idplatillo", referencedColumnName = "idplatillo")
    @ManyToOne(optional = false)
    private Platillos idplatillo;

    public Facturacion() {
    }

    public Facturacion(Integer idfacturacion) {
        this.idfacturacion = idfacturacion;
    }

    public Facturacion(Integer idfacturacion, Date fechafactura) {
        this.idfacturacion = idfacturacion;
        this.fechafactura = fechafactura;
    }

    public Integer getIdfacturacion() {
        return idfacturacion;
    }

    public void setIdfacturacion(Integer idfacturacion) {
        this.idfacturacion = idfacturacion;
    }

    public Date getFechafactura() {
        return fechafactura;
    }

    public void setFechafactura(Date fechafactura) {
        this.fechafactura = fechafactura;
    }

    public Clientes getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Clientes idcliente) {
        this.idcliente = idcliente;
    }

    public Mesas getIdmesa() {
        return idmesa;
    }

    public void setIdmesa(Mesas idmesa) {
        this.idmesa = idmesa;
    }

    public Meseros getIdmesero() {
        return idmesero;
    }

    public void setIdmesero(Meseros idmesero) {
        this.idmesero = idmesero;
    }

    public Platillos getIdplatillo() {
        return idplatillo;
    }

    public void setIdplatillo(Platillos idplatillo) {
        this.idplatillo = idplatillo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfacturacion != null ? idfacturacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facturacion)) {
            return false;
        }
        Facturacion other = (Facturacion) object;
        if ((this.idfacturacion == null && other.idfacturacion != null) || (this.idfacturacion != null && !this.idfacturacion.equals(other.idfacturacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.josetorres.entities.Facturacion[ idfacturacion=" + idfacturacion + " ]";
    }
    
}
