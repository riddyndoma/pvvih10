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
@Table(name = "fosa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fosa.findAll", query = "SELECT f FROM Fosa f")
    , @NamedQuery(name = "Fosa.findByFosaid", query = "SELECT f FROM Fosa f WHERE f.fosaid = :fosaid")
    , @NamedQuery(name = "Fosa.findByNom", query = "SELECT f FROM Fosa f WHERE f.nom = :nom")})
public class Fosa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "fosaid")
    private Integer fosaid;
    @Column(name = "nom")
    private String nom;
    @JoinColumn(name = "zoneid", referencedColumnName = "zoneid")
    @ManyToOne
    private Zone zoneid;
    @OneToMany(mappedBy = "fosaid")
    private List<Survey> surveyList;

    public Fosa() {
    }

    public Fosa(Integer fosaid) {
        this.fosaid = fosaid;
    }

    public Integer getFosaid() {
        return fosaid;
    }

    public void setFosaid(Integer fosaid) {
        this.fosaid = fosaid;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Zone getZoneid() {
        return zoneid;
    }

    public void setZoneid(Zone zoneid) {
        this.zoneid = zoneid;
    }

    @XmlTransient
    public List<Survey> getSurveyList() {
        return surveyList;
    }

    public void setSurveyList(List<Survey> surveyList) {
        this.surveyList = surveyList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fosaid != null ? fosaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fosa)) {
            return false;
        }
        Fosa other = (Fosa) object;
        if ((this.fosaid == null && other.fosaid != null) || (this.fosaid != null && !this.fosaid.equals(other.fosaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.icap.pvvih.model.Fosa[ fosaid=" + fosaid + " ]";
    }
    
}
