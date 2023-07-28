
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
* Classe que representa a tabela ATIVIDADES
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"ATIVIDADES\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("saeb.entity.Atividades")
public class Atividades implements Serializable {
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
    @Column(name = "descricao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String descricao;


    /**
    * @generated
    */
    @Column(name = "tempo_estimado", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer tempo_estimado;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_papeis", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Papeis papeis;


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
    * Construtor
    * @generated
    */
    public Atividades(){
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
    public Atividades setId(java.lang.String id) {
        this.id = id;
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
    public Atividades setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
        return this;
    }
    /**
    * Obtém tempo_estimado
    * return tempo_estimado
    * @generated
    */
    public java.lang.Integer getTempo_estimado() {
        return this.tempo_estimado;
    }

    /**
    * Define tempo_estimado
    * @param tempo_estimado tempo_estimado
    * @generated
    */
    public Atividades setTempo_estimado(java.lang.Integer tempo_estimado) {
        this.tempo_estimado = tempo_estimado;
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
    public Atividades setPapeis(Papeis papeis) {
        this.papeis = papeis;
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
    public Atividades setRecursos(Recursos recursos) {
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
    public Atividades setProjetos(Projetos projetos) {
        this.projetos = projetos;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Atividades object = (Atividades)obj;
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