package com.comcast.ecommerce.PracticeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class practice {
	
	@Test
	public void sampleTest() throws FileNotFoundException {
	
	FileInputStream fis = new FileInputStream("./Test-Data/ShopperstackData.xlsx");
	try {
		Workbook wb = WorkbookFactory.create(fis);
		int value = wb.getSheet("writeData").getLastRowNum();
		
		System.out.println(value);
		
		
		
		
	} catch (EncryptedDocumentException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	

	
	}
	
	
	
	

	
}
