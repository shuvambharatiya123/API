package Test;

import org.testng.annotations.Test;

import ApiUtils.CreateAPI;

public class VerifyDeleteMethod {
	
	@Test
	public void TestDeleteMethod() {
		CreateAPI obj1=new CreateAPI();
		obj1.deleteMethod();
	}

}
