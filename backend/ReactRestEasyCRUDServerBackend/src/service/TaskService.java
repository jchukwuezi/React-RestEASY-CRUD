package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/task")
public class TaskService {
	@GET
    @Path("/hello")
    @Produces("text/plain")
    public String hello(){
        return "Path is working";    
    }
}
