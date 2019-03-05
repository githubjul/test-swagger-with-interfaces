package com.example.swagger.resources;


import com.example.swagger.api.FirstEndpoint;
import com.example.swagger.api.SecondEndpoint;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import javax.ws.rs.Path;

@Path("/testresponse")
@Tag(name = "Test response messages")
public class TestApiResponseResource
    implements FirstEndpoint<SampleDTO>,
        SecondEndpoint<SampleOtherDTO> {
    @Override
    public String firstEndpoint(SampleDTO param) {
        return "firstEndpoint Implemented !";
    }

    @Override
    @ApiResponse(responseCode = "404", description = "I said : not Found")
    public String secondEnpoint(SampleOtherDTO param) {
        return "secondEnpoint Implemented !";
    }
}
