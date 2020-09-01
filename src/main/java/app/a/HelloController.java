package app.a;

import io.jooby.annotations.GET;
import io.jooby.annotations.Path;

@Path("hello")
public class HelloController {

    @GET
    public String hi(){
        return "hi";
    }
}
