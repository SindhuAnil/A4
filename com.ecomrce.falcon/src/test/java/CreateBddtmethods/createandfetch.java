package CreateBddtmethods;

import com.github.dockerjava.transport.DockerHttpClient.Response;

public class createandfetch {
 public void modofyandRead() {
	 baseURI="";
	 JSONobject obj=new JSONobject();
	 obj.put("name","sindhu");
	 obj.put("job","singer");
	 given().body(obj).contentType(contentType.JSON).when().put()
	 .then().assertThat().statuscode(200)
	 .log().all();
	 Response resp=when().get();
	 String data1=resp.asString();
	 System.out.println(data1);
	 System.out.println("----------");
	 System.out.println(resp.getStatusCode());
	 System.out.println(resp.getcontentType());
	 System.out.println(resp.getTime());
	 
	 
	 
 }
}
