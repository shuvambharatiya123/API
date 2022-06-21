package demoAPI;

import io.restassured.RestAssured;

public class demoAPI_GetBooking {

	public static void main(String[] args) {
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com").
		when().log().all().get("/booking/750").then().log().all().assertThat().statusCode(200);// getbooking
		

	}

}
