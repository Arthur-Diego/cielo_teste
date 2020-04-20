
package com.gft.teste.cielo_teste.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListaControleLancamento {

    private LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente;
    private String dataEfetivaLancamento;
    private String dataLancamentoContaCorrenteCliente;
    private Integer numeroEvento;
    private String descricaoGrupoPagamento;
    private String codigoIdentificadorUnico;
    private String nomeBanco;
    private Integer quantidadeLancamentoRemessa;
    private String numeroRaizCNPJ;
    private String numeroSufixoCNPJ;
    private Integer valorLancamentoRemessa;
    private Integer dateLancamentoContaCorrenteCliente;
    private Integer dateEfetivaLancamento;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public LancamentoContaCorrenteCliente getLancamentoContaCorrenteCliente() {
        return lancamentoContaCorrenteCliente;
    }

    public void setLancamentoContaCorrenteCliente(LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente) {
        this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
    }

    public String getDataEfetivaLancamento() {
        return dataEfetivaLancamento;
    }

    public void setDataEfetivaLancamento(String dataEfetivaLancamento) {
        this.dataEfetivaLancamento = dataEfetivaLancamento;
    }

    public String getDataLancamentoContaCorrenteCliente() {
        return dataLancamentoContaCorrenteCliente;
    }

    public void setDataLancamentoContaCorrenteCliente(String dataLancamentoContaCorrenteCliente) {
        this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
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

    public Integer getValorLancamentoRemessa() {
        return valorLancamentoRemessa;
    }

    public void setValorLancamentoRemessa(Integer valorLancamentoRemessa) {
        this.valorLancamentoRemessa = valorLancamentoRemessa;
    }

    public Integer getDateLancamentoContaCorrenteCliente() {
        return dateLancamentoContaCorrenteCliente;
    }

    public void setDateLancamentoContaCorrenteCliente(Integer dateLancamentoContaCorrenteCliente) {
        this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
    }

    public Integer getDateEfetivaLancamento() {
        return dateEfetivaLancamento;
    }

    public void setDateEfetivaLancamento(Integer dateEfetivaLancamento) {
        this.dateEfetivaLancamento = dateEfetivaLancamento;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    

}
