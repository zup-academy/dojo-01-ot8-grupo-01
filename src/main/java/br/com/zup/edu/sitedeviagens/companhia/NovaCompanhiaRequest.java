package br.com.zup.edu.sitedeviagens.companhia;

import br.com.zup.edu.sitedeviagens.pais.Pais;
import br.com.zup.edu.sitedeviagens.pais.PaisRepository;

import java.util.Optional;

public class NovaCompanhiaRequest {

    private String nome;

    private Long paisId;

    public Companhia toModel(PaisRepository paisRepository) {
        Optional<Pais> pais = paisRepository.findById(paisId);
        return new Companhia();
    }
}
