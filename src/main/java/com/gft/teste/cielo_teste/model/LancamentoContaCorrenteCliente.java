
package com.gft.teste.cielo_teste.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "lanc_conta_corrent_cli")
public class LancamentoContaCorrenteCliente implements Serializable{

    @Id
    @Column(name = "id_num_rem_ban")
    private Integer numeroRemessaBanco;
    
    private String nomeSituacaoRemessa;
    
    @ManyToOne
    @JoinColumn(name = "id_dad_ban", referencedColumnName = "id_dad_ban", foreignKey = 
            @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "fk_dad_ban"))
    private DadosDomicilioBancario dadosDomicilioBancario;
    private String nomeTipoOperacao;
    
    @Transient
    private List<Object> dadosAnaliticoLancamentoFinanceiroCliente = null;

    public Integer getNumeroRemessaBanco() {
        return numeroRemessaBanco;
    }

    public void setNumeroRemessaBanco(Integer numeroRemessaBanco) {
        this.numeroRemessaBanco = numeroRemessaBanco;
    }

    public String getNomeSituacaoRemessa() {
        return nomeSituacaoRemessa;
    }

    public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
        this.nomeSituacaoRemessa = nomeSituacaoRemessa;
    }

    public DadosDomicilioBancario getDadosDomicilioBancario() {
        return dadosDomicilioBancario;
    }

    public void setDadosDomicilioBancario(DadosDomicilioBancario dadosDomicilioBancario) {
        this.dadosDomicilioBancario = dadosDomicilioBancario;
    }

    public String getNomeTipoOperacao() {
        return nomeTipoOperacao;
    }

    public void setNomeTipoOperacao(String nomeTipoOperacao) {
        this.nomeTipoOperacao = nomeTipoOperacao;
    }

    public List<Object> getDadosAnaliticoLancamentoFinanceiroCliente() {
        return dadosAnaliticoLancamentoFinanceiroCliente;
    }

    public void setDadosAnaliticoLancamentoFinanceiroCliente(List<Object> dadosAnaliticoLancamentoFinanceiroCliente) {
        this.dadosAnaliticoLancamentoFinanceiroCliente = dadosAnaliticoLancamentoFinanceiroCliente;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.numeroRemessaBanco);
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
        final LancamentoContaCorrenteCliente other = (LancamentoContaCorrenteCliente) obj;
        if (!Objects.equals(this.numeroRemessaBanco, other.numeroRemessaBanco)) {
            return false;
        }
        return true;
    }

    
}
