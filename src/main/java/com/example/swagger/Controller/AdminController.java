package com.example.swagger.Controller;

import com.example.swagger.Pojo.Request.Request;
import com.example.swagger.Pojo.Response.Response;
import com.example.swagger.Pojo.SubModel.Details;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@Api(value = "Admin Controller", tags = "Admin Controller")
public class AdminController {
    @GetMapping("/get")
    @ApiOperation(value = "Get example Admin", notes = "Get example data from the API")
    public String get(){
        return "Hello Admin";
    }

    @PostMapping("/post")
    @ApiOperation(value = "Post example Admin", notes = "Post example data from the API")
    public Response post(@RequestBody Request request){
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
