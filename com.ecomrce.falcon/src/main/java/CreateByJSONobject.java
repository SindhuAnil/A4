import static io.restassured.RestAssured.*;
public class CreateByJSONobject{
public void createRequest() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sindhu\\Desktop\\Selenium work space\\chromedriver-win64\\chromedriver.exe");
	JSONObject obj=new JSONObject();
	obj.put("name","sindhu");
	obj.put("job","student");
	.given().body(obj).contentType(contentType.JSON)
	.when().post("")
	.then().assertThat().statuscode(201)
	.log().all();
	
}
}
