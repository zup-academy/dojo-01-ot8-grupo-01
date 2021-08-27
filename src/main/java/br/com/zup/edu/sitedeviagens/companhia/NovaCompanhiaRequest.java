package br.com.zup.edu.sitedeviagens.companhia;

import br.com.zup.edu.sitedeviagens.compartilhado.validators.ExistisId;
import br.com.zup.edu.sitedeviagens.compartilhado.validators.CampoUnico;
import br.com.zup.edu.sitedeviagens.pais.Pais;
import br.com.zup.edu.sitedeviagens.pais.PaisRepository;

import javax.validation.constraints.NotBlank;

public class NovaCompanhiaRequest {

    @NotBlank @CampoUnico(classe = Companhia.class, nomeCampo = "nome", message = "Essa Campanhia já está cadastrada")
    private String nome;

    @ExistisId(classe = Pais.class)
    private Long paisId;

    public Companhia toModel(PaisRepository paisRepository) {
        Pais pais = paisRepository.findById(paisId).get();
        return new Companhia(nome, pais);
    }

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the paisId
	 */
	public Long getPaisId() {
		return paisId;
	}

	/**
	 * @param paisId the paisId to set
	 */
	public void setPaisId(Long paisId) {
		this.paisId = paisId;
	}
    
    
}
