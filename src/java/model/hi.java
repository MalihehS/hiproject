package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class hi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    public Long personalNumber;
    String name;
    String famillyName;
    String size;

    public hi(Long personalNumber, String name, String famillyName, String size) {
        this.personalNumber = personalNumber;
        this.name = name;
        this.famillyName = famillyName;
        this.size = size;
    }

    public Long getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(Long personalNumber) {
        this.personalNumber = personalNumber;
    }

    
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public hi() {
    }

    public String getFamillyName() {
        return famillyName;
    }

    public void setFamillyName(String famillyName) {
        this.famillyName = famillyName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof hi)) {
            return false;
        }
        hi other = (hi) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.hi[ id=" + id + " ]";
    }

}
