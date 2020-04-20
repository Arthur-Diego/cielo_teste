
package com.gft.teste.cielo_teste.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LancamentoContaCorrenteCliente {

    private Integer numeroRemessaBanco;
    private String nomeSituacaoRemessa;
    private DadosDomicilioBancario dadosDomicilioBancario;
    private String nomeTipoOperacao;
    private List<Object> dadosAnaliticoLancamentoFinanceiroCliente = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
