
package saeb.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;


/**
* Classe que representa a tabela PAPEIS
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"PAPEIS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("saeb.entity.Papeis")
public class Papeis implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "papel", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String papel;


    /**
    * Construtor
    * @generated
    */
    public Papeis(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Papeis setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém papel
    * return papel
    * @generated
    */
    public java.lang.String getPapel() {
        return this.papel;
    }

    /**
    * Define papel
    * @param papel papel
    * @generated
    */
    public Papeis setPapel(java.lang.String papel) {
        this.papel = papel;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Papeis object = (Papeis)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}