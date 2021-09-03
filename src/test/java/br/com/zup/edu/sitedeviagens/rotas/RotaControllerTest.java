package br.com.zup.edu.sitedeviagens.rotas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@AutoConfigureMockMvc
@SpringBootTest
@ActiveProfiles("test")
public class RotaControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testaAeroportosIguais() throws Exception {


        mockMvc.perform(post("/rotas").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest());
    }

}
