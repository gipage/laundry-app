package com.gipage.laundryapp.controllers;


import com.gipage.laundryapp.LaundryAppApplicationTests;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class HealthRestControllerTest extends LaundryAppApplicationTests {
    @SneakyThrows
    @Test
    void healthCheck() {
        mockMvc
                .perform(get("/actuator/health"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/vnd.spring-boot.actuator.v3+json"))
                .andReturn();
    }
}
