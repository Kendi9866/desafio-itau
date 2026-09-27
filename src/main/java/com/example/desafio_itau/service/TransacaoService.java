package com.example.desafio_itau.service;

import com.example.desafio_itau.domain.Transacao;
import com.example.desafio_itau.dto.request.RecebeTransacaoRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class TransacaoService {

    private final CopyOnWriteArrayList<Transacao> transacaoArray = new CopyOnWriteArrayList<>();


    public void salvaTransacao(RecebeTransacaoRequest request){
        Transacao transacao = new Transacao(request.valor(), request.dataHora());
        transacaoArray.add(transacao);
    }
}
