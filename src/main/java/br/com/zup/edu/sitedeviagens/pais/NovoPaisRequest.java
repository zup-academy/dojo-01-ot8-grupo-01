package br.com.zup.edu.sitedeviagens.pais;

import javax.validation.constraints.NotBlank;

public class NovoPaisRequest {

    @NotBlank
    private String nome;

    public String getNome() {
        return nome;
    }

    public Pais toModel() {
        return new Pais(nome);
    }
}
