package demoAPI;

import io.restassured.RestAssured;

public class demoAPI_delete {

	public static void main(String[] args) {
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com").
		headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().
		delete("/booking/339").then().log().all().assertThat().statusCode(201);
		
		
		
		

	}

}
