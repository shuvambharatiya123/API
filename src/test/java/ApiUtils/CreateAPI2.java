package ApiUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class CreateAPI2 {
	public void getMethod()
	{
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net").
		when().log().all().get("/api/v1/Books").then().log().all().assertThat().statusCode(200);
	}
	public void postMethod() throws FileNotFoundException
	{
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net").
		body(getFileContent("C:\\Users\\SHUVBHAR\\eclipse-workspace\\API\\src\\test\\resources\\CreateBook.txt")).
		header("Accept","application/json").header("Content-Type","application/json").
		when().log().all().post("/api/v1/Books").then().log().all();
	}
	public void putMethod() throws FileNotFoundException
	{
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net").
		body(getFileContent("C:\\Users\\SHUVBHAR\\eclipse-workspace\\API\\src\\test\\resources\\PutBook.txt")).
		header("Accept","application/json").header("Content-Type","application/json").
		when().log().all().put("/api/v1/Books").then().log().all();
	}
	public void deleteMethod()
	{
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net").
		headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().
		delete("/api/v1/Books/193").then().log().all().assertThat().statusCode(201);
	}
	public static String getFileContent(String filePath) throws FileNotFoundException
	{
		File file = new File(filePath);
		Scanner sc = new Scanner(file);
		sc.useDelimiter("\\Z");
		return sc.next();
	}
	

}
