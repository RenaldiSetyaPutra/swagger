package com.example.swagger.Controller;

import com.example.swagger.Pojo.Request.Request;
import com.example.swagger.Pojo.Response.Response;
import com.example.swagger.Pojo.SubModel.Details;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
//@Api(value = "User Controller", tags = "User Controller")
public class UserController {

    @GetMapping("/get")
//    @ApiOperation(value = "Get example User", notes = "Post example data from the API")

    public String get(){
        return "Hello User";
    }

    @PostMapping("/post")
//    @ApiOperation(value = "Post example User", notes = "Post example data from the API")
    public Response post(@RequestBody Request request){
        Response response = new Response();
        Details details = new Details();
        details.setFullName("Your Full Name");
        details.setUsername(request.getUsername());
        details.setEmail("YourEmail@gmail.com");
        details.setRole("User");

        response.setDetails(details);
        return response;
    }
}
