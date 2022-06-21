package TestUser;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtils.CreateAPI4;

public class VerifyGetMethod {
		
		@Test(priority =3)
		public void GetTestMethod()
		{
			CreateAPI4 ref = new CreateAPI4();
			ref.getMethod();
		}
		
		public class VerifyPostMethod {
			
			@Test
			public void TestPostMethod() throws FileNotFoundException
			{
				CreateAPI4 obj = new CreateAPI4();
				obj.postMethod();
						
			}
			public void TestPutMethod() throws FileNotFoundException
			{
				CreateAPI4 obj1 = new CreateAPI4();
				obj1.postMethod();
						
			}
			public void TestDeleteMethod() throws FileNotFoundException {
				CreateAPI4 obj2 = new CreateAPI4();
				obj2.deleteMethod();
				
			}
		
		

		}

}
