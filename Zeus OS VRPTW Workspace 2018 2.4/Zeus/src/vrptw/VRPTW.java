package vrptw;

import java.util.LinkedList;
import java.util.List;

import edu.sru.thangiah.zeus.core.ZeusProblemInfo;

public class VRPTW 
{
	int numVehicles = 0;
	int numDepots = 0;
	int numCustomers = 0;
	int maxRouteDuration = 0;
	int maxVehicleCapacity = 0;
	public VRPTW()
	{
		VRPTWDepotList depotList = file.getDepotListFromExcel(ZeusProblemInfo.getInputPath() + "C101Data\\c104.xlsx");
		System.out.println(depotList);
	}
}
// end VRPTW class definition