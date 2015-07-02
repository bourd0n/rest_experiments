package alex.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

@Path("/hello")
public class HelloWorldService {

    @GET
    @Path("/{param}")
    public Response getMsg(@PathParam("param") String msg) {
        String output = "Jersey say : " + msg;
        return Response.status(200).entity(output).build();
    }

    @GET
    @Path("/sb/{param}")
    @Produces(MediaType.APPLICATION_JSON)
    public SourceBean getSB(@PathParam("param") String id) {
        SourceBean sb = new SourceBean();
        sb.setId(new BigInteger(id));
        sb.setTitle("hello");
        Map<Class, Object> inMap = new HashMap<>();
        EmBean1 emBean1 = new EmBean1();
        emBean1.setName("em1");
        inMap.put(EmBean1.class, emBean1);
        EmbeddedMap embeddedMap = new EmbeddedMap();
        embeddedMap.setEmbedded(inMap);
        sb.setMap(embeddedMap);
        return sb;
    }

    @POST
    @Path("/sb/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postSB(SourceBean sb){
        Object object = sb.getMap().getEmbedded().get(EmBean1.class);
        EmBean1 object1 = (EmBean1) object;
        return Response.status(200).entity(sb.toString()).build();
    }

}