package com.example.desafio_itau.controller;

import com.example.desafio_itau.dto.request.RecebeTransacaoRequest;
import com.example.desafio_itau.service.TransacaoService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {

    private TransacaoService TransacaoService;

    @PostMapping
    public ResponseEntity<Void> recebeTransacao(RecebeTransacaoRequest request){
        
        TransacaoService.salvaTransacao(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
