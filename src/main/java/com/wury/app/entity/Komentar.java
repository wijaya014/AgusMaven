/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wury.app.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ABYOR
 */
@Entity
@Table(name = "komentar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Komentar.findAll", query = "SELECT k FROM Komentar k"),
    @NamedQuery(name = "Komentar.findById", query = "SELECT k FROM Komentar k WHERE k.id = :id"),
    @NamedQuery(name = "Komentar.findByIdPosting", query = "SELECT k FROM Komentar k WHERE k.idPosting = :idPosting"),
    @NamedQuery(name = "Komentar.findByPengirim", query = "SELECT k FROM Komentar k WHERE k.pengirim = :pengirim"),
    @NamedQuery(name = "Komentar.findByTanggal", query = "SELECT k FROM Komentar k WHERE k.tanggal = :tanggal")})
public class Komentar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_posting")
    private int idPosting;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "pengirim")
    private String pengirim;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tanggal")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tanggal;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "isi")
    private String isi;

    public Komentar() {
    }

    public Komentar(Integer id) {
        this.id = id;
    }

    public Komentar(Integer id, int idPosting, String pengirim, Date tanggal, String isi) {
        this.id = id;
        this.idPosting = idPosting;
        this.pengirim = pengirim;
        this.tanggal = tanggal;
        this.isi = isi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdPosting() {
        return idPosting;
    }

    public void setIdPosting(int idPosting) {
        this.idPosting = idPosting;
    }

    public String getPengirim() {
        return pengirim;
    }

    public void setPengirim(String pengirim) {
        this.pengirim = pengirim;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Komentar)) {
            return false;
        }
        Komentar other = (Komentar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wury.app.entity.Komentar[ id=" + id + " ]";
    }
    
}
