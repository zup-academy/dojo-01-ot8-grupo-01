package br.com.zup.edu.sitedeviagens.companhia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.edu.sitedeviagens.pais.PaisRepository;

@RestController
@RequestMapping("/companhias")
public class CompanhiaController {

    @Autowired
    private CompanhiaRepository repository;
    @Autowired
    private PaisRepository paisRepository;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    private CompanhiaResponse cadastrar(@RequestBody @Validated NovaCompanhiaRequest novaCompanhia)
            throws Exception {
        Companhia companhia = novaCompanhia.toModel(paisRepository);
        return new CompanhiaResponse(repository.save(companhia));
    }

}
