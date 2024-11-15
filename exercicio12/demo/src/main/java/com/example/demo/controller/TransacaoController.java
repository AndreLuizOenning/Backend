package com.example.demo.controller;

import com.example.demo.dto.ContaDTO;
import com.example.demo.dto.TransacaoRequestDTO;
import com.example.demo.dto.TransacaoResponseDTO;
import com.example.demo.mapper.ContaMapper;
import com.example.demo.model.Conta;
import com.example.demo.service.TransacoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    @Autowired
    private TransacoesService transacoesService;

    @PostMapping("/gerar")
    public ResponseEntity<TransacaoResponseDTO> gerarTransacao(@RequestBody TransacaoRequestDTO request) {
        Conta origem = transacoesService.findContaByCodigo(request.getOrigem());
        Conta destino = transacoesService.findContaByCodigo(request.getDestino());

        if (origem == null || destino == null) {
            return ResponseEntity.badRequest().build();
        }

        TransacaoResponseDTO responseDTO = new TransacaoResponseDTO();
        responseDTO.setOrigem(ContaMapper.toDTO(origem));
        responseDTO.setDestino(ContaMapper.toDTO(destino));
        responseDTO.setValor(request.getValor());

        return ResponseEntity.ok(responseDTO);
    }
}
