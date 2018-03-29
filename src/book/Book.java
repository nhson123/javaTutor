package book;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/book") // URI
public class Book {
	@GET
	@Produces(MediaType.TEXT_HTML) // XML
	//@Path("{name}")
	public String sayHell0HTML(@QueryParam("name") String name, @QueryParam("stimmung") String stimmung,
			@QueryParam("grad") int grad) {
		String response = "<h1> Hallo HTML: "+ name +", Stimmung: " +stimmung+", Grad: "+grad+"!<h1>";
		return response;
	}

	@GET
	@Produces(MediaType.TEXT_XML) // XML
	//@Path("{name}")
	public String sayHelloXML() {
		String response = "<?xml version = '1.0'?>" + 
	"<hello> Hello XML </hello>";
		return response;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON) // Json
	public String sayHelloJSON() {
		String response = "{\"widget\": {\r\n" + 
				"    \"debug\": \"on\",\r\n" + 
				"    \"window\": {\r\n" + 
				"        \"title\": \"Sample Konfabulator Widget\",\r\n" + 
				"        \"name\": \"main_window\",\r\n" + 
				"        \"width\": 500,\r\n" + 
				"        \"height\": 500\r\n" + 
				"    },\r\n" + 
				"    \"image\": { \r\n" + 
				"        \"src\": \"Images/Sun.png\",\r\n" + 
				"        \"name\": \"sun1\",\r\n" + 
				"        \"hOffset\": 250,\r\n" + 
				"        \"vOffset\": 250,\r\n" + 
				"        \"alignment\": \"center\"\r\n" + 
				"    },\r\n" + 
				"    \"text\": {\r\n" + 
				"        \"data\": \"Click Here\",\r\n" + 
				"        \"size\": 36,\r\n" + 
				"        \"style\": \"bold\",\r\n" + 
				"        \"name\": \"text1\",\r\n" + 
				"        \"hOffset\": 250,\r\n" + 
				"        \"vOffset\": 100,\r\n" + 
				"        \"alignment\": \"center\",\r\n" + 
				"        \"onMouseUp\": \"sun1.opacity = (sun1.opacity / 100) * 90;\"\r\n" + 
				"    }\r\n" + 
				"}}";
		return response;
	}

}
