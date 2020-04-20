
package com.gft.teste.cielo_teste.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DadosDomicilioBancario {

    private Integer codigoBanco;
    private Integer numeroAgencia;
    private String numeroContaCorrente;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
