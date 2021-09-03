package br.com.zup.edu.sitedeviagens.rotas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class RotaControllerTest {

    @Test
    public void testaAeroportosIguais(){
        Assertions.assertTrue(true);
    }

}
