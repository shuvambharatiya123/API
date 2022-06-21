package demoAPI;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class PostBook {

	public static void main(String[] args) throws FileNotFoundException {
		
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net").
		body(getFileContent("C:\\Users\\SHUVBHAR\\eclipse-workspace\\API\\src\\test\\resources\\CreateBook.txt")).
		header("Accept","application/json").header("Content-Type","application/json").
		when().log().all().post("/api/v1/Books").then().log().all();
		

	}
	public static String getFileContent(String filePath) throws FileNotFoundException
	{
		File file = new File(filePath);
		Scanner sc = new Scanner(file);
		sc.useDelimiter("\\Z");
		return sc.next();
	}

}
