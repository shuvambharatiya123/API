package TestBook;

import org.testng.annotations.Test;


import ApiUtils.CreateAPI2;

public class VerifyGetMethod extends CreateAPI2 {
	@Test
	public void GetTestMethod()
	{
		CreateAPI2 ref = new CreateAPI2();
		ref.getMethod();
	}
	
		

}
