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
@Table(name = "posting")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Posting.findAll", query = "SELECT p FROM Posting p"),
    @NamedQuery(name = "Posting.findById", query = "SELECT p FROM Posting p WHERE p.id = :id"),
    @NamedQuery(name = "Posting.findByIdAuthor", query = "SELECT p FROM Posting p WHERE p.idAuthor = :idAuthor"),
    @NamedQuery(name = "Posting.findByTanggal", query = "SELECT p FROM Posting p WHERE p.tanggal = :tanggal"),
    @NamedQuery(name = "Posting.findByJudulPost", query = "SELECT p FROM Posting p WHERE p.judulPost = :judulPost")})
public class Posting implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_author")
    private int idAuthor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tanggal")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tanggal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "judul_post")
    private String judulPost;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "isi")
    private String isi;

    public Posting() {
    }

    public Posting(Integer id) {
        this.id = id;
    }

    public Posting(Integer id, int idAuthor, Date tanggal, String judulPost, String isi) {
        this.id = id;
        this.idAuthor = idAuthor;
        this.tanggal = tanggal;
        this.judulPost = judulPost;
        this.isi = isi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getJudulPost() {
        return judulPost;
    }

    public void setJudulPost(String judulPost) {
        this.judulPost = judulPost;
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
        if (!(object instanceof Posting)) {
            return false;
        }
        Posting other = (Posting) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wury.app.entity.Posting[ id=" + id + " ]";
    }
    
}
