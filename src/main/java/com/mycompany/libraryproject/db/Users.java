/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.libraryproject.db;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author aaa
 */
@Entity
@Table(name = "users")
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u"),
    @NamedQuery(name = "Users.findByIdUsers", query = "SELECT u FROM Users u WHERE u.idUsers = :idUsers"),
    @NamedQuery(name = "Users.findByName", query = "SELECT u FROM Users u WHERE u.name = :name"),
    @NamedQuery(name = "Users.findByEmail", query = "SELECT u FROM Users u WHERE u.email = :email")})
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idUsers")
    private Integer idUsers;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;

    public Users() {
    }

    public Users(Integer idUsers) {
        this.idUsers = idUsers;
    }

    public Users(Integer idUsers, String name, String email) {
        this.idUsers = idUsers;
        this.name = name;
        this.email = email;
    }

    public Integer getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(Integer idUsers) {
        this.idUsers = idUsers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsers != null ? idUsers.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.idUsers == null && other.idUsers != null) || (this.idUsers != null && !this.idUsers.equals(other.idUsers))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.libraryproject.db.Users[ idUsers=" + idUsers + " ]";
    }
    
}
