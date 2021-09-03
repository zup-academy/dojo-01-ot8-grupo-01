package br.com.zup.edu.sitedeviagens.compartilhado.exceptions;

public class ErroMessageResponseDTO {
    private String erro;

    public ErroMessageResponseDTO(String erro) {
        this.erro = erro;
    }


    public String getErro() {
        return erro;
    }
}
