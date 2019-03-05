package com.example.swagger.config;

import com.example.swagger.resources.MainResource;
import com.example.swagger.resources.TestApiResponseResource;
import io.swagger.v3.jaxrs2.integration.resources.OpenApiResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;

@Configuration
@ApplicationPath("api/v1")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {

        register(OpenApiResource.class);
        register(MainResource.class);
        register(TestApiResponseResource.class);

    }
}
