/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icap.pvvih.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "zone")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zone.findAll", query = "SELECT z FROM Zone z")
    , @NamedQuery(name = "Zone.findByZoneid", query = "SELECT z FROM Zone z WHERE z.zoneid = :zoneid")
    , @NamedQuery(name = "Zone.findByNom", query = "SELECT z FROM Zone z WHERE z.nom = :nom")})
public class Zone implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "zoneid")
    private Short zoneid;
    @Column(name = "nom")
    private String nom;
    @JoinColumn(name = "provinceid", referencedColumnName = "provinceid")
    @ManyToOne
    private Province provinceid;
    @OneToMany(mappedBy = "zoneid")
    private List<Fosa> fosaList;

    public Zone() {
    }

    public Zone(Short zoneid) {
        this.zoneid = zoneid;
    }

    public Short getZoneid() {
        return zoneid;
    }

    public void setZoneid(Short zoneid) {
        this.zoneid = zoneid;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Province getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Province provinceid) {
        this.provinceid = provinceid;
    }

    @XmlTransient
    public List<Fosa> getFosaList() {
        return fosaList;
    }

    public void setFosaList(List<Fosa> fosaList) {
        this.fosaList = fosaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zoneid != null ? zoneid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zone)) {
            return false;
        }
        Zone other = (Zone) object;
        if ((this.zoneid == null && other.zoneid != null) || (this.zoneid != null && !this.zoneid.equals(other.zoneid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.icap.pvvih.model.Zone[ zoneid=" + zoneid + " ]";
    }
    
}
