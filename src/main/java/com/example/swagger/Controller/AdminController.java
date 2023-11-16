package com.example.swagger.Controller;

import com.example.swagger.Pojo.Request.Request;
import com.example.swagger.Pojo.Response.Response;
import com.example.swagger.Pojo.SubModel.Details;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
//@Api(value = "Admin Controller", tags = "Admin Controller")
public class AdminController {

    @Operation(summary = "Get", description = "Get example Data")
    @ApiResponses(
            value = {
                    @ApiResponse(
                            responseCode = "200", description = "Success",
                            content = {@Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = Response.class))}
                    ),
                    @ApiResponse(
                            responseCode = "400", description = "Bad Request",
                            content = {@Content(mediaType = "application/json")}
                    ),
                    @ApiResponse(
                            responseCode = "500", description = "Internal Server Error",
                            content = {@Content(mediaType = "application/json")}
                    )
            }
    )
    @GetMapping("/get")
//    @ApiOperation(value = "Get example Admin", notes = "Get example data from the API")
    public String get() {
        return "Hello Admin";
    }

    @Operation(summary = "Post", description = "Post example Data")
    @ApiResponses(
            value = {
                    @ApiResponse(
                            responseCode = "200", description = "Success",
                            content = {@Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = Response.class))}
                    ),
                    @ApiResponse(
                            responseCode = "400", description = "Bad Request",
                            content = {@Content(mediaType = "application/json")}
                    ),
                    @ApiResponse(
                            responseCode = "500", description = "Internal Server Error",
                            content = {@Content(mediaType = "application/json")}
                    )
            }
    )
    @PostMapping("/post")
//    @ApiOperation(value = "Post example Admin", notes = "Post example data from the API")
    public Response post(@RequestBody Request request) {
        Response response = new Response();
        Details details = new Details();
        details.setFullName("Your Full Name");
        details.setUsername(request.getUsername());
        details.setEmail("YourEmail@gmail.com");
        details.setRole("Admin");

        response.setDetails(details);
        return response;
    }
}
