package TestBook;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtils.CreateAPI2;

public class VerifyPutMethod {
	
		@Test
		public void TestPutMethod() throws FileNotFoundException
		{
			CreateAPI2 obj1 = new CreateAPI2();
			obj1.postMethod();
					
		}
	

}
