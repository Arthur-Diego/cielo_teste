
package com.gft.teste.cielo_teste.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "controle_lanc")
public class ListaControleLancamento implements Serializable {
    
    @Id
    private String codigoIdentificadorUnico;
    
    @OneToOne
    @JoinColumn(name = "id_num_rem_ban", referencedColumnName = "id_num_rem_ban", foreignKey = 
            @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "fk_lanc_conta_corrent_cli"))
    private LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente;
    
    @Temporal(TemporalType.DATE)
    private Date dataEfetivaLancamento;
    
    @Temporal(TemporalType.DATE)
    private Date dataLancamentoContaCorrenteCliente;
    
    private Integer numeroEvento;
    private String descricaoGrupoPagamento;
    private String nomeBanco;
    private Integer quantidadeLancamentoRemessa;
    private String numeroRaizCNPJ;
    private String numeroSufixoCNPJ;
    private Double valorLancamentoRemessa;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateLancamentoContaCorrenteCliente;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateEfetivaLancamento;
    
    public LancamentoContaCorrenteCliente getLancamentoContaCorrenteCliente() {
        return lancamentoContaCorrenteCliente;
    }

    public void setLancamentoContaCorrenteCliente(LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente) {
        this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
    }

    public Integer getNumeroEvento() {
        return numeroEvento;
    }

    public void setNumeroEvento(Integer numeroEvento) {
        this.numeroEvento = numeroEvento;
    }

    public String getDescricaoGrupoPagamento() {
        return descricaoGrupoPagamento;
    }

    public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
        this.descricaoGrupoPagamento = descricaoGrupoPagamento;
    }

    public String getCodigoIdentificadorUnico() {
        return codigoIdentificadorUnico;
    }

    public void setCodigoIdentificadorUnico(String codigoIdentificadorUnico) {
        this.codigoIdentificadorUnico = codigoIdentificadorUnico;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public Integer getQuantidadeLancamentoRemessa() {
        return quantidadeLancamentoRemessa;
    }

    public void setQuantidadeLancamentoRemessa(Integer quantidadeLancamentoRemessa) {
        this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
    }

    public String getNumeroRaizCNPJ() {
        return numeroRaizCNPJ;
    }

    public void setNumeroRaizCNPJ(String numeroRaizCNPJ) {
        this.numeroRaizCNPJ = numeroRaizCNPJ;
    }

    public String getNumeroSufixoCNPJ() {
        return numeroSufixoCNPJ;
    }

    public void setNumeroSufixoCNPJ(String numeroSufixoCNPJ) {
        this.numeroSufixoCNPJ = numeroSufixoCNPJ;
    }

    public Double getValorLancamentoRemessa() {
        return valorLancamentoRemessa;
    }

    public void setValorLancamentoRemessa(Double valorLancamentoRemessa) {
        this.valorLancamentoRemessa = valorLancamentoRemessa;
    }

    public Date getDataEfetivaLancamento() {
        return dataEfetivaLancamento;
    }

    public void setDataEfetivaLancamento(Date dataEfetivaLancamento) {
        this.dataEfetivaLancamento = dataEfetivaLancamento;
    }

    public Date getDataLancamentoContaCorrenteCliente() {
        return dataLancamentoContaCorrenteCliente;
    }

    public void setDataLancamentoContaCorrenteCliente(Date dataLancamentoContaCorrenteCliente) {
        this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
    }

    public Date getDateLancamentoContaCorrenteCliente() {
        return dateLancamentoContaCorrenteCliente;
    }

    public void setDateLancamentoContaCorrenteCliente(Date dateLancamentoContaCorrenteCliente) {
        this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
    }

    public Date getDateEfetivaLancamento() {
        return dateEfetivaLancamento;
    }

    public void setDateEfetivaLancamento(Date dateEfetivaLancamento) {
        this.dateEfetivaLancamento = dateEfetivaLancamento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.codigoIdentificadorUnico);
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
        final ListaControleLancamento other = (ListaControleLancamento) obj;
        if (!Objects.equals(this.codigoIdentificadorUnico, other.codigoIdentificadorUnico)) {
            return false;
        }
        return true;
    }

}
