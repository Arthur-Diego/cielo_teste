/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gft.teste.cielo_teste.service;

import com.gft.teste.cielo_teste.model.ListaControleLancamento;
import com.gft.teste.cielo_teste.vo.ResponseView;
import com.gft.teste.cielo_teste.model.TotalControleLancamento;
import com.gft.teste.cielo_teste.repository.ListaControleLancamentoRepository;
import com.gft.teste.cielo_teste.vo.LancamentoPersonalizadoVo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Arthur
 */
@Service
public class LancamentoService {  
    
    @Autowired
    private ListaControleLancamentoRepository controleLancRepo;
    
    private List<ListaControleLancamento> resultLanc;
    
    private ResponseView viewAll;
    
    private List<LancamentoPersonalizadoVo> listLancamentoPersonalizadoVo;
    
    public List<ListaControleLancamento> recuperarTodosLancamentos(){
        return controleLancRepo.findAll();
    }
    
    private void tratamentoResponseLancamentos(){
       this.resultLanc = this.recuperarTodosLancamentos();
       
       this.viewAll = new ResponseView();
       TotalControleLancamento totalCont = new TotalControleLancamento();
       
       totalCont.setQuantidadeLancamentos(this.resultLanc.size());
       Double valorTotalLancamento = 0.0;
       Integer quantidadeLancamentos = 0;
       
       for(ListaControleLancamento cL : this.resultLanc){
           valorTotalLancamento += (cL.getQuantidadeLancamentoRemessa() * cL.getValorLancamentoRemessa());
           quantidadeLancamentos += cL.getQuantidadeLancamentoRemessa();
       }
       totalCont.setValorLancamentos(valorTotalLancamento);
       totalCont.setQuantidadeRemessas(quantidadeLancamentos);
       
       viewAll.setIndice(1);
       viewAll.setTotalControleLancamento(totalCont);
       viewAll.setListaControleLancamento(this.resultLanc);
       viewAll.setTotalElements(this.resultLanc.size());
       
    }
    
    private void tratamentoLancamentoPersonlizadoVo(){
        this.resultLanc = this.recuperarTodosLancamentos();
        
        LancamentoPersonalizadoVo lancPersonalizadoVo = null;
        
        this.listLancamentoPersonalizadoVo = new ArrayList<>();
        
        for(ListaControleLancamento cL : this.resultLanc){
            lancPersonalizadoVo = new LancamentoPersonalizadoVo();
            lancPersonalizadoVo.setDadosBancarios(cL.getNomeBanco() + " " + cL
                    .getLancamentoContaCorrenteCliente()
                    .getDadosDomicilioBancario().toString());
            lancPersonalizadoVo.setDescricao(cL.getDescricaoGrupoPagamento());
            lancPersonalizadoVo.setSituacao(cL.getLancamentoContaCorrenteCliente().getNomeSituacaoRemessa());
            lancPersonalizadoVo.setNumero(cL.getNumeroEvento().toString());
            lancPersonalizadoVo.setDataConfirmacao(cL.getDataEfetivaLancamento());
            lancPersonalizadoVo.setDataLancamento(cL.getDataLancamentoContaCorrenteCliente());
            Double valorFinal = cL.getValorLancamentoRemessa() * cL.getQuantidadeLancamentoRemessa();
            lancPersonalizadoVo.setValorFinal(valorFinal.toString());
            this.listLancamentoPersonalizadoVo.add(lancPersonalizadoVo);
        }
        
    }

    public ResponseView getView() {
        this.tratamentoResponseLancamentos();
        return viewAll;
    }

    public List<LancamentoPersonalizadoVo> getListLancamentoPersonalizadoVo() {
        this.tratamentoLancamentoPersonlizadoVo();
        return listLancamentoPersonalizadoVo;
    }
    
    
    
}
