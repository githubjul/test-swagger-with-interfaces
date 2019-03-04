package com.example.swagger.resources;

import com.example.swagger.api.AggregateEndpoint;
import com.example.swagger.api.FirstEndpoint;
import com.example.swagger.api.SecondEndpoint;
import org.springframework.stereotype.Component;

import javax.ws.rs.Path;

@Path("/test")
@Component
public class MainResource
    implements AggregateEndpoint<SampleDTO,SampleOtherDTO> {
}
