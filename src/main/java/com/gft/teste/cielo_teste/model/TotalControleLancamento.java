
package com.gft.teste.cielo_teste.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TotalControleLancamento {

    private Integer quantidadeLancamentos;
    private Integer quantidadeRemessas;
    private Double valorLancamentos;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getQuantidadeLancamentos() {
        return quantidadeLancamentos;
    }

    public void setQuantidadeLancamentos(Integer quantidadeLancamentos) {
        this.quantidadeLancamentos = quantidadeLancamentos;
    }

    public Integer getQuantidadeRemessas() {
        return quantidadeRemessas;
    }

    public void setQuantidadeRemessas(Integer quantidadeRemessas) {
        this.quantidadeRemessas = quantidadeRemessas;
    }

    public Double getValorLancamentos() {
        return valorLancamentos;
    }

    public void setValorLancamentos(Double valorLancamentos) {
        this.valorLancamentos = valorLancamentos;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
