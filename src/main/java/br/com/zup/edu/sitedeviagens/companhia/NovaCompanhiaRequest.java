package br.com.zup.edu.sitedeviagens.companhia;

import br.com.zup.edu.sitedeviagens.Compartilhado.ExistisId;
import br.com.zup.edu.sitedeviagens.Compartilhado.Validators.CampoUnico;
import br.com.zup.edu.sitedeviagens.pais.Pais;
import br.com.zup.edu.sitedeviagens.pais.PaisRepository;

import javax.validation.constraints.NotBlank;
import java.util.Optional;

public class NovaCompanhiaRequest {

    @NotBlank @CampoUnico(classe = Companhia.class, nomeCampo = "nome")
    private String nome;

    @ExistisId(classe = Companhia.class)
    private Long paisId;

    public Companhia toModel(PaisRepository paisRepository) {
        Pais pais = paisRepository.findById(paisId).get();
        return new Companhia(nome, pais);
    }
}
