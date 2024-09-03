package CreateBddtmethods;

import org.testng.annotations.Test;

import com.github.dockerjava.transport.DockerHttpClient.Response;

public class FetchDatausingJsonpath {
	@Test
	
public void fetchusingjsonpath() {
	String baseURI = "";
	Response resp=when().get("");
	String obj=resp.jsonpath().get("Data.name");
	System.out.println(obj);
}


}
