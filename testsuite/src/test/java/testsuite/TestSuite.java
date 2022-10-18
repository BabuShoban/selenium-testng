package testsuite;

import org.testng.annotations.Test;

public class TestSuite extends OrderProducts {
	

	@Test
	public void ToVerifyProductsAddedToCartSucccessfully() {
		
		goToYourLogoPage();
		clickFirstProductInHomePage();
		selectSizeFromDropDown();
		clickAddToCartButton();
		assertProductAddedMessageIsDisplyed();
		clickProccedToCheckOutButton();
		
		
	}

}
