package POMPackage;

public interface IAutoConstant { 
	
	// Creating Global Variable in interface for BestTest Class = BestTest implements IAutoConstant
	
	
	// Variable from Property File
	String PropPath = "./src/test/resources/CommonData.properties";
	int TimeSeconds = 20; // implicit Wait
	
	// Variable from Excel File
	String ExcelPath = "./src/test/resources/TestData.xlsx";
	String SheetName = "Valid";
	
	// Variable for Invalid Sheet Name
	String InvalidSheetName = "Invalid";

}
