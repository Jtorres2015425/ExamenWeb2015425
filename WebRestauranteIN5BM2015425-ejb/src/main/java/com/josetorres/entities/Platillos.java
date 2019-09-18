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
@Table(name = "platillos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Platillos.findAll", query = "SELECT p FROM Platillos p")
    , @NamedQuery(name = "Platillos.findByIdplatillo", query = "SELECT p FROM Platillos p WHERE p.idplatillo = :idplatillo")
    , @NamedQuery(name = "Platillos.findByDescripcion", query = "SELECT p FROM Platillos p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "Platillos.findByPrecio", query = "SELECT p FROM Platillos p WHERE p.precio = :precio")})
public class Platillos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idplatillo")
    private Integer idplatillo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private double precio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idplatillo")
    private List<Facturacion> facturacionList;
    @JoinColumn(name = "idcocinero", referencedColumnName = "idcocinero")
    @ManyToOne(optional = false)
    private Cocineros idcocinero;
    @JoinColumn(name = "idmenu", referencedColumnName = "idmenu")
    @ManyToOne(optional = false)
    private Menu idmenu;

    public Platillos() {
    }

    public Platillos(Integer idplatillo) {
        this.idplatillo = idplatillo;
    }

    public Platillos(Integer idplatillo, String descripcion, double precio) {
        this.idplatillo = idplatillo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Integer getIdplatillo() {
        return idplatillo;
    }

    public void setIdplatillo(Integer idplatillo) {
        this.idplatillo = idplatillo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @XmlTransient
    public List<Facturacion> getFacturacionList() {
        return facturacionList;
    }

    public void setFacturacionList(List<Facturacion> facturacionList) {
        this.facturacionList = facturacionList;
    }

    public Cocineros getIdcocinero() {
        return idcocinero;
    }

    public void setIdcocinero(Cocineros idcocinero) {
        this.idcocinero = idcocinero;
    }

    public Menu getIdmenu() {
        return idmenu;
    }

    public void setIdmenu(Menu idmenu) {
        this.idmenu = idmenu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idplatillo != null ? idplatillo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Platillos)) {
            return false;
        }
        Platillos other = (Platillos) object;
        if ((this.idplatillo == null && other.idplatillo != null) || (this.idplatillo != null && !this.idplatillo.equals(other.idplatillo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.josetorres.entities.Platillos[ idplatillo=" + idplatillo + " ]";
    }
    
}
