package com.example.demo;

import com.example.demo.test.controller.DesingnTacoController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(DesingnTacoController.class)
public class TacoCloudApplicationTests extends MockMvcRequestBuilders {

    @Autowired
    private MockMvc mockMvc;
    @Test
    public void contextLoads() throws Exception {
        mockMvc.perform(get("/design")).andExpect(status().isOk());
    }
}
