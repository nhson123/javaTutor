package bookClient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import java.net.URI;

import com.sun.xml.internal.ws.api.message.Message;

public class BookClient {

	public static void main(String[] args) {
		bookRequest();
		todoRequest();
	}

	public static void bookRequest() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(getBaseURI());
		Response response = target.path("book").request().accept(MediaType.TEXT_XML).get(Response.class);
		System.out.println(response.toString());
		System.out.println(target.path("book").request(MediaType.TEXT_XML).get(String.class));
		System.out.println(target.path("book").queryParam("name", "Son").queryParam("stimmung", "gut")
				.queryParam("grad", 1).request(MediaType.TEXT_HTML).get(String.class));
		System.out.println(target.path("book").request(MediaType.APPLICATION_JSON).get(String.class));
	}

	public static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost:8080/RestWS/").build();
	}

	public static void todoRequest() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(getBaseURI());
		System.out.println(target.path("todo").request(MediaType.TEXT_PLAIN).get(String.class));
		System.out.println(target.path("todo").request(MediaType.TEXT_XML).get(String.class));
		System.out.println(target.path("todo").request(MediaType.APPLICATION_JSON).get(String.class));
	}

}
