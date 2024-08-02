package DataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class FetchDatafromExcelClass_UsingMethodpresentinanotherClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		Flib fd = new Flib();
		
		String browser = fd.getDataFromExcelSheet("./src/test/resources/CommonData.properties", "Browser", 1, 0);
		
		System.out.println(browser);

	}

}
