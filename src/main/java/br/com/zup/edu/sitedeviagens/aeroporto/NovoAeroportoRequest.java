package br.com.zup.edu.sitedeviagens.aeroporto;

import br.com.zup.edu.sitedeviagens.compartilhado.validators.CampoUnico;
import br.com.zup.edu.sitedeviagens.compartilhado.validators.ExistisId;
import br.com.zup.edu.sitedeviagens.pais.Pais;
import br.com.zup.edu.sitedeviagens.pais.PaisRepository;

import javax.validation.constraints.NotBlank;

public class NovoAeroportoRequest {

    @NotBlank @CampoUnico(classe = Aeroporto.class, nomeCampo = "nome", message = "Esse aeroporto já está cadastrado")
    private String nome;

    @ExistisId(classe = Pais.class)
    private Long paisId;

    public Aeroporto toModel(PaisRepository paisRepository) {
        Pais pais = paisRepository.findById(paisId).get();
        return new Aeroporto(nome, pais);
    }

	public String getNome() {
		return nome;
	}

	public Long getPaisId() {
		return paisId;
	}
}
