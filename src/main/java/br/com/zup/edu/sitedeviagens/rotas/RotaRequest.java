package br.com.zup.edu.sitedeviagens.rotas;

import br.com.zup.edu.sitedeviagens.aeroporto.Aeroporto;
import br.com.zup.edu.sitedeviagens.aeroporto.AeroportoRepository;
import br.com.zup.edu.sitedeviagens.compartilhado.validators.ExistisId;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class RotaRequest {

    private String nome;

    @ManyToOne @NotNull @ExistisId(classe = Aeroporto.class)
    private Long aeroportoOrigemId;

    @ManyToOne @NotNull @ExistisId(classe = Aeroporto.class)
    private Long aeroportoDestinoId;

    @Positive @NotNull
    private int duracaoMinutos;

    public Rota toModel(AeroportoRepository aeroportoRepository ){
        Aeroporto aeroportoOrigem = aeroportoRepository.findById(aeroportoOrigemId).get();
        Aeroporto aeroportoDestino = aeroportoRepository.findById(aeroportoDestinoId).get();
        if(nome.isBlank()){
            nome = aeroportoOrigem.getNome() + " - " + aeroportoDestino.getNome();
        }
        Rota rota = new Rota(nome, aeroportoOrigem, aeroportoDestino, duracaoMinutos);
        return rota;
    }

    public String getNome() {
        return nome;
    }

    public Long getAeroportoOrigemId() {
        return aeroportoOrigemId;
    }

    public Long getAeroportoDestinoId() {
        return aeroportoDestinoId;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

}
