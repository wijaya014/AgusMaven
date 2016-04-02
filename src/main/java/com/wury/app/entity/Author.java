/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wury.app.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ABYOR
 */
@Entity
@Table(name = "author")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Author.findAll", query = "SELECT a FROM Author a"),
    @NamedQuery(name = "Author.findById", query = "SELECT a FROM Author a WHERE a.id = :id"),
    @NamedQuery(name = "Author.findByEnabled", query = "SELECT a FROM Author a WHERE a.enabled = :enabled"),
    @NamedQuery(name = "Author.findByNamaAuthor", query = "SELECT a FROM Author a WHERE a.namaAuthor = :namaAuthor"),
    @NamedQuery(name = "Author.findByEmail", query = "SELECT a FROM Author a WHERE a.email = :email"),
    @NamedQuery(name = "Author.findByWebSite", query = "SELECT a FROM Author a WHERE a.webSite = :webSite"),
    @NamedQuery(name = "Author.findByUsername", query = "SELECT a FROM Author a WHERE a.username = :username"),
    @NamedQuery(name = "Author.findByPassword", query = "SELECT a FROM Author a WHERE a.password = :password")})
public class Author implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "enabled")
    private boolean enabled;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nama_author")
    private String namaAuthor;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "web_site")
    private String webSite;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "password")
    private String password;

    @OneToOne
    @JoinColumn(name = "role_id")
    private Role role;

    public Author() {
    }

    public Author(Integer id) {
        this.id = id;
    }

    public Author(Integer id, boolean enabled, String namaAuthor, String email, String webSite, String username, String password) {
        this.id = id;
        this.enabled = enabled;
        this.namaAuthor = namaAuthor;
        this.email = email;
        this.webSite = webSite;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getNamaAuthor() {
        return namaAuthor;
    }

    public void setNamaAuthor(String namaAuthor) {
        this.namaAuthor = namaAuthor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "com.wury.app.entity.Author[ id=" + id + " ]";
    }

}
