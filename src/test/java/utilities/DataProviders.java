package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name="loginData")
	public String [][] getData() throws IOException{
		
		String path = "/Users/aloktiwari/eclipse-workspace/Para_Bank_V1.0/testData/ParaBank_LoginData.xlsx";
		
		ExcelUtility xlutil = new ExcelUtility(path);
		
		int rowCount = xlutil.getRowCount("sheet1");
		int cellCount = xlutil.getCellCount("sheet1", 1);
		
		String data [][] = new String[rowCount][cellCount];
		
		for(int i=1; i<=rowCount; i++) {
			for(int j=0; j<cellCount; j++) {
				data [i-1][j] = xlutil.getCellData("sheet1", i, j);
			}
		}
		
		return data;
	}
}
