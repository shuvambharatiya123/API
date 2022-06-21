package demoAPI;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class demoAPI_put {

	public static void main(String[] args) throws FileNotFoundException {
		
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com").
		body(getFileContent("C:\\Users\\SHUVBHAR\\eclipse-workspace\\API\\src\\test\\resources\\CreateBooking.txt")).
		header("Accept","application/json").header("Content-Type","application/json").when()
		.log().all().put("/booking/750").then().log().all();//put
		// TODO Auto-generated method stub

	}
	public static String getFileContent(String filePath) throws FileNotFoundException
	{
		File file = new File(filePath);
		Scanner sc = new Scanner(file);
		sc.useDelimiter("\\Z");
		return sc.next();
	}

}
