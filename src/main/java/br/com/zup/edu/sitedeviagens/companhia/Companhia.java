package br.com.zup.edu.sitedeviagens.companhia;

import br.com.zup.edu.sitedeviagens.pais.Pais;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
public class Companhia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    private LocalDateTime instanteCriacao = LocalDateTime.now();

    @ManyToOne
    private Pais pais;

    @Deprecated
    public Companhia() {
    }

    public Companhia(String nome, Pais pais) {
        this.nome = nome;
        this.pais = pais;
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
