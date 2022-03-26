package service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import dao.TaskDAO;
import model.Task;

@Path("/task")
public class TaskService {
	TaskDAO tDAO = new TaskDAO();
	
	@GET
    @Path("/hello")
    @Produces("text/plain")
    public String hello(){
        return "Path is working";    
    }
	
	@POST
	@Path("/add")
	@Produces("application/json")
	@Consumes("application/json")
	public String addTask(Task aTask) {
		tDAO.persistTask(aTask);
		return aTask.getTaskBody() + "has been added to the database";
	}
	
	@GET
	@Path("/all")
	@Produces("application/json")
	public List<Task> getTaskList(){
		return tDAO.getAllTasks();
	}
	
}
