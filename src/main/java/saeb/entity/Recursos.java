
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
* Classe que representa a tabela RECURSOS
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"RECURSOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("saeb.entity.Recursos")
public class Recursos implements Serializable {
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
    @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome;


    /**
    * @generated
    */
    @Column(name = "email", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String email;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @Column(name = "data_nascimento", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data_nascimento;


    /**
    * @generated
    */
    @Column(name = "remuneracao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double remuneracao;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_cargos", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Cargos cargos;


    /**
    * Construtor
    * @generated
    */
    public Recursos(){
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
    public Recursos setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nome
    * return nome
    * @generated
    */
    public java.lang.String getNome() {
        return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public Recursos setNome(java.lang.String nome) {
        this.nome = nome;
        return this;
    }
    /**
    * Obtém email
    * return email
    * @generated
    */
    public java.lang.String getEmail() {
        return this.email;
    }

    /**
    * Define email
    * @param email email
    * @generated
    */
    public Recursos setEmail(java.lang.String email) {
        this.email = email;
        return this;
    }
    /**
    * Obtém data_nascimento
    * return data_nascimento
    * @generated
    */
    public java.util.Date getData_nascimento() {
        return this.data_nascimento;
    }

    /**
    * Define data_nascimento
    * @param data_nascimento data_nascimento
    * @generated
    */
    public Recursos setData_nascimento(java.util.Date data_nascimento) {
        this.data_nascimento = data_nascimento;
        return this;
    }
    /**
    * Obtém remuneracao
    * return remuneracao
    * @generated
    */
    public java.lang.Double getRemuneracao() {
        return this.remuneracao;
    }

    /**
    * Define remuneracao
    * @param remuneracao remuneracao
    * @generated
    */
    public Recursos setRemuneracao(java.lang.Double remuneracao) {
        this.remuneracao = remuneracao;
        return this;
    }
    /**
    * Obtém cargos
    * return cargos
    * @generated
    */
    public Cargos getCargos() {
        return this.cargos;
    }

    /**
    * Define cargos
    * @param cargos cargos
    * @generated
    */
    public Recursos setCargos(Cargos cargos) {
        this.cargos = cargos;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Recursos object = (Recursos)obj;
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