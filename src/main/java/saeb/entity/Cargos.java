
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
* Classe que representa a tabela CARGOS
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"CARGOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("saeb.entity.Cargos")
public class Cargos implements Serializable {
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
    @Column(name = "cargo", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String cargo;


    /**
    * @generated
    */
    @Column(name = "remuneracao_base", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double remuneracao_base;


    /**
    * Construtor
    * @generated
    */
    public Cargos(){
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
    public Cargos setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém cargo
    * return cargo
    * @generated
    */
    public java.lang.String getCargo() {
        return this.cargo;
    }

    /**
    * Define cargo
    * @param cargo cargo
    * @generated
    */
    public Cargos setCargo(java.lang.String cargo) {
        this.cargo = cargo;
        return this;
    }
    /**
    * Obtém remuneracao_base
    * return remuneracao_base
    * @generated
    */
    public java.lang.Double getRemuneracao_base() {
        return this.remuneracao_base;
    }

    /**
    * Define remuneracao_base
    * @param remuneracao_base remuneracao_base
    * @generated
    */
    public Cargos setRemuneracao_base(java.lang.Double remuneracao_base) {
        this.remuneracao_base = remuneracao_base;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Cargos object = (Cargos)obj;
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