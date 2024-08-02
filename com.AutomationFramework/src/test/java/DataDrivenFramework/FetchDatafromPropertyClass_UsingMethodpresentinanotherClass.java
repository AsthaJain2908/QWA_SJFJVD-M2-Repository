package DataDrivenFramework;

import java.io.IOException;

public class FetchDatafromPropertyClass_UsingMethodpresentinanotherClass {
	
	public static void main(String[] args) throws IOException {
		
		Flib lib = new Flib();
		
		String browser = lib.getDataFromProperty("./src/test/resources/CommonData.properties", "Browser");
		
		System.out.println(browser);
	}
}
