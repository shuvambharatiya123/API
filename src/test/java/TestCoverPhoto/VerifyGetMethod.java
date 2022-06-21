package TestCoverPhoto;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtils.CreateAPI3;

public class VerifyGetMethod {
		
		@Test
		public void GetTestMethod()
		{
			CreateAPI3 ref = new CreateAPI3();
			ref.getMethod();
		}
		
		public class VerifyPostMethod {
			
			@Test
			public void TestPostMethod() throws FileNotFoundException
			{
				CreateAPI3 obj = new CreateAPI3();
				obj.postMethod();
						
			}
			public void TestPutMethod() throws FileNotFoundException
			{
				CreateAPI3 obj1 = new CreateAPI3();
				obj1.postMethod();
						
			}
			public void TestDeleteMethod() throws FileNotFoundException {
				CreateAPI3 obj2 = new CreateAPI3();
				obj2.deleteMethod();
				
			}
		
		

		}
}
