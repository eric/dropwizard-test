package us.b3k.test.resources;

import us.b3k.test.core.TestThingParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/")
public class TestResource {

    public TestResource() {}

    @GET
    public Response test(@QueryParam("test") TestThingParam testThing) {
        return Response.ok().build();
    }
}
