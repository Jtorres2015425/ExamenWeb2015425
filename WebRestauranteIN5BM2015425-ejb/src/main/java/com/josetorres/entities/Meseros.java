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
@Table(name = "meseros")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Meseros.findAll", query = "SELECT m FROM Meseros m")
    , @NamedQuery(name = "Meseros.findByIdmesero", query = "SELECT m FROM Meseros m WHERE m.idmesero = :idmesero")
    , @NamedQuery(name = "Meseros.findByNombres", query = "SELECT m FROM Meseros m WHERE m.nombres = :nombres")
    , @NamedQuery(name = "Meseros.findByApellidos", query = "SELECT m FROM Meseros m WHERE m.apellidos = :apellidos")
    , @NamedQuery(name = "Meseros.findByIdTurno", query = "SELECT m FROM Meseros m WHERE m.idTurno = :idTurno")})
public class Meseros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idmesero")
    private Integer idmesero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombres")
    private String nombres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "apellidos")
    private String apellidos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTurno")
    private int idTurno;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmesero")
    private List<Facturacion> facturacionList;

    public Meseros() {
    }

    public Meseros(Integer idmesero) {
        this.idmesero = idmesero;
    }

    public Meseros(Integer idmesero, String nombres, String apellidos, int idTurno) {
        this.idmesero = idmesero;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.idTurno = idTurno;
    }

    public Integer getIdmesero() {
        return idmesero;
    }

    public void setIdmesero(Integer idmesero) {
        this.idmesero = idmesero;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    @XmlTransient
    public List<Facturacion> getFacturacionList() {
        return facturacionList;
    }

    public void setFacturacionList(List<Facturacion> facturacionList) {
        this.facturacionList = facturacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmesero != null ? idmesero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Meseros)) {
            return false;
        }
        Meseros other = (Meseros) object;
        if ((this.idmesero == null && other.idmesero != null) || (this.idmesero != null && !this.idmesero.equals(other.idmesero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.josetorres.entities.Meseros[ idmesero=" + idmesero + " ]";
    }
    
}
