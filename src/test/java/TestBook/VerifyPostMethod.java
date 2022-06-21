package TestBook;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtils.CreateAPI2;

public class VerifyPostMethod {
	
	@Test
	public void TestPostMethod() throws FileNotFoundException
	{
		CreateAPI2 obj = new CreateAPI2();
		obj.postMethod();
				
	}

}
