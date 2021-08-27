package br.com.zup.edu.sitedeviagens.companhia;

import br.com.zup.edu.sitedeviagens.pais.Pais;

import java.time.LocalDateTime;

public class CompanhiaResponse {

    private Long id;
    private String nome;
    private LocalDateTime instanteCriacao;
    private Pais pais;

    public CompanhiaResponse(Companhia companhia) {
        this.id = companhia.getId();
        this.nome = companhia.getNome();
        this.instanteCriacao = companhia.getInstanteCriacao();
        this.pais = companhia.getPais();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDateTime getInstanteCriacao() {
        return instanteCriacao;
    }

    public Pais getPais() {
        return pais;
    }
}
