package br.com.zup.edu.sitedeviagens.aeroporto;

import br.com.zup.edu.sitedeviagens.pais.Pais;

import java.time.LocalDateTime;

public class AeroportoResponse {

    private Long id;
    private String nome;
    private Pais pais;

    public AeroportoResponse(Aeroporto aeroporto) {
        this.id = aeroporto.getId();
        this.nome = aeroporto.getNome();
        this.pais = aeroporto.getPais();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }


    public Pais getPais() {
        return pais;
    }
}
