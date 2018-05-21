package com.mycompany;

import org.jooby.Request;
import org.jooby.Response;
import org.jooby.mvc.GET;
import org.jooby.mvc.Path;
import org.jooby.mvc.Produces;

@Path("/")
public class MyRoute {
    @GET
    public String myApi(Request req, Response res, MyParams params){
        return params.toString();
    }
}
