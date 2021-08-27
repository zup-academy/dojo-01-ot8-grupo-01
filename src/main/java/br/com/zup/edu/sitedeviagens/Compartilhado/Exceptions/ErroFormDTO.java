package br.com.zup.edu.sitedeviagens.Compartilhado.Exceptions;

public class ErroFormDTO {
    private String campo;
    private String erro;

    public ErroFormDTO(String campo, String erro) {
        this.campo = campo;
        this.erro = erro;
    }

    public String getCampo() {
        return campo;
    }

    public String getErro() {
        return erro;
    }
}
