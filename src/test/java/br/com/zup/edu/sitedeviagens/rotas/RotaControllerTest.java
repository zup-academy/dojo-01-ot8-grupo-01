package br.com.zup.edu.sitedeviagens.rotas;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@AutoConfigureMockMvc
@SpringBootTest
@ActiveProfiles("test")
public class RotaControllerTest {
    @Autowired
    private MockMvc mockMvc;

    Gson gson = new Gson();

    @Test
    public void quandoBodyNaoEnviadoRetornaBadRequest() throws Exception {
        mockMvc.perform(post("/rotas").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void quandoIdAeroportoNaoExisteRetornaBadRequest() throws Exception {
        //cenario
        RotaRequest rotaRequest = new RotaRequest("Rota1", 1L, 1L, 180);


        //ação
        mockMvc.perform(post("/rotas").accept(MediaType.APPLICATION_JSON)
                .content(gson.toJson(rotaRequest))
                .contentType(MediaType.APPLICATION_JSON))
                //asserts
                .andExpect(status().isBadRequest())
                .andExpect(MockMvcResultMatchers.jsonPath("$.[0].campo").value("aeroportoDestinoId"));
    }

}
