package br.com.zup.edu.sitedeviagens.rotas;

import br.com.zup.edu.sitedeviagens.aeroporto.Aeroporto;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Entity
public class Rota {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne @NotNull
    private Aeroporto aeroportoOrigem;

    @ManyToOne @NotNull
    private Aeroporto aeroportoDestino;

    @Positive @NotNull
    private int duracaoMinutos;

    public Rota(String nome, Aeroporto aeroportoOrigem, Aeroporto aeroportoDestino, int duracaoMinutos) {
        this.nome = nome;
        this.aeroportoOrigem = aeroportoOrigem;
        this.aeroportoDestino = aeroportoDestino;
        this.duracaoMinutos = duracaoMinutos;
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
