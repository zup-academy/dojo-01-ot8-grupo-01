package br.com.zup.edu.sitedeviagens.rotas;

import br.com.zup.edu.sitedeviagens.aeroporto.AeroportoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/rotas")
public class RotaController {

    @Autowired
    private RotaRepository rotaRepository;

    @Autowired
    private AeroportoRepository aeroportoRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrar (@RequestParam @Valid RotaRequest rotaRequest){
        Rota rota = rotaRequest.toModel(aeroportoRepository);

    }
}
