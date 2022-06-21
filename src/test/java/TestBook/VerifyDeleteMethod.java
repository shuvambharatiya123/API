package TestBook;

import org.testng.annotations.Test;

import ApiUtils.CreateAPI2;

public class VerifyDeleteMethod {
	
	@Test
	public void TestDeleteMethod() {
		CreateAPI2 obj2 = new CreateAPI2();
		obj2.deleteMethod();
		
	}


}
