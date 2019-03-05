package com.example.swagger.resources;

import com.example.swagger.api.AggregateEndpoint;
import com.example.swagger.api.FirstEndpoint;
import com.example.swagger.api.SecondEndpoint;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Component;

import javax.ws.rs.Path;

@Path("/test")
@Component
@Tag(name = "Test inheritance on default implementation in interfaces")
public class MainResource
    implements AggregateEndpoint<SampleDTO,SampleOtherDTO> {
}
