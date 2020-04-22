/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gft.teste.cielo_teste.rest;

import com.gft.teste.cielo_teste.vo.ResponseView;
import com.gft.teste.cielo_teste.service.LancamentoService;
import com.gft.teste.cielo_teste.vo.LancamentoPersonalizadoVo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Arthur
 */
@RestController
@RequestMapping("/lancamentos")
public class LancamentoRestController {
    
    @Autowired
    private LancamentoService lancService;
    
    @GetMapping
    public ResponseEntity<ResponseView> listarLancamentos() {
        return Optional.ofNullable(lancService.getView()).map(lancamento -> ResponseEntity.ok().body(lancamento)).orElseGet(() -> ResponseEntity.notFound().build());
    }
    
    @GetMapping("/resumo")
    public ResponseEntity<List<LancamentoPersonalizadoVo>> listarLancamentosResumo() {
        return Optional.ofNullable(lancService.getListLancamentoPersonalizadoVo()).map(lancamentoVo -> ResponseEntity.ok().body(lancamentoVo)).orElseGet(() -> ResponseEntity.notFound().build());
    }
    
    
}
