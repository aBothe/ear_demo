package mypackage;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("/test")
public class MyService {
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String test() {
		return "<h1>Hello World!</h1>";
	}
}
