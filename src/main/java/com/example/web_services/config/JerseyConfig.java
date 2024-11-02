package com.example.web_services.config;

import com.example.web_services.controller.CompteRestJaxRSAPI;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(CompteRestJaxRSAPI.class);
    }
}
