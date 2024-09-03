package curdopertionUsingBddApproach;

import org.openqa.selenium.devtools.v120.fetch.model.AuthChallengeResponse.Response;
import org.testng.annotations.Test;

public class ConvertStringToJson {
	@Test
	public void readData() {
		baseURI="";
		Response resp=when().get();
		String data=resp.asString();
		Jsonpath jp=new Jsonpath(data);
		int id=jp.get("data.id");
		System.out.println(id);
		}
	
}
