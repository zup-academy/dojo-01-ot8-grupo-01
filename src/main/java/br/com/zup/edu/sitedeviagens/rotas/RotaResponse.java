package br.com.zup.edu.sitedeviagens.rotas;

import br.com.zup.edu.sitedeviagens.aeroporto.Aeroporto;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class RotaResponse {

    private Long id;
    private String nome;
    private Aeroporto aeroportoOrigem;
    private Aeroporto aeroportoDestino;
    private int duracaoMinutos;

    public RotaResponse(Rota rota) {
        this.id = rota.getId();
        this.nome = rota.getNome();
        this.aeroportoOrigem = rota.getAeroportoOrigem();
        this.aeroportoDestino = rota.getAeroportoDestino();
        this.duracaoMinutos = rota.getDuracaoMinutos();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Aeroporto getAeroportoOrigem() {
        return aeroportoOrigem;
    }

    public Aeroporto getAeroportoDestino() {
        return aeroportoDestino;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }
}
