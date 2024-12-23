package com.example.demo.dto;

public class TransacaoResponseDTO {
    private ContaDTO origem;
    private ContaDTO destino;
    private Double valor;

    // Getters e Setters
    public ContaDTO getOrigem() {
        return origem;
    }

    public void setOrigem(ContaDTO origem) {
        this.origem = origem;
    }

    public ContaDTO getDestino() {
        return destino;
    }

    public void setDestino(ContaDTO destino) {
        this.destino = destino;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
