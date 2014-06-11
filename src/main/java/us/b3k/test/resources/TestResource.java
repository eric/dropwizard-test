package us.b3k.test.resources;

import us.b3k.test.core.TestThingParam;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/")
public class TestResource {

    public TestResource() {}

    @GET
    public Response test(@QueryParam("test") @Valid TestThingParam testThing) {
        return Response.ok().build();
    }
}
