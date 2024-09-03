
import java.util.HashMap;

import org.apache.hc.core5.http.ContentType;
import org.testng.annotations.Test;
																																		

public class CreateRequest {
	@Test
	
	public void createrequest()
	{
	HashMap hm=new HashMap();
	hm.put("name", "raja");
	hm.put("job", "manager");

	given().body(hm).contentType(ContentType.json)
	.when().post("https://reqres.in/api/useres")
	.then().assertThat().statusCode(201).log().all();
	
	}

}
