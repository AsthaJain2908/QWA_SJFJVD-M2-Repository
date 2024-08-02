package POMPackage;

import java.io.IOException;

public class ValidLoginIntoActitime extends BaseTest{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BaseTest test = new BaseTest();
		test.setup();
		
		LoginPage lp = new LoginPage(driver);
		// we have made driver as static variable so that we can access directly
		
		// to import data from excel		
		Flib fd = new Flib();
		
		// calling the method of LoginPage for entering username & Password
		lp.loginIntoActiTime(fd.getDataFromExcelSheet(ExcelPath, SheetName, 1,0), 
				fd.getDataFromExcelSheet(ExcelPath, SheetName, 1, 0));
		
		test.tearDown();
	}
}
