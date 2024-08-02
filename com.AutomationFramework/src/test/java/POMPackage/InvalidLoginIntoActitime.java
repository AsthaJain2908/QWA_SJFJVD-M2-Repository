package POMPackage;

import java.io.IOException;

public class InvalidLoginIntoActitime extends BaseTest{
	
public static void main(String[] args) throws IOException {
		
		BaseTest test = new BaseTest();
		test.setup();
		
		LoginPage lp = new LoginPage(driver);
		// we have made driver as static variable so that we can access directly
		
		// to import data from excel		
		Flib fd = new Flib();
		
		int rowcnt = fd.getRowCount(ExcelPath, InvalidSheetName);
		//System.out.println(rowcnt);
		
		for (int i = 1; i<=rowcnt; i++)
		{
			lp.invalidLoginIntoActiTime(fd.getDataFromExcelSheet(ExcelPath, InvalidSheetName, i, 0),
			fd.getDataFromExcelSheet(ExcelPath, InvalidSheetName, i, 1));
		}
	}

}
