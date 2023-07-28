
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
* Classe que representa a tabela EQUIPES
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"EQUIPES\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("saeb.entity.Equipes")
public class Equipes implements Serializable {
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
    @ManyToOne
    @JoinColumn(name="fk_recursos", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Recursos recursos;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_projetos", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Projetos projetos;


    /**
    * @generated
    */
    @OneToOne
    @JoinColumn(name="fk_papeis", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Papeis papeis;


    /**
    * Construtor
    * @generated
    */
    public Equipes(){
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
    public Equipes setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém recursos
    * return recursos
    * @generated
    */
    public Recursos getRecursos() {
        return this.recursos;
    }

    /**
    * Define recursos
    * @param recursos recursos
    * @generated
    */
    public Equipes setRecursos(Recursos recursos) {
        this.recursos = recursos;
        return this;
    }
    /**
    * Obtém projetos
    * return projetos
    * @generated
    */
    public Projetos getProjetos() {
        return this.projetos;
    }

    /**
    * Define projetos
    * @param projetos projetos
    * @generated
    */
    public Equipes setProjetos(Projetos projetos) {
        this.projetos = projetos;
        return this;
    }
    /**
    * Obtém papeis
    * return papeis
    * @generated
    */
    public Papeis getPapeis() {
        return this.papeis;
    }

    /**
    * Define papeis
    * @param papeis papeis
    * @generated
    */
    public Equipes setPapeis(Papeis papeis) {
        this.papeis = papeis;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Equipes object = (Equipes)obj;
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