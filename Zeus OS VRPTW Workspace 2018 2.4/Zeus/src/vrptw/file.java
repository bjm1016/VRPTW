package vrptw;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// because java doesn't have partial classes for some inexplicable reason. You did your best Oracle.
public class file {

	private static XSSFWorkbook getWorkbook(String filename)
	{
		XSSFWorkbook workbook = new XSSFWorkbook();    
		FileInputStream fis;		
		try { 
			fis = new FileInputStream(filename);
			return new XSSFWorkbook(fis);
			
		}
		catch (Exception e) {
			System.out.println("readDataFromExcelFile - "+ filename+" File is not present");
			return new XSSFWorkbook();
		}

	}
	public static VRPTWDepotList getDepotListFromExcel(String filename)
	{
		
		float et;
		float lt; 
		float st;
		float demand;
		float x;
		float y; 
		int depotnumber;
		VRPTWDepotList list = new VRPTWDepotList();
		//Open the requested file
		XSSFWorkbook workbook = new XSSFWorkbook();    
		XSSFSheet sheet = getWorkbook(filename).getSheetAt(0);
		XSSFRow row;
		
		for(int i = 3; i <= sheet.getLastRowNum(); i++)
		{
			row = sheet.getRow(i);
			x = Float.parseFloat(row.getCell(0).toString());
			y = Float.parseFloat(row.getCell(1).toString());
			demand = Float.parseFloat(row.getCell(2).toString());
			depotnumber = (int)Float.parseFloat(row.getCell(3).toString());
			try { et = Float.parseFloat(row.getCell(4).toString()); } catch(Exception e) { et = -1; } 
			try { lt = Float.parseFloat(row.getCell(5).toString()); } catch(Exception e) { lt = -1; } 
			try { st = Float.parseFloat(row.getCell(6).toString()); } catch(Exception e) { st = -1; } 	
			VRPTWDepot a = new VRPTWDepot(x, y, et, lt, st, demand, depotnumber);
			list.addDepot(a);
		}


		return list;
	}
}