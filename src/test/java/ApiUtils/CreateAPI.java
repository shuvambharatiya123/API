package ApiUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class CreateAPI {
	public void getMethod()
	{
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com").
		when().log().all().get("/booking").then().log().all().assertThat().statusCode(200);
	}
	public void deleteMethod()
	{
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com").
		headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().
		delete("/booking/11").then().log().all().assertThat().statusCode(201);
	}
	
	public void createMethod() throws FileNotFoundException
	{
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com").
		body(getFileContent("C:\\Users\\SHUVBHAR\\eclipse-workspace\\API\\src\\test\\resources\\CreateBooking.txt")).
		header("Accept","application/json").header("Content-Type","application/json").
		when().log().all().post("/booking/1213").then().log().all();
		
	}
	public static String getFileContent(String filePath) throws FileNotFoundException
	{
		File file = new File(filePath);
		Scanner sc = new Scanner(file);
		sc.useDelimiter("\\Z");
		return sc.next();
	}

}
