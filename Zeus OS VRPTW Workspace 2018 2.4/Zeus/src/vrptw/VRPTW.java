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
	file f;
	VRPTWShipmentLinkedList mainShipments = new VRPTWShipmentLinkedList();
	VRPTWDepotList mainDepots = new VRPTWDepotList();
	public VRPTW() 
	{
		f = new file(ZeusProblemInfo.getInputPath() + "C101Data\\c104.xlsx");
		mainShipments = f.getShipmentList();
		mainDepots = f.getDepotList();
		//System.out.println(depotList); 
		System.out.println(mainShipments);
		VRPTWUnviableList uvlist = new VRPTWUnviableList(f.getShipArrList(), f.getTruckTypeList(), mainDepots.getVRPHead());
		uvlist.print();
	}
	
}
// end VRPTW class definition
