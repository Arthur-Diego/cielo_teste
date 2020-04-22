
package com.gft.teste.cielo_teste.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "dados_domicilio_bancario")
public class DadosDomicilioBancario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dad_ban")
    private Integer idDadosDomBanc;
    private Integer codigoBanco;
    private Integer numeroAgencia;
    private String numeroContaCorrente;
    
    public Integer getIdDadosDomBanc() {
        return idDadosDomBanc;
    }

    public void setIdDadosDomBanc(Integer idDadosDomBanc) {
        this.idDadosDomBanc = idDadosDomBanc;
    }
    
    public Integer getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(Integer codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public Integer getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(Integer numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    public void setNumeroContaCorrente(String numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.idDadosDomBanc);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DadosDomicilioBancario other = (DadosDomicilioBancario) obj;
        if (!Objects.equals(this.idDadosDomBanc, other.idDadosDomBanc)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return codigoBanco + " " + numeroAgencia + " " + numeroContaCorrente;
    }

    
}
