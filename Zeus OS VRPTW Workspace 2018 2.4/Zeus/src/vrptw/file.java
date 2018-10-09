package vrptw;
import edu.sru.thangiah.zeus.core.Settings;
import edu.sru.thangiah.zeus.core.ZeusProblemInfo;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// because java doesn't have partial classes for some inexplicable reason. You did your best Oracle.
public class file {
	private int fileIncrement = 0;
	String filename = ""; 
	XSSFWorkbook workbook;
	private VRPTWShipmentLinkedList shipmentList = new VRPTWShipmentLinkedList();
	private VRPTWDepotList depotList = new VRPTWDepotList();
	public file(String fn)
	{
		filename = fn;
		workbook = getWorkbook(filename);
		getProblemInfoFromExcel();
		getShipmentListFromExcel();
		getDepotListFromExcel();
		System.out.println(fileIncrement);
	}

	private XSSFWorkbook getWorkbook(String filename)
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
	public void getProblemInfoFromExcel()
	{
		XSSFRow row = workbook.getSheetAt(0).getRow(1);
		ZeusProblemInfo.setProbFileName(filename);
		ZeusProblemInfo.setNumDepots((int)row.getCell(3).getNumericCellValue());
		ZeusProblemInfo.setNoOfShips((int)row.getCell(2).getNumericCellValue());
//		ZeusProblemInfo.setNoOfShips((int)row.getCell(2).getNumericCellValue());			  //number of shipments
	}
	
	private void getShipmentListFromExcel()
	{
		
		float et;
		float lt; 
		float st;
		float demand;
		float x;
		float y; 
		int depotnumber;
		//Open the requested file
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row;
		
		for(int i = 3; i <= sheet.getLastRowNum(); i++)
		{
			try {
			row = sheet.getRow(i);
			x = Float.parseFloat(row.getCell(0).toString());
			y = Float.parseFloat(row.getCell(1).toString());
			demand = Float.parseFloat(row.getCell(2).toString());
			depotnumber = (int)Float.parseFloat(row.getCell(3).toString());
			et = Float.parseFloat(row.getCell(4).toString()); 
			lt = Float.parseFloat(row.getCell(5).toString());  
			st = Float.parseFloat(row.getCell(6).toString());  	
			VRPTWShipment a = new VRPTWShipment(x, y, et, lt, st, demand);
			shipmentList.insertShipment(a);
			}
			catch (Exception e)
			{
				fileIncrement = i;
			}
		}
		

	}
	private void getDepotListFromExcel()
	{
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row;
		int x, y, dn;
		VRPTWDepot depot; 
		for(int i = fileIncrement; i <= sheet.getLastRowNum(); i++)
		{
			try {
			row = sheet.getRow(i);
			x = Integer.parseInt(row.getCell(0).toString());
			y = Integer.parseInt(row.getCell(0).toString());
			dn = Integer.parseInt(row.getCell(0).toString());
			depot = new VRPTWDepot(x, y, dn);
			depotList.insertDepotLast(depot);
			
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
	}
}