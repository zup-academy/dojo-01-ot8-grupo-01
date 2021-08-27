package br.com.zup.edu.sitedeviagens.aeroporto;

import br.com.zup.edu.sitedeviagens.pais.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aeroportos")
public class AeroportoController {

    @Autowired
    private AeroportoRepository repository;
    @Autowired
    private PaisRepository paisRepository;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    private AeroportoResponse cadastrar(@RequestBody @Validated NovoAeroportoRequest novoAeroporto)
            throws Exception {
        Aeroporto aeroporto = novoAeroporto.toModel(paisRepository);
        return new AeroportoResponse(repository.save(aeroporto));
    }

}
