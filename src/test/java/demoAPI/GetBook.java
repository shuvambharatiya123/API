package demoAPI;

import io.restassured.RestAssured;

public class GetBook {

	public static void main(String[] args) {
		
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net").
		when().log().all().get("/api/v1/Books").then().log().all().assertThat().statusCode(200);		

	}

}
