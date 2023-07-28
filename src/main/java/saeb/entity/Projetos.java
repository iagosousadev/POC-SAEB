
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
* Classe que representa a tabela PROJETOS
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"PROJETOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("saeb.entity.Projetos")
public class Projetos implements Serializable {
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
    @Column(name = "projeto", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String projeto;


    /**
    * @generated
    */
    @Column(name = "descricao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String descricao;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @Column(name = "data_inicio", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data_inicio;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @Column(name = "data_fim", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data_fim;


    /**
    * Construtor
    * @generated
    */
    public Projetos(){
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
    public Projetos setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém projeto
    * return projeto
    * @generated
    */
    public java.lang.String getProjeto() {
        return this.projeto;
    }

    /**
    * Define projeto
    * @param projeto projeto
    * @generated
    */
    public Projetos setProjeto(java.lang.String projeto) {
        this.projeto = projeto;
        return this;
    }
    /**
    * Obtém descricao
    * return descricao
    * @generated
    */
    public java.lang.String getDescricao() {
        return this.descricao;
    }

    /**
    * Define descricao
    * @param descricao descricao
    * @generated
    */
    public Projetos setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
        return this;
    }
    /**
    * Obtém data_inicio
    * return data_inicio
    * @generated
    */
    public java.util.Date getData_inicio() {
        return this.data_inicio;
    }

    /**
    * Define data_inicio
    * @param data_inicio data_inicio
    * @generated
    */
    public Projetos setData_inicio(java.util.Date data_inicio) {
        this.data_inicio = data_inicio;
        return this;
    }
    /**
    * Obtém data_fim
    * return data_fim
    * @generated
    */
    public java.util.Date getData_fim() {
        return this.data_fim;
    }

    /**
    * Define data_fim
    * @param data_fim data_fim
    * @generated
    */
    public Projetos setData_fim(java.util.Date data_fim) {
        this.data_fim = data_fim;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Projetos object = (Projetos)obj;
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