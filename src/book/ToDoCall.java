package book;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/todo")
public class ToDoCall {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getTextText() {
		ToDo todo = new ToDo();
		todo.setDescription("TextDesc");
		todo.setSummary("TextSummary");
		return todo.summary + " " + todo.description;
	}
	@GET
	@Produces(MediaType.TEXT_XML)
	public String getTextApText() {
		ToDo todo = new ToDo();
		todo.setDescription("xmlDesc");
		todo.setSummary("XMLSummary");
		return todo.summary + " " + todo.description;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getTextJson() {
		ToDo todo = new ToDo();
		todo.setDescription("JsonDesc");
		todo.setSummary("JsonSummary");
		return todo.summary + " " + todo.description;
	}

}
