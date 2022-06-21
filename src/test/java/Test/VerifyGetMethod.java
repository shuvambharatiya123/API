package Test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtils.CreateAPI;

public class VerifyGetMethod {
	
	@Test
	public void TestGetMethod()
	{
		CreateAPI obj= new CreateAPI();
		obj.getMethod();		
	}
	
	
	@Test(priority =3)
	public void CreateMethod() throws FileNotFoundException
	{
		CreateAPI obj = new CreateAPI();
		obj.createMethod();
	}
	
	
	@Test
	public void DeleteMethod()
	{
		CreateAPI obj = new CreateAPI();
		obj.deleteMethod();
	}

}
